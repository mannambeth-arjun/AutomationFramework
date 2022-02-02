package com.extend.global;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommitReader {

    private static final String GITHUB_API_BASE_URL = "https://api.github.com";
    private static final String GITHUB_PROJECT_PATH = "/repos/maruthib093/test-predictor";
    private static final String COMMIT_API = "/commits";


    public List<String> getCommitKeywords(String commit) {
        try {
            RestAssured.baseURI = GITHUB_API_BASE_URL;
            Response response = RestAssured.given()
                    .contentType(ContentType.JSON).log().all()
                    .get(GITHUB_PROJECT_PATH + COMMIT_API + "/" + commit)
                    .then().log().all()
                    .extract().response();
            JsonPath jsonPath = new JsonPath(response.asString());
            System.out.println("Fetching github api response for commit : " + commit);
            String commitMsg = jsonPath.getString("commit.message");
            System.out.println("Fetching commit message : " + commitMsg);
            commitMsg.replaceAll("/n"," ");
            List<String> keywords = new ArrayList<>();
            keywords.addAll(Arrays.asList(commitMsg.split(" ")));
            List<String> list = jsonPath.getList("files.filename");
            System.out.println("Found changes in files : " + list);
            for (String file : list) {
                file = file.split("/")[file.split("/").length - 1];
                keywords.add(file.split("\\.")[0]);
            }
            System.out.println("Final set of commit keywords : " + keywords);
            return keywords;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}

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
        RestAssured.baseURI = GITHUB_API_BASE_URL;
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .get(GITHUB_PROJECT_PATH + COMMIT_API + "/" + commit)
                .then().extract().response();
        JsonPath jsonPath = new JsonPath(response.asString());
        System.out.println("Reading github api response");
        String commitMsg = jsonPath.getString("commit.message");
        List<String> keywords=new ArrayList<>();
        keywords.addAll(Arrays.asList(commitMsg.split(" ")));
        List<String> list = jsonPath.getList("files.filename");
        for(String file:list)
            keywords.add(file.split("\\.")[0]);
        System.out.println(keywords);
        return keywords;
    }

}

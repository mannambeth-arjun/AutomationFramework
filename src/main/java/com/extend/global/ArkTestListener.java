package com.extend.global;

import org.testng.IAlterSuiteListener;
import org.testng.ITestListener;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArkTestListener implements ITestListener, IAlterSuiteListener {

    @Override
    public void alter(List<XmlSuite> suiteList) {
        //String commitMsg = System.getProperty("commitMsg", "");
        String commitId = System.getProperty("commitId");
        if (commitId != null && commitId.length() > 0) {
            List<String> words = new CommitReader().getCommitKeywords(commitId);
            List<String> groupMasterList = Arrays.asList("login", "signup", "payment", "order", "expiry", "plan", "promo", "tax");
            List<String> groups = new ArrayList<>();
            for (String word : words) {
                word = word.toLowerCase();
                if (groupMasterList.contains(word))
                    groups.add(word);
                if(word.equals("superset"))
                    return;
            }
            groups = groups.stream().distinct().collect(Collectors.toList());
            System.out.println("The following impacted test flows have been detected : " + groups);
            for (XmlSuite suite : suiteList) {
                suite.setIncludedGroups(groups);
            }
            System.out.println("Auto triggering test cases for flows : "+ groups);
        }
    }

}

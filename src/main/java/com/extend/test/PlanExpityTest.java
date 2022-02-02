package com.extend.test;

import com.aventstack.extentreports.ExtentTest;
import com.extend.global.BaseTest;
import org.testng.annotations.Test;

public class PlanExpityTest extends BaseTest {

    @Test(groups = {"expiry"})
    public void planExpiryTest1() {
        ExtentTest loginTest = extent.createTest("Plan Expiry Test1");
        loginTest.assignCategory("expiry");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"expiry"})
    public void planExpiryTest2() {
        ExtentTest loginTest = extent.createTest("Plan Expiry Test2");
        loginTest.assignCategory("expiry");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"expiry"})
    public void planExpiryTest3() {
        ExtentTest loginTest = extent.createTest("Plan Expiry Test3");
        loginTest.assignCategory("expiry");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"expiry"})
    public void planExpiryTest4() {
        ExtentTest loginTest = extent.createTest("Plan Expiry Test4");
        loginTest.assignCategory("expiry");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"expiry"})
    public void planExpiryTest5() {
        ExtentTest loginTest = extent.createTest("Plan Expiry Test5");
        loginTest.assignCategory("expiry");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"expiry"})
    public void planExpiryTest6() {
        ExtentTest loginTest = extent.createTest("Plan Expiry Test6");
        loginTest.assignCategory("expiry");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

}

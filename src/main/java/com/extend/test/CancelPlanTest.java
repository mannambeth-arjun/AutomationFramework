package com.extend.test;

import com.aventstack.extentreports.ExtentTest;
import com.extend.global.BaseTest;
import org.testng.annotations.Test;

public class CancelPlanTest extends BaseTest {

    @Test(groups = {"plan"})
    public void cancelPlanTest1() {
        ExtentTest loginTest = extent.createTest("Cancel Plan Test1");
        loginTest.assignCategory("plan");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"plan"})
    public void cancelPlanTest2() {
        ExtentTest loginTest = extent.createTest("Cancel Plan Test2");
        loginTest.assignCategory("plan");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

}

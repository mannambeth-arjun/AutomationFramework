package com.extend.test;

import com.aventstack.extentreports.ExtentTest;
import com.extend.global.BaseTest;
import org.testng.annotations.Test;

public class TaxTest extends BaseTest {

    @Test(groups = {"tax"})
    public void TaxTest1() {
        ExtentTest loginTest = extent.createTest("Tax Test 1");
        loginTest.assignCategory("tax");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"tax"})
    public void TaxTest2() {
        ExtentTest loginTest = extent.createTest("Tax Test 2");
        loginTest.assignCategory("tax");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"tax"})
    public void TaxTest3() {
        ExtentTest loginTest = extent.createTest("Tax Test 3");
        loginTest.assignCategory("tax");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"tax"})
    public void TaxTest4() {
        ExtentTest loginTest = extent.createTest("Tax Test 4");
        loginTest.assignCategory("tax");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }



}

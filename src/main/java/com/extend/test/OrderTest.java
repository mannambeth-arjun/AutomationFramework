package com.extend.test;

import com.aventstack.extentreports.ExtentTest;
import com.extend.global.BaseTest;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {

    @Test(groups = {"order"})
    public void orderTest1() {
        ExtentTest loginTest = extent.createTest("OrderTest1");
        loginTest.assignCategory("order");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"order"})
    public void orderTest2() {
        ExtentTest loginTest = extent.createTest("OrderTest2");
        loginTest.assignCategory("order");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"order"})
    public void orderTest3() {
        ExtentTest loginTest = extent.createTest("OrderTest3");
        loginTest.assignCategory("order");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"order"})
    public void orderTest4() {
        ExtentTest loginTest = extent.createTest("OrderTest4");
        loginTest.assignCategory("order");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

}

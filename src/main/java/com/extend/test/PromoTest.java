package com.extend.test;

import com.aventstack.extentreports.ExtentTest;
import com.extend.global.BaseTest;
import org.testng.annotations.Test;

public class PromoTest extends BaseTest {

    @Test(groups = {"promo"})
    public void PromoTest1() {
        ExtentTest loginTest = extent.createTest("Promo Test 1");
        loginTest.assignCategory("promo");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"promo"})
    public void PromoTest6() {
        ExtentTest loginTest = extent.createTest("Promo Test 6");
        loginTest.assignCategory("promo");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"promo"})
    public void PromoTest2() {
        ExtentTest loginTest = extent.createTest("Promo Test 2");
        loginTest.assignCategory("promo");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"promo"})
    public void PromoTest3() {
        ExtentTest loginTest = extent.createTest("Promo Test 3");
        loginTest.assignCategory("promo");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"promo"})
    public void PromoTest4() {
        ExtentTest loginTest = extent.createTest("Promo Test 4");
        loginTest.assignCategory("promo");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"promo"})
    public void PromoTest5() {
        ExtentTest loginTest = extent.createTest("Promo Test 5");
        loginTest.assignCategory("promo");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

}

package com.extend.test;

import com.aventstack.extentreports.ExtentTest;
import com.extend.global.BaseTest;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {

    @Test(groups = {"payment"})
    public void paymentTest1() {
        ExtentTest signupTest = extent.createTest("PaymentTest1", "Test for payment process.");
        signupTest.assignCategory("payment").createNode("Desc", "Test for payment process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"payment"})
    public void paymentTest2() {
        ExtentTest signupTest = extent.createTest("PaymentTest2", "Test for payment process.");
        signupTest.assignCategory("payment").createNode("Desc", "Test for payment process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"payment"})
    public void paymentTest3() {
        ExtentTest signupTest = extent.createTest("PaymentTest3", "Test for payment process.");
        signupTest.assignCategory("payment").createNode("Desc", "Test for payment process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }


}

package com.extend.test;

import com.aventstack.extentreports.ExtentTest;
import com.extend.global.BaseTest;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest {

    @Test(groups = {"signup"})
    public void signupTest1() {
        ExtentTest signupTest = extent.createTest("SignupTest1", "Test for signupTest process.");
        signupTest.assignCategory("signup").createNode("Desc", "Test for signupTest process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"signup"})
    public void signupTest2() {
        ExtentTest signupTest = extent.createTest("SignupTest2", "Test for signupTest process.");
        signupTest.assignCategory("signup").createNode("Desc", "Test for signupTest process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"signup"})
    public void signupTest3() {
        ExtentTest signupTest = extent.createTest("SignupTest3", "Test for signupTest process.");
        signupTest.assignCategory("signup").createNode("Desc", "Test for signupTest process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"signup"})
    public void signupTest4() {
        ExtentTest signupTest = extent.createTest("SignupTest4", "Test for signupTest process.");
        signupTest.assignCategory("signup").createNode("Desc", "Test for signupTest process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"signup"})
    public void signupTest5() {
        ExtentTest signupTest = extent.createTest("SignupTest5", "Test for signupTest process.");
        signupTest.assignCategory("signup").createNode("Desc", "Test for signupTest process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"signup"})
    public void signupTest6() {
        ExtentTest signupTest = extent.createTest("SignupTest6", "Test for signupTest process.");
        signupTest.assignCategory("signup").createNode("Desc", "Test for signupTest process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"signup"})
    public void signupTest7() {
        ExtentTest signupTest = extent.createTest("SignupTest7", "Test for signupTest process.");
        signupTest.assignCategory("signup").createNode("Desc", "Test for signupTest process.");

        signupTest.info("step1");
        signupTest.info("step2");
        signupTest.info("step3");
        signupTest.info("step4");
        signupTest.pass("step5");
        extent.flush();
    }


}

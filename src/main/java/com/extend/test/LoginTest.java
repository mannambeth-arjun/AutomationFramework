package com.extend.test;

import com.aventstack.extentreports.ExtentTest;
import com.extend.global.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(groups = {"login"})
    public void loginTest1(){
        ExtentTest loginTest = extent.createTest("LoginTest1", "Test for login process.");
        loginTest.assignCategory("login").createNode("Desc","Test for login process.");

        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        AssertionError login_failed = new AssertionError("Login failed");
        loginTest.fail(login_failed);
        extent.flush();
        throw login_failed;
    }

    @Test(groups = {"login"})
    public void loginTest2(){
        ExtentTest loginTest = extent.createTest("LoginTest2");
        loginTest.assignCategory("login");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }
    @Test(groups = {"login"})
    public void loginTest3(){
        ExtentTest loginTest = extent.createTest("LoginTest3");
        loginTest.assignCategory("login");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"login"})
    public void loginTest4(){
        ExtentTest loginTest = extent.createTest("LoginTest4");
        loginTest.assignCategory("login");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }

    @Test(groups = {"login"})
    public void loginTest5(){
        ExtentTest loginTest = extent.createTest("LoginTest5");
        loginTest.assignCategory("login");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }


}

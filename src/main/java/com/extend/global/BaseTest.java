package com.extend.global;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public static ExtentReports extent;

//    @BeforeSuite
//    public static void beforeSuite()
   {
       System.out.println("Executing before suite");
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/reports/index.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("MyReport");
        extent.attachReporter(spark);
    }

}

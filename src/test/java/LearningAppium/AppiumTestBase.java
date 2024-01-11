package LearningAppium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppiumTestBase {
    private static ExtentReports extentReports;
    private static ExtentTest extentTest;

    @BeforeSuite
    public void setUp() {
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("path/to/your/report.html");
        ExtentSparkReporter sparkReporter  = new ExtentSparkReporter("path/target/report.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter );
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());

        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(Status.FAIL, "Test Case Failed: " + result.getName());
            // Add screenshot capture code here if needed
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(Status.PASS, "Test Case Passed: " + result.getName());
        } else {
            extentTest.log(Status.SKIP, "Test Case Skipped: " + result.getName());
        }
    }

    @AfterSuite
    public void tearDownSuite() {
        extentReports.flush();
    }
}


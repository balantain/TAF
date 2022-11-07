package utils;

import com.epam.reportportal.testng.ReportPortalTestNGListener;
import driver.DriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestResult;

@Log4j2
public class ReportPortalTestListener extends ReportPortalTestNGListener {
    @Override
    public void onTestStart(ITestResult testResult) {
        super.onTestStart(testResult);
        log.info("RP_MESSAGE#BASE64#{}", "onTestStart " + testResult.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult testResult) {
        super.onTestSuccess(testResult);
        log.info("RP_MESSAGE#BASE64#{}", "onTestSuccess " + testResult.getTestName() );
    }

    @Override
    public void onTestFailure(ITestResult testResult) {
        super.onTestFailure(testResult);
        log.info("RP_MESSAGE#BASE64#{}#{}",
                ((TakesScreenshot) DriverManager
                        .getDriver())
                        .getScreenshotAs(OutputType.BASE64),
                "TEST " + testResult.getName() + " FAILED");
    }
}

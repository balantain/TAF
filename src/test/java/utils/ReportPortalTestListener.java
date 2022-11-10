package utils;

import com.epam.reportportal.testng.ReportPortalTestNGListener;
import driver.DriverManager;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

@Log4j2
public class ReportPortalTestListener extends ReportPortalTestNGListener {
//    private Logger log = LogManager.getRootLogger();
    @Override
    public void onTestStart(ITestResult testResult) {
        super.onTestStart(testResult);
        log.info("ReportPortalTestListener - onTestStart()");
    }

    @Override
    public void onTestSuccess(ITestResult testResult) {
        super.onTestSuccess(testResult);
        log.info("ReportPortalTestListener - onTestSuccess()");
    }

    @Override
    public void onTestFailure(ITestResult testResult) {
        log.debug("RP_MESSAGE#BASE64#{}#{}",
                ((TakesScreenshot) DriverManager
                        .getDriver())
                        .getScreenshotAs(OutputType.BASE64),
                "TEST " + testResult.getName() + " FAILED");
        super.onTestFailure(testResult);
    }
}

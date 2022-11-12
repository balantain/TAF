package utils;

import driver.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        File screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(screenshot, new File(".//target/screenshots/testFail.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ITestListener.super.onTestFailure(result);
    }
}

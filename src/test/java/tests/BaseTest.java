package tests;

import driver.DriverManager;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import utils.ReportPortalTestListener;

@Log4j2
@Listeners(ReportPortalTestListener.class)
public class BaseTest {
    protected WebDriver driver;
//    protected final Logger log = LogManager.getRootLogger();

    @BeforeTest
    public void initDriver() {
        log.info("BeforeTest - initDriver");
        driver = DriverManager.getDriver();
    }

    @AfterTest
    public void closeDriver() {
        log.info("AfterTest - closeDriver");
        DriverManager.closeDriver();
    }


}

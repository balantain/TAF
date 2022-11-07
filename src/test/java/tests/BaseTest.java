package tests;

import driver.DriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
@Log4j2
public class BaseTest {
    protected WebDriver driver;

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

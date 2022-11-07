package pages;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected WebDriver driver;
    protected abstract AbstractPage openPage();
    protected final int DEFAULT_WAIT_TIMEOUT_SECONDS = 10;

    public AbstractPage(WebDriver driver) {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
}

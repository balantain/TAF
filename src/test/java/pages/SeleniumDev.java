package pages;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Log4j2
public class SeleniumDev extends AbstractPage {
    private final String SELENIUM_DEV_URL = "https://www.selenium.dev/";

    public SeleniumDev(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.selenium")
    private WebElement moreNews;

    @Override
    public SeleniumDev openPage() {
        driver.get(SELENIUM_DEV_URL);
        log.info("Driver open page " + SELENIUM_DEV_URL);
        return this;
    }

    public SeleniumDevBlog clickMoreNewsLink() {
        moreNews.click();
        return new SeleniumDevBlog(driver);
    }
}

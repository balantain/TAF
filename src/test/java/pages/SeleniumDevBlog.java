package pages;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class SeleniumDevBlog extends AbstractPage{

    @FindBy(css = ".col-12>h2")
    private WebElement title;

    public SeleniumDevBlog(WebDriver driver) {
        super(driver);
        log.info("SeleniumDevBlog page is created");
    }

    @Override
    protected AbstractPage openPage() {
        return null;
    }

    public WebElement getTitle() {
        return title;
    }
}

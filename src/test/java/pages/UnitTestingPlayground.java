package pages;

import org.openqa.selenium.WebDriver;

public class UnitTestingPlayground extends AbstractPage{
    private final String URL = "http://uitestingplayground.com/";



    public UnitTestingPlayground(WebDriver driver) {
        super(driver);
    }

    @Override
    protected UnitTestingPlayground openPage() {
        driver.get(URL);
        return this;
    }
}
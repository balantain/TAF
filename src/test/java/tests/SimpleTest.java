package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SeleniumDev;
import utils.ReportPortalTestListener;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class SimpleTest extends BaseTest{

    @Test
    public void testSelenium() {
        String title = new SeleniumDev(driver)
                .openPage()
                .clickMoreNewsLink()
                .getTitle()
                .getText();
        assertThat(title).isEqualTo("Posts in 2022!");
    }
}

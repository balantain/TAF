package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SeleniumDev;
import utils.ReportPortalTestListener;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class SimpleTest extends BaseTest{

    @Test
    public void testShouldFail() {
        String title = new SeleniumDev(driver)
                .openPage()
                .clickMoreNewsLink()
                .getTitle()
                .getText();
        assertThat(title).isEqualTo("Posts in 2022!");
    }

    @Test
    public void testShouldPass(){
        String title = new SeleniumDev(driver)
                .openPage()
                .clickMoreNewsLink()
                .getTitle()
                .getText();
        assertThat(title).isEqualTo("Posts in 2022");
    }
}

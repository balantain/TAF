package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static WebDriver driver;
//    To use special driver versions they can be downloaded to the path src/main/resources/drivers/
//    in this case need to uncomment next lines:
//    1)
//    private static final String DRIVERS_PATH = "src\\main\\resources\\drivers\\";

    public static WebDriver getDriver() {
        if (driver == null){
            switch (System.getProperty("browser", "chrome")) {
                case "firefox":
//                    2) to use firefox driver:
//                    System.setProperty("webdriver.gecko.driver", DRIVERS_PATH + "geckodriver.exe");
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
//                    3) to use Chrome driver
//                    System.setProperty("webdriver.chrome.driver", DRIVERS_PATH + "chromedriver.exe");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }

    public static void deleteCookies() {
        driver.manage().deleteAllCookies();
    }
}

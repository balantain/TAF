package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static WebDriver driver;
//    private static final String DRIVERS_PATH = "src\\main\\resources\\drivers\\";

    public static WebDriver getDriver() {
        if (driver == null){
            switch (System.getProperty("browser", "chrome")) {
                case "firefox":
//                    System.setProperty("webdriver.gecko.driver", DRIVERS_PATH + "geckodriver.exe");
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
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

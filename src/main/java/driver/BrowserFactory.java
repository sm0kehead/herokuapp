package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {

    public static WebDriver getBrowser(BrowserType browserType ){
        switch(browserType) {
        case CHROME:
            System.setProperty("webdriver.chrome.driver", "E:\\Tests\\herokuapp\\src\\main\\resources\\chromedriver.exe");
            return new ChromeDriver();
        case FIREFOX:
            System.setProperty("webdriver.gecko.driver", "E:\\Tests\\herokuapp\\src\\main\\resources\\geckodriver.exe");
            return new FirefoxDriver();
        case IE:
            System.setProperty("webdriver.ie.driver", "E:\\Tests\\herokuapp\\src\\main\\resources\\msedgedriver.exe");
            return new InternetExplorerDriver();
        default:
            throw new IllegalStateException("Unknown browser type! Plwase check your configuration");
        }
    }
}

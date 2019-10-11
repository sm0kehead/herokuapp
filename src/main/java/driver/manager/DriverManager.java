package driver.manager;

import driver.BrowserFactory;
import driver.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static BrowserType BROWSER_TYPE = BrowserType.CHROME;
    private static WebDriver driver;

    public DriverManager() {
    }

    public static WebDriver getWebDriver(){
        if (driver==null){
//            System.setProperty("webdriver.chrome.driver", "E:\\Tests\\herokuapp\\src\\main\\resources\\chromedriver.exe");
//            driver = new ChromeDriver();
            driver = BrowserFactory.getBrowser(BROWSER_TYPE);
        }
        return driver;
    }

    public static void disposeDriver(){
        driver.close();
//        driver.quit();
//        driver = null;
        if(!BROWSER_TYPE.equals(BrowserType.FIREFOX)){
            driver.quit();
        }
        driver = null;
    }
}

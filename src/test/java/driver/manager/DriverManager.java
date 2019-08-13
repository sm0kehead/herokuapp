package driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    public DriverManager() {
    }

    public static WebDriver getWebDriver(){
        if (driver==null){
            System.setProperty("webdriver.chrome.driver", "E:\\Tests\\herokuapp\\src\\test\\java\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        driver.quit();
        driver = null;
    }
}

package driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
   // private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage("http://the-internet.herokuapp.com");
        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
       // driver = new ChromeDriver();
        //driver.navigate().to("http://the-internet.herokuapp.com");
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.disposeDriver();
        //driver.close();
        //driver.quit();
    }
}

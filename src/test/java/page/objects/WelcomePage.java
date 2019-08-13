package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class WelcomePage {


    public WelcomePage() {
        PageFactory.initElements(DriverManager.getWebDriver(),this);

    }

    Logger logger = LogManager.getRootLogger();

    @FindBy(css = "ul>li>a[href*='add_remove_elements']")// //a[contains(text(), 'Add/Remove')]
    private WebElement addRemoveElementsLink;





    public void clickAddRemoveElements(){
        addRemoveElementsLink.click();
        logger.info("Clicked on Add/Remove ELements Link");

    }


}

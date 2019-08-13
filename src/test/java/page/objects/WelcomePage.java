package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import waits.WaitForElement;

public class WelcomePage {


    public WelcomePage() {
        PageFactory.initElements(DriverManager.getWebDriver(),this);

    }

    Logger logger = LogManager.getRootLogger();

    @FindBy(css = "ul>li>a[href*='add_remove_elements']")// //a[contains(text(), 'Add/Remove')]
    private WebElement addRemoveElementsLink;

    @FindBy(css = "a[href*='/dropdown']")
    private WebElement dropdown;





    public void clickAddRemoveElements(){
        WaitForElement.waitUntilElementsIsClickable(addRemoveElementsLink);
        addRemoveElementsLink.click();
        logger.info("Clicked on Add/Remove ELements Link");

    }
    public void clickDropdown(){
        WaitForElement.waitUntilElementsIsClickable(dropdown);
        dropdown.click();
        logger.info("Clicked Dropdown link");
    }


}

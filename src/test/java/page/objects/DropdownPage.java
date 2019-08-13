package page.objects;

import driver.manager.DriverManager;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import waits.WaitForElement;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.List;


public class DropdownPage {
    Logger logger = LogManager.getRootLogger();

    public DropdownPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Dropdown List')]")
    private WebElement header;

    @FindBy(css = "select[id='dropdown']")
    private WebElement optionsDropdown;



    public void printAndAssertDropdownOptions(){
        WaitForElement.waitUntilElementsIsClickable(optionsDropdown);
        Select optionDropdown = new Select(optionsDropdown);

        List<WebElement> allOptions = optionDropdown.getOptions();
        List<String> nameOfOptions = new ArrayList<String>();

        for(WebElement option:allOptions){
            nameOfOptions.add(option.getText());
            System.out.println(option.getText());

        }
        logger.info("Got list of options");

        List<String> expectedNameOfOptions = new ArrayList<String>();
        expectedNameOfOptions.add("Please select an option");
        expectedNameOfOptions.add("Option 1");
        expectedNameOfOptions.add("Option 2");
        Assert.assertEquals(nameOfOptions, expectedNameOfOptions);

        logger.info("All options asserted");



    }
    public void selecetOption(){
        WaitForElement.waitUntilElementsIsClickable(optionsDropdown);
        Select option = new Select(optionsDropdown);

        option.selectByValue("1");
        logger.info("Selected value '1' option");
    }

    public void assertHeader(){
        WaitForElement.waitUntilElementsIsVisible(header);
        header.getTagName();
        System.out.println(header);
        //Assert.assertEquals(header,"Dropdown List");
    }
}

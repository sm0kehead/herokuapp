package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import waits.WaitForElement;

import java.util.List;
import java.util.Random;


public class AddRemoveElementsPage {
    Logger logger = LogManager.getRootLogger();

    public AddRemoveElementsPage() {
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    @FindBy(css = "div>button[onclick='addElement()']")
    private WebElement addElementButton;

    @FindBy(css = "div[id='content']>h3")
    private WebElement pageTitle;

    @FindBy(css="div[id='elements']")
    private WebElement elementsList;

    @FindBy(css="div[id='elements']>button")
    private WebElement deleteButton;

    @Step("Check if Page Title is correct as expected {pageTitle}")
    public AddRemoveElementsPage assertPageTitle(String expectedPageTitle){
        WaitForElement.waitUntilElementsIsVisible(pageTitle);
        String getPageTitle = pageTitle.getText();
        System.out.println(pageTitle);
        Assert.assertEquals(getPageTitle, expectedPageTitle);
        logger.info("Correct assert of Page Title");
        return this;
    }
    public AddRemoveElementsPage clickAddElementButton() throws InterruptedException {
        WaitForElement.waitUntilElementsIsClickable(addElementButton);

        Random rg = new Random();
        for (int idx = 1; idx == 1; ++idx){
            int randomInt = rg.nextInt(10);
//            if(randomInt==0){
//                idx++;
            System.out.println("Generated : " + randomInt);

            while(randomInt>0){
            addElementButton.click();
            System.out.println("Button"+randomInt+" added");
            randomInt--;
        }
//            }

        }
//        int i = 1;
//        while(i<=5){
//            addElementButton.click();
//            System.out.println("Button"+i+" added");
//            i++;
//        }
        System.out.println("All button added");


        logger.info("Successful buttons addition");
        return this;
    }



    public AddRemoveElementsPage deleteList(){
        List<WebElement> deleteButtons = DriverManager.getWebDriver().findElements(By.cssSelector("div[id='elements'] button"));
        int deleteButtonsCount = deleteButtons.size();
        System.out.println("Delete Buttons Number is: "+deleteButtonsCount);
        //int i=deleteButtonsCount;

        while(deleteButtonsCount>=1){
            deleteButton.click();
            System.out.println("Button"+deleteButtonsCount+" deletion");
            deleteButtonsCount--;
        }
        System.out.println("Successful button deletion");
        return this;
    }
}

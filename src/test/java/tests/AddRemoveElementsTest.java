package tests;

import driver.manager.TestBase;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import page.objects.WelcomePage;

public class AddRemoveElementsTest extends TestBase {





    @Test
    @Description("The goal of this test is to check if Page title is displayed correctly, and if system add and close same amount of buttons ")
    public void addRemoveElements() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage
                .clickAddRemoveElementsPage()
                .clickAddElementButton()
                .assertPageTitle("Add/Remove Elements")
                .deleteList();


//        WelcomePage welcomePage = new WelcomePage();
//        welcomePage.clickAddRemoveElements();
//
//        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();
//        addRemoveElementsPage.clickAddElementButton();
//        addRemoveElementsPage.assertPageTitle("Add/Remove Elements");
//        addRemoveElementsPage.deleteList();


    }
}

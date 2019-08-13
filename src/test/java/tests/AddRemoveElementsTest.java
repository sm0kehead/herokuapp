package tests;

import driver.manager.DriverManager;
import driver.manager.TestBase;
import org.testng.annotations.Test;
import page.objects.AddRemoveElementsPage;
import page.objects.WelcomePage;

public class AddRemoveElementsTest extends TestBase {





    @Test
    public void addRemoveElements() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickAddRemoveElements();

        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();
        addRemoveElementsPage.clickAddElementButton();
        addRemoveElementsPage.assertPageTitle("Add/Remove Elements");
        addRemoveElementsPage.deleteList();


    }
}

package tests;

import driver.manager.TestBase;
import org.testng.annotations.Test;
import page.objects.WelcomePage;

public class DropdownTest extends TestBase {

    @Test
    public void dropdownTest(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage
                .clickDropdownPage()
                .assertHeader()
                .printAndAssertDropdownOptions()
                .selecetOption();
//        welcomePage.clickDropdown();
//
//        DropdownPage dropdownPage = new DropdownPage();
//        dropdownPage.assertHeader();
//        dropdownPage.printAndAssertDropdownOptions();
//        dropdownPage.selecetOption();
    }
}

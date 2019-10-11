package tests;
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
public class SilniaNormal{


        private static int silnia(int n) {
        int iloczyn = 1;

        for(int i=1; i <= n; i++) {
            iloczyn =iloczyn * i;
        }
        return iloczyn;
    }
    public static void main(String[] args) {
    int y = 6;
        System.out.println(silnia(y));
    }
}



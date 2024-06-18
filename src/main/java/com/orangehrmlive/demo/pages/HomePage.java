package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement adminTab;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logo;


    public void clickOnAdminTab() {
        clickOnElement(adminTab);
        Reporter.log("click on " + adminTab);
        CustomListeners.test.log(Status.PASS, "click on " + adminTab);
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }


}

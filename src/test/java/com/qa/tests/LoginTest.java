package com.qa.tests;

import com.qa.framework.DriverFactory;
import com.qa.pages.InventoryPage;
import com.qa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.createDriver();
    }

    @Test
    public void validLoginShouldOpenInventory() {
        new LoginPage(driver).open().login("standard_user", "secret_sauce");
        Assert.assertTrue(new InventoryPage(driver).isLoaded());
    }

    @Test
    public void invalidLoginShouldShowError() {
        LoginPage login = new LoginPage(driver).open();
        login.login("invalid_user", "wrong_password");
        Assert.assertTrue(login.isErrorDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}

package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithInvalidCredentials() {
        driver.get("https://eyouthlearning.com/login");
        new LoginPage(driver).login("wrong", "wrong");
        Assert.assertTrue(driver.getPageSource().contains("خطأ"));
    }

    @Test
    public void loginWithEmptyFields() {
        driver.get("https://eyouthlearning.com/login");
        driver.findElement(org.openqa.selenium.By.cssSelector("button[type='submit']")).click();
        Assert.assertTrue(driver.getPageSource().contains("مطلوب"));
    }
}


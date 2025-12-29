package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class RegisterTest extends BaseTest {

    @Test
    public void openRegisterPage() {
        new HomePage(driver).clickJoinUs();
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
    }

    @Test
    public void registerWithEmptyUsername() {
        driver.get("https://eyouthlearning.com/signup");
        new RegisterPage(driver).registerWithoutUsername();
        Assert.assertTrue(driver.getPageSource().contains("اسم المستخدم مطلوب"));
    }
}

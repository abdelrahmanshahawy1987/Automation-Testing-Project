package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTest extends BaseTest {

    @Test
    public void searchWithValidKeyword() {
        new HomePage(driver).search("البنك إلى كيف تنضم");
        Assert.assertTrue(driver.getTitle().contains("البنك"));
    }
}


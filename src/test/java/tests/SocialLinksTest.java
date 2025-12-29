package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;

public class SocialLinksTest extends BaseTest {

    @Test
    public void verifyFacebookLink() {
        new FooterPage(driver).clickFacebook();
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"));
    }

    @Test
    public void verifyLinkedInLink() {
        new FooterPage(driver).clickLinkedIn();
        Assert.assertTrue(driver.getCurrentUrl().contains("linkedin.com"));
    }

    @Test
    public void verifyInstagramLink() {
        String parent = driver.getWindowHandle();
        new FooterPage(driver).clickInstagram();

        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(parent)) driver.switchTo().window(tab);
        }
        Assert.assertTrue(driver.getCurrentUrl().contains("instagram.com"));
    }
}

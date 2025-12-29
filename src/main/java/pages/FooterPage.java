package pages;

import org.openqa.selenium.*;

public class FooterPage {

    WebDriver driver;

    By facebook = By.cssSelector("a[href*='facebook']");
    By linkedin = By.cssSelector("a[href*='linkedin']");
    By instagram = By.cssSelector("a[href*='instagram']");

    public FooterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFacebook() { driver.findElement(facebook).click(); }
    public void clickLinkedIn() { driver.findElement(linkedin).click(); }
    public void clickInstagram() { driver.findElement(instagram).click(); }
}

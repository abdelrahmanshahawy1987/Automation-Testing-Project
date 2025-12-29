package pages;

import org.openqa.selenium.*;

public class RegisterPage {

    WebDriver driver;

    By email = By.id("email");
    By password = By.id("password");
    By submit = By.cssSelector("button[type='submit']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registerWithoutUsername() {
        driver.findElement(email).sendKeys("test@test.com");
        driver.findElement(password).sendKeys("123456");
        driver.findElement(submit).click();
    }
}

package pages;

import org.openqa.selenium.*;

public class CourseDetailsPage {

    WebDriver driver;

    By aboutSection = By.xpath("//*[contains(text(),'حول الدورة التدريبية')]");
    By subscribeBtn = By.xpath("//button[contains(text(),'اشترك')]");

    public CourseDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAboutDisplayed() {
        return driver.findElement(aboutSection).isDisplayed();
    }

    public void subscribe() {
        driver.findElement(subscribeBtn).click();
    }
}


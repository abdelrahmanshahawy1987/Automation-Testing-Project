package pages;

import org.openqa.selenium.*;

public class HomePage {

    WebDriver driver;

    By searchInput = By.name("s");
    By searchBtn = By.cssSelector("button[type='submit']");
    By allCourses = By.xpath("//a[contains(text(),'جميع الدورات')]");
    By joinUs = By.xpath("//a[contains(text(),'انضم')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String keyword) {
        driver.findElement(searchInput).sendKeys(keyword);
        driver.findElement(searchBtn).click();
    }

    public void openAllCourses() {
        driver.findElement(allCourses).click();
    }

    public void clickJoinUs() {
        driver.findElement(joinUs).click();
    }
}


package pages;

import org.openqa.selenium.*;

public class CoursesPage {

    WebDriver driver;
    By courseCards = By.cssSelector(".course-card");

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openAnyCourse() {
        driver.findElements(courseCards).get(0).click();
    }

    public WebElement getFirstCourseCard() {
        return driver.findElements(courseCards).get(0);
    }
}



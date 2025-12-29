package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CourseCardUITest extends BaseTest {

    @Test
    public void verifyCourseCardUI() {
        new HomePage(driver).openAllCourses();
        WebElement card = new CoursesPage(driver).getFirstCourseCard();

        Assert.assertTrue(card.findElement(org.openqa.selenium.By.tagName("img")).isDisplayed());
        Assert.assertTrue(card.getText().length() > 0);
        Assert.assertTrue(card.findElement(org.openqa.selenium.By.tagName("button")).isDisplayed());
    }
}

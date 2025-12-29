package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class EndToEndTest extends BaseTest {

    @Test
    public void endToEndScenario() {
        driver.get("https://eyouthlearning.com/login");
        new LoginPage(driver).login("valid@email.com", "validPassword");

        new HomePage(driver).openAllCourses();
        new CoursesPage(driver).openAnyCourse();
        new CourseDetailsPage(driver).subscribe();

        Assert.assertTrue(driver.getPageSource().contains("دوراتي"));
    }
}


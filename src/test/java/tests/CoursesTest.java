package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CoursesTest extends BaseTest {

    @Test
    public void openCourseDetails() {
        HomePage home = new HomePage(driver);
        home.openAllCourses();

        CoursesPage courses = new CoursesPage(driver);
        courses.openAnyCourse();

        CourseDetailsPage details = new CourseDetailsPage(driver);
        Assert.assertTrue(details.isAboutDisplayed());
    }
}


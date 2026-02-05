package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestActivity7 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Set GeckoDriver path if needed
        // System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void countAllCourses() {

        // Step 1: Open LMS homepage
        driver.get("https://alchemy.hguy.co/lms");

        // Step 2: Click "All Courses" in the navigation bar
        WebElement allCoursesLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("All Courses")
        ));
        allCoursesLink.click();

        // Step 3: Wait for the course grid to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.ld_course_grid")
        ));

        // Step 4: Find all courses in the grid
        List<WebElement> courses = driver.findElements(
                By.cssSelector("div.ld_course_grid > div")
        );

        // Step 5: Print the number of courses
        System.out.println("Number of courses on the page: " + courses.size());
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

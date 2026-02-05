package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestActivity4 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set GeckoDriver path if not added to system PATH
        // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifySecondMostPopularCourseTitle() {

        // Find all course titles
        List<WebElement> courseTitles = driver.findElements(
                By.xpath("//h3[@class='entry-title']")
        );

        // Get second course title (index starts from 0)
        String actualTitle = courseTitles.get(1).getText();

        String expectedTitle = "Email Marketing Strategies";

        // Assertion
        Assert.assertEquals(
                actualTitle,
                expectedTitle,
                "Second most popular course title does not match!"
        );

        System.out.println("Verified successfully: " + actualTitle);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
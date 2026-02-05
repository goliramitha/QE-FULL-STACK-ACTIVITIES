package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {

    WebDriver driver;
    String expectedTitle = "Alchemy LMS – An LMS Application";

    @BeforeClass
    public void setUp() {
        System.out.println("Test setup started...");
        // If GeckoDriver is not in PATH, set it here
        // System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void verifyWebsiteTitle() {
        driver.get("https://alchemy.hguy.co/lms");
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);

        // Assertion
        Assert.assertEquals(
                actualTitle,
                expectedTitle,
                "Website title does not match!"
        );
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Closing browser...");
        driver.quit();
    }
}

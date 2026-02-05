package Project;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {

    WebDriver driver;
    String expectedHeading = "Learn from Industry Experts";

    @BeforeClass
    public void setUp() {
        // If GeckoDriver is not in PATH, set it here
        // System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void verifyHeadingText() {
        driver.get("https://alchemy.hguy.co/lms");

        // Locate the main heading (h1)
        String actualHeading = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Actual Heading: " + actualHeading);

        // Verify heading text
        Assert.assertEquals(
                actualHeading,
                expectedHeading,
                "Website heading does not match!"
        );
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

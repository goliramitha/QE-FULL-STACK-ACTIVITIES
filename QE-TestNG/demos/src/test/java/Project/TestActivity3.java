package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {

    WebDriver driver;
    String expectedTitle = "Actionable Training";

    @BeforeClass
    public void setUp() {
        // If GeckoDriver is not in PATH, set it here
        // System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void verifyFirstInfoBoxTitle() {
        driver.get("https://alchemy.hguy.co/lms");

        // Locate the first info box title (h3)
        String actualTitle = driver
                .findElement(By.xpath("(//h3)[1]"))
                .getText();

        System.out.println("First Info Box Title: " + actualTitle);

        // Verify title text
        Assert.assertEquals(
                actualTitle,
                expectedTitle,
                "First info box title does not match!"
        );
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

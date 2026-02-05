package Project;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestActivity5 {

    WebDriver driver;
    WebDriverWait wait;
    String expectedTitle = "My Account – Alchemy LMS"; // Update if title is different

    @BeforeClass
    public void setUp() {
        // Set GeckoDriver path if needed
        // System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void navigateToMyAccountPage() {

        // Step 1: Open LMS homepage
        driver.get("https://alchemy.hguy.co/lms");

        // Step 2: Wait for navigation bar to be visible
        WebElement navBar = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("menu-item-1507") // Example ID; will confirm below
        ));

        // Step 3: Click “My Account”
        WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
        myAccountLink.click();

        // Step 4: Wait for the My Account page to load and verify title
        wait.until(ExpectedConditions.titleContains("My Account"));
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle,
                "You are not on the correct My Account page!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}




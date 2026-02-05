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

public class TestActivity6 {

    WebDriver driver;
    WebDriverWait wait;

    String username = "root";
    String password = "pa$$w0rd";

    @BeforeClass
    public void setUp() {
        // Set GeckoDriver path if needed
        // System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");

        // Open Firefox browser
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void loginTest() {

        // Step 1: Open LMS homepage
        driver.get("https://alchemy.hguy.co/lms");

        // Step 2: Click "My Account" from navigation bar
        WebElement myAccountLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("My Account")
        ));
        myAccountLink.click();

        // Step 3: Verify page title
        wait.until(ExpectedConditions.titleContains("My Account"));
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        Assert.assertTrue(pageTitle.contains("My Account"), "Not on the My Account page!");

        // Step 4: Click "Login" button
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Login']") // login link/button
        ));
        loginButton.click();

        // Step 5: Enter username
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("user_login")
        ));
        usernameField.sendKeys(username);

        // Step 6: Enter password
        WebElement passwordField = driver.findElement(By.id("user_pass"));
        passwordField.sendKeys(password);

        // Step 7: Click login
        WebElement submitButton = driver.findElement(By.id("wp-submit"));
        submitButton.click();

        // Step 8: Verify login success by checking for "Logout" link
        WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.linkText("Logout")
        ));
        Assert.assertTrue(logoutLink.isDisplayed(), "Login failed!");

        System.out.println("Login successful!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

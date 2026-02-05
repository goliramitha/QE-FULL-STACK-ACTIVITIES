package demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestActivity9 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/alerts");
    }

    // 🔑 VERY IMPORTANT
    @BeforeMethod
    public void resetPage() {
        driver.navigate().refresh();
        driver.switchTo().defaultContent();
    }

    @Test
    public void simpleAlertTestCase() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("simple"))).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        System.out.println("Simple Alert: " + text);

        Assert.assertTrue(text.length() > 0);
        alert.accept();
    }

    @Test
    public void confirmAlertTestCase() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmation"))).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        System.out.println("Confirm Alert: " + text);

        Assert.assertTrue(text.length() > 0);
        alert.dismiss();
    }

    @Test
    public void promptAlertTestCase() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("prompt"))).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("TestNG");
        String text = alert.getText();
        System.out.println("Prompt Alert: " + text);

        Assert.assertTrue(text.length() > 0);
        alert.accept();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
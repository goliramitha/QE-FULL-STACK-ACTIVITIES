package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity2 {
    public static void main(String[] args) {
        // Optional: Set Firefox in headless mode (browser runs in background)
        FirefoxOptions options = new FirefoxOptions();
        // options.addArguments("--headless"); // Uncomment if you want headless

        // Launch Firefox browser
        WebDriver driver = new FirefoxDriver(options);

        try {
            // 1. Open the login page
            driver.get("https://training-support.net/webelements/login-form");

            // 2. Print the page title
            System.out.println("Page Title: " + driver.getTitle());

            // 3. Find username field and enter "admin"
            driver.findElement(By.id("username")).sendKeys("admin");

            // 4. Find password field and enter "password"
            driver.findElement(By.id("password")).sendKeys("password");

            // 5. Find and click the "Log in" button
            driver.findElement(By.xpath("//button[text()='Log in']")).click();

            // 6. Wait until the login confirmation message appears
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement message = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))
            );

            // Print the login confirmation message
            System.out.println("Login Message: " + message.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7. Close the browser
            driver.quit();
        }
    }
}

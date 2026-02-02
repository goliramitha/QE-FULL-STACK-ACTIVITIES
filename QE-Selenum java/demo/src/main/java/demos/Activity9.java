package demos;

public class Activity9 {
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/keyboard-events");

        System.out.println("Page Title: " + driver.getTitle());

        // Click body to give focus
        WebElement body = driver.findElement(By.tagName("body"));
        body.click();

        Actions actions = new Actions(driver);
        String message = "Hello from Selenium Firefox";

        // Send keys using Actions (important for Firefox)
        actions.sendKeys(message).perform();

        System.out.println("Typed Message: " + message);

        Thread.sleep(2000);
        driver.quit();
    }
}



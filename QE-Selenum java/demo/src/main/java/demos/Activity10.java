import demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

    public static void main(String[] args) throws InterruptedException {

        // Set GeckoDriver path
        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://training-support.net/webelements/drag-drop");
        System.out.println("Page Title: " + driver.getTitle());

        Actions actions = new Actions(driver);

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        // Drag to Dropzone 1
        actions.clickAndHold(ball)
               .moveToElement(dropzone1)
               .release()
               .perform();

        Thread.sleep(1000);
        System.out.println("Dropzone 1 Text: " + dropzone1.getText());

        // Drag to Dropzone 2
        actions.clickAndHold(ball)
               .moveToElement(dropzone2)
               .release()
               .perform();

        Thread.sleep(1000);
        System.out.println("Dropzone 2 Text: " + dropzone2.getText());

        driver.quit();
    }
}

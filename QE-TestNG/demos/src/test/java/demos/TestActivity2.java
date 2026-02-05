package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestActivity2 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void testCase1() {
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }

    @Test
    public void testCase2() {

        WebElement blackButton = driver.findElement(By.cssSelector(".black"));
        Assert.assertEquals(blackButton.getText(), "This will cause an error!");
    }

    @Test(enabled = false)
    public void testCase4() {
        System.out.println("This test will not run at all.");
    }

    @Test
    public void testCase3() {
        throw new SkipException("Skipping this test case purposefully.");
    }

    @AfterMethod 
    public void afterMethod() {
        System.out.println("Finished a test case.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
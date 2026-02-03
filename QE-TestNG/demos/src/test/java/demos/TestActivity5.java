package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5 {

    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");
    }

    @Test(groups = {"header"})
    public void head3() {
        WebElement ele = driver.findElement(By.xpath("//h3[@class='text-3xl font-bold text-orange-600']"));
        String st = ele.getText();
        Assert.assertEquals(st, "Heading #3");

    }

    @Test(groups = {"header"})
    public void head5() {
        WebElement ele2 = driver.findElement(By.xpath("//h5[text()='Heading #5']"));
        //System.out.println(ele2.getCssValue("color"));
        Assert.assertEquals(ele2.getCssValue("color"), "rgb(147, 51, 234)");
    }

    @Test(groups = {"button"})
    public void but1() {
        WebElement bu1 = driver.findElement(By.xpath("//button[text()='Emerald']"));
        Assert.assertEquals(bu1.getText(), "Emerald");

    }

    @Test(groups = {"button"})
    public void but2() {
        WebElement bu1 = driver.findElement(By.xpath("//button[text()='Yellow']"));
        Assert.assertEquals(bu1.getText(), "Yellow");

    }

    @AfterClass(alwaysRun = true)
    public void fin() {
        driver.quit();
    }

}
package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity2Steps extends Base {

    @Given("The user is on the login Page")
    public void OnLoginPage(){
        driver.get("https://training-support.net/webelements/login-form");
        System.out.println(driver.getTitle());
    }

    @When("The user enters username and password")
    public void EnterUsernameAndPassword(){
        WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        username.sendKeys("admin");
        password.sendKeys("password");
    }
    @When("The user enters {string} and {string}")
    public void FeatureInput(String iusername, String ipassword){
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(iusername);;
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ipassword);

    }

    @And("Clicks the Submit Button")
    public void SubmitButton(){
        WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
        submit.click();
    }
    @Then("Get the confirmation message and verify it")
    public void ConfirmationMessage(){
        System.out.println(driver.findElement(By.xpath("//h2[text()='Welcome Back, Admin!']")).getText());
        Assertions.assertEquals("Welcome Back, Admin!",driver.findElement(By.xpath("//h2[text()='Welcome Back, Admin!']")).getText());

    }
    @Then("Get the confirmation message and verify it as {string}")
    public void InputConfirmation(String message){
        String s=driver.findElement(By.xpath("//h2[text()='Welcome Back, Admin!']")).getText();
        System.out.println("Inut");
        Assertions.assertEquals(message,s);

    }
}
package stepDefinitions;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity6Steps extends Base {

    @Given("user is on the To-Do list page")
    public void user_is_on_the_to_do_list_page() {

        driver.get("https://training-support.net/webelements/todo-list");
        System.out.println("Navigated to To-Do List page");

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        assertEquals("Selenium: To-Do List", title);
    }

    @When("user adds the following tasks")
    public void user_adds_the_following_tasks(DataTable dataTable) {

        System.out.println("Reading tasks from DataTable");

        List<String> tasks = dataTable.asList();

        for (String task : tasks) {
            driver.findElement(By.id("todo-input")).sendKeys(task);
            driver.findElement(By.id("todo-add")).click();
            System.out.println("Task added: " + task);
        }
    }

    @Then("they can see the task added to the list")
    public void they_can_see_the_task_added_to_the_list() {

        int taskCount = driver.findElements(By.cssSelector("ul li")).size();
        System.out.println("Total tasks visible in list: " + taskCount);

        assertEquals(3, taskCount);
        System.out.println("All tasks verified successfully");
    }
}



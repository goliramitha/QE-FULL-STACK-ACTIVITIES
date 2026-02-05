
    package demos;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;

public class TestActivity10{

    // ---------- DataProvider ----------
    @DataProvider(name = "excelData")
    public Object[][] readExcelData() throws Exception {

        FileInputStream file =
                new FileInputStream("src/test/resources/TestData.xlsx");

        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i - 1][j] =
                        sheet.getRow(i).getCell(j).toString();
            }
        }

        workbook.close();
        return data;
    }

    // ---------- Test ----------
    @Test(dataProvider = "excelData")
    public void Testdata(
            String fullName,
            String email,
            String date,
            String details) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://training-support.net/webelements/simple-form");

        driver.findElement(By.id("full-name")).sendKeys(fullName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("date")).sendKeys(date);
        driver.findElement(By.id("details")).sendKeys(details);

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        Assert.assertTrue(alert.getText().contains("submitted"));

        alert.accept();
        driver.quit();
    }
}



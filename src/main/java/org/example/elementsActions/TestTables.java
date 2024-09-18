package org.example.elementsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TestTables {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
        driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
    }

    @Test
    public void workingWithElements() throws InterruptedException {
    try {

        WebElement table = driver.findElement(By.id("table2"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        Assert.assertEquals(rows.size(), 5);
        for (WebElement row : rows) {
            System.out.println(row.getText());
            Assert.assertTrue(row.getText().contains("a"));
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
            //BLA BLA BLA
            }
        }





        Thread.sleep(2000);
    }
        catch (
    NoSuchElementException e){
        System.out.println("Element Not Found,please use another attribute");
    }}

@AfterTest
    public void closeBrowser() {
        driver.quit();
}


}

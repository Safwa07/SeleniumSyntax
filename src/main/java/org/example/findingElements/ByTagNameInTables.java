package org.example.findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagNameInTables {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
         driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
    }

@Test
    public void findElementByTagNameInTable() {
        try {

            WebElement table=  driver.findElement(By.id("table1"));
            List<WebElement> row=  table.findElements(By.tagName("tr"));

            System.out.println("table info");
            System.out.println(row.size());
            System.out.println(row.get(3).getText());

        }
catch (NoSuchElementException e){
    System.out.println("Element Not Found,please use another attriubte");
}}
@AfterTest
    public void closeBrowser() {
        driver.quit();
}


}

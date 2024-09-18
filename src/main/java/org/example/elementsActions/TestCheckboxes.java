package org.example.elementsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCheckboxes {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
        driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    public void workingWithElements() throws InterruptedException {
    try {
        WebElement input1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        WebElement input2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));


        if (input2.isSelected()) {
            input2.click();
        }
        else {
            input1.click();
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

package org.example.elementsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Submit {
    WebDriver driver;
    WebElement searchBar;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
        driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://www.google.com");
    }

    @Test
    public void workingWithElements() {
        try {
            searchBar=    driver.findElement(By.name("q"));

            searchBar.clear();
            searchBar.sendKeys("Java");
            searchBar.submit();

            searchBar=    driver.findElement(By.name("q"));
            searchBar.clear();
            searchBar.sendKeys("Selenium");
            searchBar.submit();
        }
        catch (NoSuchElementException e){
            System.out.println("Element Not Found,please use another attribute");
        }}
//@AfterTest
//    public void closeBrowser() {
//        driver.quit();
//}
//
//
}

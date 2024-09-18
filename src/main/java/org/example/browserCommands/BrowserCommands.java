package org.example.browserCommands;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserCommands {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
        driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com");
    }
    @Test
    public void useBrowserCommands() {
        try {
            driver.navigate().to("https://the-internet.herokuapp.com/login");
            System.out.println(driver.getCurrentUrl());
            driver.navigate().back();
            System.out.println(driver.getCurrentUrl());
            driver.navigate().forward();
            System.out.println(driver.getCurrentUrl());
            driver.navigate().refresh();
            System.out.println(driver.getCurrentUrl());

        }
        catch (NoSuchElementException e){
            System.out.println("Element Not Found,please use another attriubte");
        }}
@AfterTest
    public void closeBrowser() {
        driver.quit();
}
}

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

public class WorkingWithTextboxAndButton {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
         driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

@Test
    public void workingWithElements() {
        try {
            WebElement usernameTxt=    driver.findElement(By.id("username"));
            WebElement passwordTxt=  driver.findElement(By.id("password"));
            WebElement loginBtn=  driver.findElement(By.className("radius"));
            //InValid Credentials
//            usernameTxt.sendKeys("admin");
//            passwordTxt.sendKeys("admin");

            //Valid Credentials
            usernameTxt.sendKeys("tomsmith");
            passwordTxt.sendKeys("SuperSecretPassword!");

            loginBtn.click();
            WebElement notification =  driver.findElement(By.id("flash"));

            Assert.assertTrue(notification.getText().contains("You logged"));
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

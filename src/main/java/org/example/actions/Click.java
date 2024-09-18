package org.example.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Click {
    private static final Logger log = LoggerFactory.getLogger(Click.class);
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
         driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

@Test
    public void findElementByClassName() {
        try {
            WebElement usernameTxt=    driver.findElement(By.name("username"));
            WebElement passwordTxt=  driver.findElement(By.name("password"));
            WebElement loginBtn=  driver.findElement(By.className("radius"));
            System.out.println("Click on login btn");
            loginBtn.click();

        }
catch (NoSuchElementException e){
    System.out.println("Element Not Found,please use another attriubte");
}}
//@AfterTest
//    public void closeBrowser() {
//        driver.quit();
//}


}

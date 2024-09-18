package org.example.findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ByClass {
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
            System.out.println("username Values");
            System.out.println(usernameTxt.getAttribute("value"));
            System.out.println(usernameTxt.getTagName());
            System.out.println(usernameTxt.getLocation());
            System.out.println("login Values");
            System.out.println(loginBtn.getText());

        }
catch (NoSuchElementException e){
    System.out.println("Element Not Found,please use another attriubte");
}}
@AfterTest
    public void closeBrowser() {
        driver.quit();
}


}

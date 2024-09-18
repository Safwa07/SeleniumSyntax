package org.example.findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ByCssSelector {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
         driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

@Test
    public void findElementByCssSelector() {
        try {
            WebElement h2CssSelector=    driver.findElement(By.cssSelector("h2"));
            WebElement usernameTxt=    driver.findElement(By.cssSelector("input#username"));
            WebElement passwordTxt=  driver.findElement(By.cssSelector("input#password"));
            WebElement loginBtn=  driver.findElement(By.cssSelector("button.radius"));
            System.out.println("h2 Values");
            System.out.println(h2CssSelector.getText());
            System.out.println("username Values");
            System.out.println(usernameTxt.getAttribute("value"));
            System.out.println(usernameTxt.getTagName());
            System.out.println(usernameTxt.getLocation());
            System.out.println("login Values");
            System.out.println(loginBtn.getText());
            loginBtn.click();

        }
catch (NoSuchElementException e){
    System.out.println("Element Not Found,please use another attriubte");
}}
@AfterTest
    public void closeBrowser() {
        driver.quit();
}


}

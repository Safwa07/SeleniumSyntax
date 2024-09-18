package org.example.findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ByID {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
         driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

@Test
    public void findElementByID() {
    WebElement usernameTxt=    driver.findElement(By.id("username"));
    WebElement passwordTxt=  driver.findElement(By.id("password"));

    System.out.println(usernameTxt.getAttribute("value"));
    System.out.println(usernameTxt.getTagName());
    System.out.println(usernameTxt.getLocation());

}
@AfterTest
    public void closeBrowser() {
        driver.quit();
}


}

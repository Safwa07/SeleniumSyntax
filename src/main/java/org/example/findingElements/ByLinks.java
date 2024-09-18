package org.example.findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ByLinks {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
         driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

@Test
    public void findElementByLink() {
        try {

        WebElement totalLink = driver.findElement(By.linkText("Elemental Selenium"));
        WebElement partOfLink = driver.findElement(By.partialLinkText("Selenium"));

            System.out.println("Total link: " + totalLink.getText());
            System.out.println("Total link: " + totalLink.getAttribute("href"));
            System.out.println("Part of link: " + partOfLink.getText());
            System.out.println("Part of link: " + totalLink.getAttribute("href"));

        }
catch (NoSuchElementException e){
    System.out.println("Element Not Found,please use another attriubte");
}}
@AfterTest
    public void closeBrowser() {
        driver.quit();
}


}

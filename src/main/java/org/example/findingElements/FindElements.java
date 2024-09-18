package org.example.findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements {
    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
         driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com");
    }

@Test
    public void findElementInList() {
        try {

List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("links Values");
            System.out.println(links.size());
            Assert.assertEquals(links.size(), 46, "Number of elements in list"  );

            for (WebElement link : links) {
                        System.out.println(link.getAttribute("href"));
                    }

        }
catch (NoSuchElementException e){
    System.out.println("Element Not Found,please use another attriubte");
}}
@AfterTest
    public void closeBrowser() {
        driver.quit();
}


}

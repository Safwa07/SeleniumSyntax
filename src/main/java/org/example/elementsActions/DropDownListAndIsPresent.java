package org.example.elementsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import org.example.util.*;

public class DropDownListAndIsPresent {
    WebDriver driver;
    TestIsElementPresent elementPresent = new TestIsElementPresent();
    @BeforeTest
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
        driver = new ChromeDriver();
        System.out.println("Open URL");
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
    }

    @Test
    public void workingWithElements() throws InterruptedException {
    try {
        WebElement optionsList = driver.findElement(By.id("dropdown"));
        Select selectOptions = new Select(optionsList);

        //Assertions
        Assert.assertFalse(selectOptions.isMultiple());
        Assert.assertEquals(3,selectOptions.getOptions().size());

        //Three ways to select from dropdown list
        selectOptions.selectByIndex(1);
        Thread.sleep(2000);

        selectOptions.selectByValue("2");
        Thread.sleep(2000);

        selectOptions.selectByVisibleText("Option 1");
        Thread.sleep(2000);
    }
        catch (
    NoSuchElementException e){
        System.out.println("Element Not Found,please use another attribute");
    }}

    @Test
    public void testIsPresent() {
        if (isElementPresent(By.id("dropdown"))) {
            System.out.println("Found this element ");        }
        else {
            Assert.fail("Element is not present");
        }
    }

    private boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;

        } catch (NoSuchElementException e) {
            System.out.println("Element Not Found,please use another attribute");
            return false;
        }
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
}


}

package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {
    public static void main(String[] args) {

        System.out.println("Open Firefox Driver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com");
        driver.quit();
        System.out.println("Close Firefox Driver");
    }
}

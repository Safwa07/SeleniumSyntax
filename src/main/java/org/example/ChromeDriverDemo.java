package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {
    public static void main(String[] args) {
        System.out.println("Open Chrome Driver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.quit();
        System.out.println("Close Chrome Driver");

    }

}

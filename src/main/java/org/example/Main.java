package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//to print this path
        System.out.println(System.getProperty("user.dir")+"\\respures\\x.exe");
        System.out.println("Hello and welcome Safwa!");
        //        To open chrome

        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com");
        System.out.println("Hello and welcome Safwa!");

        System.out.println("Assertion");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Googl");
        //        To exit chrome
                driver.quit();
        System.out.println("Assertion");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}
package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class TestNgDemo {

    @BeforeTest
    public void openURL()
    {
        System.out.println("Open URL");
    }
    @Test(priority = 1)
    public void userCanLogin()
    {
        System.out.println("User Can Login");
//        fail("Throooow");
    }
    @Test(priority = 2,enabled = false, dependsOnMethods = {"userCanLogin"})
    public void userCanBuy()
    {
        System.out.println("User Can Buy");

    }
    @AfterTest
    public void closeURL()
    {
        System.out.println("Close URL");

    }
}

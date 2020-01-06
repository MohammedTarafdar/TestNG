package com.testng;

import org.testng.annotations.*;

public class TestNgBasicTwo {

    /*
    @BeforeMethod
    @Test_01
    @AfterMethod
    @BeforeMethod
    @Test_02
    @AfterMethod
    @BeforeMethod
    @Test_03
    @AfterMethod

     */

    @BeforeSuite    // 1
    public void setup(){
        System.out.println("Setup system property for chrome."+" No 1");
    }

    @BeforeTest     // 2
    public void launchBrowser(){
        System.out.println("Launch Chrome Browser."+" No 2");
    }

    @BeforeClass    //3
    public void login(){
        System.out.println("Enter Url."+" No 3");
    }


    @BeforeMethod   //4
    public void enterUrl(){
        System.out.println("login to app."+" No 4");
    }

    // Test cases -- starting with @Test
    @Test   //5.1
    public void loginTest(){
        System.out.println("Google login test");
    }

    @Test   // 5.2
    public void googleTitleTest(){
        System.out.println("Google title test."+" No 5");
    }

    @Test   // 5.3
    public void searchBoxTest(){
        System.out.println("Google search box test");
    }


    // Post-condition -- start with @After

    @AfterMethod    // 6
    public void logout(){
        System.out.println("Logout from app."+" No 6");
    }

    @AfterClass     // 7
    public void closeBrowser(){
        System.out.println("Close the browser."+" No 7");
    }

    @AfterTest      // 8
    public void quitBrowser(){
        System.out.println("Quit Browser."+" No 8");
    }

    /*@AfterSuite     // 9
    public void generateTestReport(){
        System.out.println("Generate Test Report."+" No 9");
    }*/
}

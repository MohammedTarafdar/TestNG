package com.test;

    // ****************** con.test package work with Naveen Automation Labs *******************

import org.testng.annotations.*;

public class TestNgBasics {

    /*

    @BeforeSuite
    @BeforeTest
    @BeforeClass

    @BeforeMethod
    @Test   =>1
    @AfterMethod

    @BeforeMethod
    @Test   =>2
    @AfterMethod

    @BeforeMethod
    @Test   =>3
    @AfterMethod

    @AfterClass
    @AfterTest
    @AfterSuite

     */

    @BeforeSuite    //1
    public void setUp(){
        System.out.println("Please setup system property for chrome driver ");
    }


    @BeforeTest     //2
    public void launceBrowser(){
        System.out.println("Launch chrome Browser");
    }


    @BeforeClass    //3
    public void login(){
        System.out.println("Please login with valid credential");
    }

    @BeforeMethod   //4
    public void enterURL(){
        System.out.println("Please enter URL");
    }


    @Test   //5_1
    public void googleTitleTest(){
        System.out.println("Google title Test");
    }

    @Test   //5_2
    public void logoTest(){
        System.out.println("Please verify the page logo is present in the page.");
    }

    @Test   //5_3
    public void searchBarTest(){
        System.out.println("Please check the search bar working fine or not");
    }

    @AfterMethod    //6
    public void deleteAllCookies(){
        System.out.println("Delete All Cookies");
    }


    @AfterClass     //7
    public void logout(){
        System.out.println("Successfully logout from website");
    }

    @AfterTest  //8
    public void closeBrowser(){
        System.out.println("Close Browser");
    }


    @AfterSuite     //9
    public void generateTestReport(){
        System.out.println("Please generate TestNG Report");
    }

}

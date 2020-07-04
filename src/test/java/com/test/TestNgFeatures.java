package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {


    @Test
    public void loginTest(){
        System.out.println("Login Test");
    }

    @Test(dependsOnMethods = "loginTest")
    public void logoutTest(){
        System.out.println("Logout Test");
    }

}

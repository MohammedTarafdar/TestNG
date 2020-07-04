package com.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;
import java.util.concurrent.TimeUnit;

public class GoogleFeaturesTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://www.google.com");
        System.out.println("Launch the Browser");
    }


    @Test(priority = 1,groups = "title")
    public void googleTitleTest(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Google");
    }

    @Test(priority = 3, groups = "logo")
    public void googleLogoTest(){
        boolean status = driver.findElement(By.xpath("//div[@id=\"logo-default\"]")).isDisplayed();     //  "//div[@id="logo-default"]" or "//div[@id="logo"]//div[contains(@class,"show-logo")]"
        System.out.println("Logo is present");
    }

    @Test(priority = 2, groups = "link")
    public void gmailLinkTest(){
        driver.findElement(By.xpath("//a[text()=\"Gmail\"]")).isDisplayed();
        System.out.println("Gmail link is present");
    }

    @Test(priority = 4, groups = "test")
    public void testOne(){
        System.out.println("I am test one");
    }

    @Test(priority = 5, groups = "test")
    public void testTwo(){
        System.out.println("I am test two");
    }

    @Test(priority = 6, groups = "test")
    public void testThree(){
        System.out.println("I am test three");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        System.out.println("Close the Browser");
    }

}

package com.PageObject.New_Registration;

import com.demo.DriverManagerfile;
import com.demo.Screenshot_File;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.xml.bind.SchemaOutputResolver;


@Test
public class Login_Page extends DriverManagerfile {

    @BeforeTest
    public void Login() throws Exception {
        DriverManagerfile.setup();
    }

    @Test(priority = 1)
    public void OnlyPassWordtest() throws Exception {
        // without Put Email ID
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etusername");
        el1.sendKeys("");
        System.out.println("without Put Email ID");


        //Put Password
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el2.sendKeys("123456");
        System.out.println("Put Password");

        //Click Submit Button Click
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/login");
        if (el3.isDisplayed()){
            el3.click();
            System.out.println("Submit button Click Successful");
        }
        else {
            System.out.println("Submit button not Showing");
        }
        Screenshot_File.nexcitizen(driver,"Without UserName");

        System.out.println("dashboard:--  pre ");

        try {
            MobileElement dashboard = (MobileElement) driver.findElementsById("com.nex.nexcitizen:id/bannerlay");
            Assert.assertTrue(dashboard.isDisplayed());
        } catch (Exception e ){

            Assert.assertEquals("Login not successful without username","Login Successful without username");
            System.out.println(" Element exception: "+e);
        }
    }
    @Test(priority = 2)
    public void OnlyUserNametest() throws Exception {
        // Put Email ID
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etusername");
        el1.sendKeys("ssinha@newamps.co.in");
        System.out.println("Put Email ID");

        // Without Password
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el2.sendKeys("");
        System.out.println("Without Password");

        //Click Submit Button Click
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/login");
        if (el3.isDisplayed()){
            el3.click();
            System.out.println("Submit button Click Successful");
        }
        else {
            System.out.println("Submit button not Showing");
        }

        try {
            MobileElement dashboard = (MobileElement) driver.findElementsById("com.nex.nexcitizen:id/bannerlay");
            Assert.assertTrue(dashboard.isDisplayed());
        } catch (Exception e ){

            Assert.assertEquals("Login not successful without Password","Login Successful without Password");
            System.out.println(" Element exception: "+e);
        }
    }
    @Test(priority = 3)
    public void UserTest() throws Exception {
        // Put UserName
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etusername");
        el1.sendKeys("ssinha@newamps.co.in");
        System.out.println("Put UserName");

        // Put Password
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el2.sendKeys("123456");
        System.out.println("Put Password");

        //Click Submit Button Click
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/login");
        if (el3.isDisplayed()){
            el3.click();
            System.out.println("Submit button Click Successful");
            SoftAssert softAssert = new SoftAssert();
            String accual = "Login successful with username & Password";
            String expect = "Login not Successful with username & Password";
            softAssert.assertEquals(accual,expect);
        }
        else {
            System.out.println("Submit button not Showing");
        }



    }
        public void quite() {
            System.out.println("Testing complete");
        }
    }
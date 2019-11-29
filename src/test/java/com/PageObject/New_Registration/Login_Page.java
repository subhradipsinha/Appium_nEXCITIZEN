package com.PageObject.New_Registration;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


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
        Thread.sleep(3000);

        //Put Password
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el2.sendKeys("123456");
        System.out.println("Put Password");
        Thread.sleep(3000);
        //Click Submit Button Click
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/login");
        el3.click();

        SoftAssert softAssert = new SoftAssert();
        String accual = "Without UserName not Login";
        String expect = "Successfully Login";
        softAssert.assertEquals(accual, expect,"Successfully Login");
        softAssert.assertAll();

    }
    @Test(priority = 2)
    public void OnlyUserNametest() throws Exception {
        // Put Email ID
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etusername");
        el1.sendKeys("ssinha@newamps.co.in");
        System.out.println("Put Email ID");
        Thread.sleep(3000);
        // Without Password
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el2.sendKeys("");
        System.out.println("Without Password");
        Thread.sleep(3000);
        // Submit button click
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/login");
        el3.click();

        SoftAssert softAssert2 = new SoftAssert();
        String accual2 = "Without Password not Login";
        String expect2 = "Successfully Login";
        softAssert2.assertEquals(accual2, expect2,"Successfully Login");
        softAssert2.assertAll();

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

        // Submit Button Click
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/login");
        el3.click();
        System.out.println("Submit Button Click");
        Thread.sleep(5000);

        SoftAssert softAssert3 = new SoftAssert();
        String accual3 = "With UserName & Password Login";
        String expect3 = "Un-Successfully Login";
        softAssert3.assertEquals(accual3, expect3,"Un-Successfully Login");
        softAssert3.assertAll();

    }



    public void quite(){
        System.out.println("Testing complete");
    }
}
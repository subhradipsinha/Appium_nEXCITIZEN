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
        el3.click();

        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/appstatuslay").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Dashboard show List");
        } else{
            System.out.println("Not show Dashboard show List");
            Assert.assertTrue(isPresent,"WithOut UserName Not Successfully login");
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
        el3.click();

        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/appstatuslay").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Dashboard show List");
        } else{
            System.out.println("Not show Dashboard show List");
            Assert.assertTrue(isPresent,"WithOut password Not Successfully login");
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
        el3.click();
        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/appstatuslay").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Dashboard show List");
        } else{
            System.out.println("Not show Dashboard show List");
            Assert.assertTrue(isPresent,"With username and password Not Successfully login");
        }
    }
        public void quite() {
            System.out.println("Testing complete");
        }
    }
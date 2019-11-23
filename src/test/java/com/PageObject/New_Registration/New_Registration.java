package com.PageObject.New_Registration;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New_Registration extends DriverManagerfile {
    @BeforeTest
    public void Login() throws Exception {
        DriverManagerfile.setup();
    }

    @Test(priority = 1)
    public void new_Registration_link_Click(){
        // Click Here to Registration
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/register");
        el1.click();
        System.out.println("Click Here to Registration");
    }
    @Test(priority = 2)
    public void Registration_From() throws InterruptedException {

        Thread.sleep(3000);
        //First Name
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfname");
        el2.sendKeys("Subhradip");
        //Last Name
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etlname");
        el3.sendKeys("Sinha");
        //Email ID
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etemail");
        el4.sendKeys("ssinha@newamps.co.in");
        //Date of Birth
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdob");
        el5.sendKeys("07/02/1992");
        //Password
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpassword");
        el6.sendKeys("123456789");
        //Confirm Password
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etconpassword");
        el7.sendKeys("123456789");
        System.out.println("Confirm Password");

        //Gender(Droupdown box)
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el9.click();
        System.out.println("Gender(Droupdown box)");

        //Assessee No.
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etassesse");
        el10.sendKeys("00A2345BC001");

        //Assessee Type
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etassesseetype");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el12.click();
        System.out.println("Assessee Type");

        //Trade Licence No.
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ettradeliucenceno");
        el13.sendKeys("000456789AD4321");

        // Occupation
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etoccupation");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el15.click();


        // Annual Income
        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[6]/android.widget.Spinner/android.widget.TextView");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]");
        el17.click();

        //Mobile Number
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmob");
        el18.sendKeys("2222222222");

        //Telephone Number
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etph");
        el19.sendKeys("2222222222");
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/chk");
        el20.click();

        // Scroll Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Pin\"));");

        Thread.sleep(5000);

        //Building No
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethouse");
        el21.sendKeys("24A");
        //Road Number
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etstreet");
        el22.sendKeys("Baghajatin Road");
        //Near Location
        MobileElement el23 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etloc");
        el23.sendKeys("Baghajatin Club");

        // City Name
        MobileElement el24 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcity");
        el24.sendKeys("Kolkata");
        // State
        MobileElement el25 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el25.click();
        Thread.sleep(1000);
        // Scroll Down
        MobileElement elementscrol2 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"West Bengal\"));");
        MobileElement el26 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[14]");
        el26.click();
        Thread.sleep(2000);

        //Distric
        MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdistrict");
        el27.sendKeys("Kolkata");

        // Scroll Down
        MobileElement elementscrol3 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Submit\"));");


        //PIN Code
        MobileElement el28 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el28.sendKeys("700012");
        MobileElement el29 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/samechk");
        el29.click();


        //Submit Button Click
        MobileElement el30 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el30.click();
            }
    }

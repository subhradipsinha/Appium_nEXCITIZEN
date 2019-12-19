package com.PageObject.Water_Supply_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Subhradip Sinha
 * Date: 29/10/2019
 */

@Test
public class Side_Panel_Water_Supply extends DriverManagerfile {

    @Test
    public void Hit_Side_Panel_Water_Supply()throws Exception{
        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Logout\"));");

        //Hit_Water_Supply_Tap
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[11]/android.widget.CheckedTextView");
        el2.click();

        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/namelay").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Hit_Water_Supply_Tap");
        } else {
            System.out.println("Not show Hit_Water_Supply_Tap");
        }

        // Registration ID
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etreg");
        el3.sendKeys("1574237462099");
        System.out.println("Registration ID");

        //Search_button_Click
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/serialsearch");
        el4.click();
        System.out.println("Search_button_Click");
        Thread.sleep(3000);
    }

    @Test
    public void Edit_Button() throws InterruptedException {
        //Edit button Click
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[8]");
        el5.click();
        System.out.println("Edit button Click");

        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/textView1").size() > 0;
        if (isPresent == true) {
            System.out.println("Sucessfully Edit button Click");
        } else {
            System.out.println("Not Edit button Click");
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(isPresent,"Not Edit button Click...........");
            softAssert.assertAll();
        }

        //Application_Details_Link
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el6.click();
        System.out.println("Application_Details_Link");

        //Applicant Name
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etapp");
        el7.sendKeys("Riya Dhara");
        System.out.println("Applicant Name");

        //Father Name
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfather");
        el8.sendKeys("A.K.Dhara");
        System.out.println("Father Name");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Next\"));");


        // Next Button Click
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el9.click();
        System.out.println("Next Button Click");

        //Upload button Click
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el10.click();
        System.out.println("Upload button Click");

        //Document Type
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el12.click();
        System.out.println("Document Type");

        //Hit to the Upload File
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el13.click();
        MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el14.click();
        Thread.sleep(5000);
        MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Shutter button");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementById("com.android.camera:id/btn_done");
        el16.click();
        // Click Submit Button
        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el17.click();

        System.out.println("Upload button Click");
        Thread.sleep(5000);

        // Back to Dashboard
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/homelay");
        el18.click();
        System.out.println("Back to Dashboard");
        Thread.sleep(3000);


    }
    }

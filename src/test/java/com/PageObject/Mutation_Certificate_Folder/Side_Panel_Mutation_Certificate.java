package com.PageObject.Mutation_Certificate_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Subhradip Sinha
 * Date: 25/10/2019
 */
@Test
public class Side_Panel_Mutation_Certificate extends DriverManagerfile {
    @Test
    public void Hit_Side_Panel() throws Exception {
        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Logout\"));");

        // Hit_Mutation_Certificate
        MobileElement el2= (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[9]/android.widget.CheckedTextView");
        el2.click();


        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/namelay").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Hit_Mutation_Certificate Tab");
        } else {
            System.out.println("Not show Hit_Mutation_Certificate Tab");
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

        //Owner_Details_Link
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow4");
        el6.click();
        System.out.println("Owner_Details_Link");
        //Name of the Vendor / Previous Owner
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnopa");
        el7.sendKeys("Rahul Saha");
        System.out.println("Name of the Vendor / Previous Owner");
        //Father's / Husband Name
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfhn");
        el8.sendKeys("A.K.Saha");
        System.out.println("Father's / Husband Name");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"NEXT\"));");

        // Address
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etadd");
        el9.sendKeys("Kolkata");
        System.out.println("Address");

        // Next Button Click
        MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next.click();

        // Upload Button Click
        MobileElement Upload = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Upload.click();

        //Document Type
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el11.click();
        System.out.println("Document Type");

        // Upload Button Click
        MobileElement Upload1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Upload1.click();


        //Hit to the Upload File
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el13.click();
        Thread.sleep(5000);
        MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Shutter button");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementById("com.android.camera:id/btn_done");
        el15.click();
        // Click Submit Button
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el16.click();
        System.out.println("Upload Button Click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el17.click();
        System.out.println("Back to the Mane menu");
        Thread.sleep(3000);

        // Scroll Down
        MobileElement elementscrol18= (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);


    }
}

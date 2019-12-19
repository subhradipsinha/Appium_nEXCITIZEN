package com.PageObject.Complaint_Management_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


/**
 * @author Subhradip Sinha
 * Date: 23/10/2019
 */
@Test
public class Side_Panel_Complain_Management extends DriverManagerfile {

    @Test
    //Hit_Side_Panel
    public void Hit_Side_Panel()throws Exception{
        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Logout\"));");

        //Hit Complain_Management
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[12]");
        el2.click();

        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/namelay").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Side Panel Hit Complain_Management Tab");
        } else {
            System.out.println("Not show Side Panel Hit Complain_Management Tab");
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

        //Complain_Details_Link
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el6.click();
        System.out.println("Complain_Details_Link");

        // Complan and registered user are same(Droupdown box)
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el8.click();
        System.out.println("Complan and registered user are same(Droupdown box)");

        //Name of person Making Complaint
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etname");
        el9.sendKeys("Suraj.Kumar.BAG");
        System.out.println("Name of person Making Complaint");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"SUBMIT\"));");
        System.out.println("Scroll Down");

        //Submit button Click
        MobileElement submit = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit.click();

        //Hit to the Upload File
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el11.click();
        Thread.sleep(5000);
        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Shutter button");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementById("com.android.camera:id/btn_done");
        el13.click();
        // Click Submit Button
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el14.click();

        // Scroll Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"SUBMIT\"));");
        System.out.println("Scroll Down");

        //Submit button Click
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el15.click();
        System.out.println("Submit button Click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el16.click();
        System.out.println("Back to Dashboard");
        Thread.sleep(3000);

        // Scroll Down
        MobileElement elementscrol2= (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);



    }
}

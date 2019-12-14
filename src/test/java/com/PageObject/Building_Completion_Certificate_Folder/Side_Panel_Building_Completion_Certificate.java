package com.PageObject.Building_Completion_Certificate_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

@Test
public class Side_Panel_Building_Completion_Certificate extends DriverManagerfile {
    @Test
    public void Hit_Side_Panel_Building_Completion_Certificate()throws Exception{


        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Logout\"));");

        // Hit Side_Panel_Building_Completion_Certificate
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[8]/android.widget.CheckedTextView");
        el2.click();
        System.out.println("Hit Side_Panel_Building_Completion_Certificate");

        // Registration ID
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etreg");
        el3.sendKeys("1574237462099");
        System.out.println("Registration ID");
        // Search_button_Click
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/serialsearch");
        el4.click();
        System.out.println("Search_button_Click");
        Thread.sleep(3000);
    }
    @Test
    public void Edit_Update()throws Exception{

        //Edit_Button Click
        MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[8]");
        el22.click();
        System.out.println("Edit_Button Click");

        //Hit_Address_Details_Droupdown
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el5.click();
        System.out.println("Hit_Address_Details_Droupdown");

        //Zone(Droupdown)
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
        el7.click();
        System.out.println("Zone(Droupdown)");

        // Close_Address_Details_Droupdown
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el8.click();
        System.out.println("Close_Address_Details_Droupdown");

        //Hit_Building_Details_Droupdown
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
        el9.click();
        System.out.println("Hit_Building_Details_Droupdown");

        // Date of inspection by the Engineer
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etapt");
        el10.sendKeys("08/10/2019");
        System.out.println("Date of inspection by the Engineer");

        //Owner Name
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etname");
        el11.sendKeys("Subhas Kumar Dhara");
        System.out.println("Owner Name");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Submit\"));");

        // doucment Type(Droupdown box)
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/doctype");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el13.click();
        System.out.println("doucment Type(Droupdown box)");

        // Submit button click
        MobileElement submit14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit14.click();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////******************************************/////////////////////////////////////////////////////////////////////
        // photo upload
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el18.click();
        System.out.println("photo upload");
        Thread.sleep(5000);

        // Submit button click
        MobileElement submit20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit20.click();
        System.out.println("Submit button click");
        Thread.sleep(5000);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////***********************************************///////////////////////////////////////////////////////////////////
        //Back to Dashboard
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el21.click();
        System.out.println("Back to the Dashboard");
        Thread.sleep(3000);

        //Scroll Dashboard
        // Scroll Down
        MobileElement elementscrol22 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        System.out.println("Scroll Dashboard");
        Thread.sleep(3000);



    }
}

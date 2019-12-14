package com.PageObject.Hording_and_Advertisment;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

@Test
public class Side_Panel_Hording_and_Advertisment extends DriverManagerfile {
    @Test
    public void Hit_Side_Panel_Hording_and_Advertisment() throws Exception {
        Thread.sleep(3000);
        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Logout\"));");

        Thread.sleep(2000);
        // Tab Hit Hording Update
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[10]/android.widget.CheckedTextView");
        el2.click();

        System.out.println("Tab Hit Hording Update");
        // Registration ID
        MobileElement el3= (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etreg");
        el3.sendKeys("1574237462099");
        System.out.println("Registration ID");

        //Search Details
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/serialsearch");
        el4.click();
        System.out.println("Search Details");

        //Edit button Click
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[8]");
        el5.click();
        System.out.println("Edit button Click");
        Thread.sleep(3000);
        //Hit_Applicant_Details_Link
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el6.click();
        System.out.println("Hit_Applicant_Details_Link");

        //Name of Applicant
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etname");
        el7.sendKeys("S.K.Das");
        System.out.println("Name of Applicant");

        // Scroll Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Submit\"));");
        elementscrol.click();

        // Droupdown Document Type
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el9.click();

        // Hit Upload Photo
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el10.click();
        Thread.sleep(3000);

        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el11.click();
        Thread.sleep(3000);
        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Shutter button");
        el12.click();
        Thread.sleep(3000);
        MobileElement el13 = (MobileElement) driver.findElementById("com.android.camera:id/btn_done");
        el13.click();
        Thread.sleep(3000);

        // Next Button Click
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el14.click();
        System.out.println("Next Button Click");
        Thread.sleep(3000);

        //Back to Dashboard
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el15.click();
        Thread.sleep(3000);

    }
}
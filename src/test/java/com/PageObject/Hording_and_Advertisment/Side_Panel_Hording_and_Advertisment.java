package com.PageObject.Hording_and_Advertisment;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class Side_Panel_Hording_and_Advertisment extends DriverManagerfile {
    @Test
    public void Hit_Side_Panel_Hording_and_Advertisment()throws Exception{
        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Logout\"));");

        // Tab Hit Hording Update
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[9]/android.widget.CheckedTextView");
        el2.click();
        System.out.println("Tab Hit Hording Update");
        // Registration ID
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etreg");
        el8.sendKeys("1574237462099");
        System.out.println("Registration ID");

        //Name of Applicant
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etname");
        el3.sendKeys("Raj Das");
        System.out.println("Name of Applicant");
        //Name of the Company/Firm
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcom");
        el4.sendKeys("XYZ.com");
        System.out.println("Name of the Company/Firm");

        //Close_Applicant_Details_Link
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el5.click();
        System.out.println("Close_Applicant_Details_Link");
        }
        @Test
    public void Hit_Hording_Details_Link(){
            //Hit_Hording_Details_Link
            MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
            el15.click();
            System.out.println("Hit_Hording_Details_Link");
            //Number of Hording
            MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
            el6.click();
            MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]");
            el7.click();
            System.out.println("Number of Hording");
            // Scroll Down
            MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Submit\"));");
            System.out.println("Scroll Down");
            //Next Button Click
            MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
            next.click();
            System.out.println("Next Button Click");
        }
}

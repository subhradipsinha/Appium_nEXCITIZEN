package com.PageObject.Building_Plan_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 17/10/2019
 */

@Test
public class Side_Panel_Building_Plan extends DriverManagerfile {
    @Test
    public void Hit_Side_Panel_Building_Plan()throws  Exception{
        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        // Hit Hit_Side_Panel_Building_Plan
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]/android.widget.CheckedTextView");
        el2.click();

        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/namelay").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Side_Panel_Building_Plan Tab");
        } else {
            System.out.println("Not show Hit Side_Panel_Building_Plan Tab");
        }


        // Put ID
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etreg");
        el3.sendKeys("1574237462099");


        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/serialsearch");
        el4.click();
        Thread.sleep(2000);

    }

    @Test
    public void Hit_Edit_Button() throws InterruptedException {
        //Edit button Click
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[8]");
        el5.click();
        System.out.println("Edit button Click");

        //Building Plan Details
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el6.click();
        System.out.println("Building Plan Details");

        //House no
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethouse");
        el7.sendKeys("654A");
        System.out.println("House no");
        //Village/Town
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ettown");
        el8.sendKeys("Kolkata");
        System.out.println("Village/Town");

        //District
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdist");
        el9.sendKeys("West-Bengal");
        System.out.println("District");

        // Scroll Down
        MobileElement elementscroll = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Next\"));");

        // Upload Button Click
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el10.click();
        System.out.println("Upload Button Click");
        Thread.sleep(5000);

        // Document Type(Droupdown box)
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el12.click();

        // Upload Button Click
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el13.click();
        System.out.println("Upload Button Click");
        Thread.sleep(5000);

        //Photo Upload
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el17.click();
        System.out.println("Photo Upload");
        // Upload Button Click
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el18.click();
        System.out.println("Upload Button Click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el19.click();
        System.out.println("Back to the Mane menu");
        Thread.sleep(3000);

        // Scroll Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);

    }

}

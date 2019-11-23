package com.PageObject.Building_Plan_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 16/10/2019
 */

public class Building_Plan extends DriverManagerfile {
    @Test(priority = 7)
    public void Building_Tab() throws Exception {
        // Building_Tab hit
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bplan");
        el1.click();
        Thread.sleep(3000);
    }
    @Test(priority = 8)
    public void Building_Plan_Details(){
        //Building_Plan_Details(Droupdownbox_Hit)
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el2.click();
    }
    @Test(priority = 9)
    public void building_From_Fill_up() throws InterruptedException {
        //House no
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethouse");
        el3.sendKeys("654A");
        System.out.println("House no");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Date of application\"));");
        elementscrol.click();

        // Next Button Click
        MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next.click();
        ////////////////////////////////////////////////////////////////////////////////////////********************************/////////////////////////////
        // Scroll Down
        MobileElement elementscrol2 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"House No\"));");
        elementscrol2.click();

        //Village/Town
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ettown");
        el4.sendKeys("Kolkata");
        System.out.println("Village/Town");
        // Scroll Down
        MobileElement elementscrol3 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Date of application\"));");
        elementscrol3.click();
        // Next Button Click
        MobileElement next1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next1.click();
        ////////////////////////////////////////////////////////////////////////**********************************************8///////////////////////////////////////

        // Scroll Down
        MobileElement elementscrol4 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"House No\"));");
        elementscrol4.click();

        //District
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdist");
        el5.sendKeys("West-Bengal");
        System.out.println("District");
        Thread.sleep(3000);

        // Zone(Droupdown-box)
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.Spinner/android.widget.TextView");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
        el7.click();
        System.out.println("Zone(Droupdown-box)");

        //Ward Number(Droupdown-box)
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.Spinner/android.widget.TextView");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el9.click();
        System.out.println("Ward Number(Droupdown-box)");

        // Scroll Down
        MobileElement elementscroll = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Date of application\"));");
        elementscroll.click();

        //Pin Code
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el10.sendKeys("111111");
        System.out.println("Pin Code");

        //Area
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etarea");
        el11.sendKeys("Salt-Lake");
        System.out.println("Area");
        //Purpose
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpurpose");
        el12.sendKeys("New-Building");
        System.out.println("Purpose");
        //Application Name
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etapp");
        el13.sendKeys("Rajib Majumder");
        System.out.println("Application Name");
        //Father Name
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfather");
        el14.sendKeys("Sourav Majumder");
        System.out.println("Father Name");
        //Mobile no.
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmob");
        el15.sendKeys("1111111111");
        System.out.println("Mobile no.");

        //Date of application
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdate");
        el16.sendKeys("10/11/2019");
        System.out.println("Date of application");

        // Next Button Click
        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el17.click();

        // Upload Button Click
        MobileElement el24 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el24.click();
        System.out.println("Upload Button Click");
        Thread.sleep(5000);

        // Document Type(Droupdown box)
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el19.click();

        // Upload Button Click
        MobileElement el25 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el25.click();
        System.out.println("Upload Button Click");
        Thread.sleep(5000);

        //Photo Upload
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el20.click();
        MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el23.click();
        System.out.println("Photo Upload");
        // Upload Button Click
        MobileElement el26 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el26.click();
        System.out.println("Upload Button Click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el27.click();
        System.out.println("Back to the Mane menu");
        Thread.sleep(3000);

        // Scroll Down
        MobileElement elementscrol5 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);






    }
}

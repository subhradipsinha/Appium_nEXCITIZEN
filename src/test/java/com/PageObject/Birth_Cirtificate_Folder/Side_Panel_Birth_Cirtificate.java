package com.PageObject.Birth_Cirtificate_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date:01/10/2019
 */

@Test
public class Side_Panel_Birth_Cirtificate extends DriverManagerfile {
    @Test
    public void Side_panel_click() throws InterruptedException {
        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        //Update_Birth_Registration_Details
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView");
        el2.click();
        System.out.println("Update_Birth_Registration_Details");

        // Registration ID
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etreg");
        el3.sendKeys("1574237462099");
        System.out.println("Registration ID");
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/serialsearch");
        el4.click();
        System.out.println("Submit_button_Click");
        Thread.sleep(3000);
    }
    @Test
    public void Edit_Update() throws InterruptedException {
        //Edit button Click
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[8]");
        el6.click();
        System.out.println("Edit button Click");

        // Application Droupdown Link click
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el7.click();
        System.out.println("Application Droupdown Link click");
        Thread.sleep(2000);

        // Hit to the Name of Child filled
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etname");
        el8.sendKeys("Babai");
        System.out.println("Hit to the Name of Child filled");

        //Hit to the DOB filled
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdob");
        el9.sendKeys("07/02/1994");
        System.out.println("Hit to the DOB filled");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Next\"));");
        System.out.println("Scroll Down");

        // Click to the Next Button
        MobileElement Test = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test.click();
        System.out.println("Next Button");

        // Hit Droupdown Box(Type)
        MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el11.click();
        System.out.println("Hit Droupdown Box(Type)");

        // Click Submit Button
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el12.click();
        System.out.println("Click Submit Button");


        // Hit Droupdown Box(document Type)
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/doctype");
        el13.click();

        MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el14.click();
        System.out.println("Hit Droupdown Box(document Type)");
        // Click Submit Button
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el15.click();
        System.out.println("Click Submit Button");

        //Hit to the Upload File
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el16.click();
        Thread.sleep(3000);
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el17.click();
        Thread.sleep(3000);
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el18.click();
        Thread.sleep(3000);
        MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el19.click();
        System.out.println("Hit to the Upload File");
        Thread.sleep(3000);
        // Click Submit Button
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el20.click();
        System.out.println("Click Submit Button");
        Thread.sleep(10000);
        //Back to Dashboard
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el21.click();
        System.out.println("Back to Dashboard");
        Thread.sleep(3000);






    }

}

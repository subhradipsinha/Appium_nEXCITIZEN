package com.PageObject.Death_Certificate_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 04/10/2019
 */

public class Side_Panel_Death_Certificate extends DriverManagerfile {
    @Test
    public void Side_panel_click() throws InterruptedException {

        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        //Update_Death_Registration_Details
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView");
        el2.click();
        System.out.println("Update_Death_Registration_Details");

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
            MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[8]");
            el5.click();
            System.out.println("Edit button Click");

            // Hit Link Applicant Details
            MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
            el6.click();
            System.out.println("Hit Link Applicant Details");
            Thread.sleep(3000);

            // Hit to Droupdown Box(Relationship)
            MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
            el7.click();
            MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
            el8.click();
            System.out.println("Hit to Droupdown Box(Relationship)");
            Thread.sleep(2000);

            // Hit to the Appication name
            MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etappname");
            el9.sendKeys("abc");
            System.out.println("Hit to the Appication name");
            Thread.sleep(2000);

            //Close Application Details Tab
            MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
            el10.click();
            System.out.println("Death Certificated Tab");
            Thread.sleep(2000);


            ////////////////////////////////////////////////////////////////////////////////////***********************************************//////////////////////////////////////////////////

            // Hit Death person Details Tab
            MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
            el11.click();
            System.out.println("Hit Death person Details Tab");

            //Hit Death Person Name filled
            MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdp");
            el12.sendKeys("Rajib Dhara");
            System.out.println("Hit Death Person Name filled");

            //Hit Death Person Date of Birth filled
            MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdobdead");
            el13.sendKeys("20/03/1954");
            System.out.println("Hit Death Person Date of Birth filled");

            // Scroll in Down
            MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Submit\"));");

            // submit Button Click
            MobileElement Text = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
            Text.click();
            System.out.println("submit Button Click");
            Thread.sleep(2000);

            // Droup-down bok click(Document Type)
            MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
            el15.click();
            Thread.sleep(3000);
            MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
            el16.click();
            Thread.sleep(3000);
            System.out.println("Droup-down bok click(Document Type)");

            //Hit Submit button click
            MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
            el17.click();
            Thread.sleep(3000);
            System.out.println("Submit button click");
            Thread.sleep(3000);

            // Hit Upload Photo
            MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
            el18.click();
            Thread.sleep(3000);

            MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
            el19.click();
            Thread.sleep(3000);
            MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
            el20.click();
            Thread.sleep(3000);
            MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
            el21.click();
            System.out.println("Hit Upload Photo");
            Thread.sleep(3000);

            //Hit Submit button click
            MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
            el22.click();
            System.out.println("Submit button click");
            Thread.sleep(3000);

            //Back to Dashboard
            MobileElement el23 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el23.click();
            Thread.sleep(2000);







        }
    }

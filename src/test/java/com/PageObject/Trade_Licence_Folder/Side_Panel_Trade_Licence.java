package com.PageObject.Trade_Licence_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 11/10/2019
 */
@Test
public class Side_Panel_Trade_Licence extends DriverManagerfile {
    @Test
    public void Sidepanel_Click()throws Exception{
        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        //Update_Trade_Licence_Registration_Details
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]/android.widget.CheckedTextView");
        el2.click();
        System.out.println("Update_Trade_Licence_Registration_Details");

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

        // Property Details Droupdown box Click
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/pr");
        el6.click();
        Thread.sleep(2000);
        System.out.println("Property Details Droupdown box Click");

        // Zone Droupdown Box Click
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el8.click();
        Thread.sleep(2000);
        System.out.println("Zone Droupdown Box Click");

        // Hit House No Filled
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethouse");
        el9.sendKeys("95A");
        System.out.println("Hit House No Filled");

        // Close Property Details Tab
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el10.click();
    }
    @Test
    public void Hit_Trade_Details()throws Exception{
        // Hit Trade Details Link
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
        el11.click();

        // Hit License Type Droupdown Box
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el13.click();
        System.out.println("Hit License Type Droupdown Box");
        Thread.sleep(2000);

        // Hit Last License No
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etlln");
        el14.sendKeys("0000100001234557");
        System.out.println("Hit Last License No");
        Thread.sleep(2000);

        //Close Trade Details Link
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow1");
        el15.click();
        System.out.println("Close Trade Details Link");
        Thread.sleep(2000);
    }
    @Test
    public void Licence_Owner_Details()throws Exception{
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etlon");
        el16.sendKeys("S.Raghav");
        System.out.println("Hit Licence Owner Name filled");
        Thread.sleep(2000);

        // Hit Address Filled
        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etadd");
        el17.sendKeys("Durgapore");
        Thread.sleep(2000);
        System.out.println("Hit Address Filled");
        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Submit\"));");

        // Submit Button Click
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el18.click();
        System.out.println("Submit Button Click");
        Thread.sleep(5000);

        // Document Type Droupdown box Click
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el20.click();
        System.out.println("Document Type Droupdown box Click");
        Thread.sleep(2000);
        // Submit Button Click
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el21.click();
        System.out.println("Submit Button Click");
        Thread.sleep(5000);

        // File Upload Click
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el23.click();
        MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el25.click();
        System.out.println("File Upload Click");
        Thread.sleep(2000);

        // Submit Button Click
        MobileElement el26 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el26.click();
        System.out.println("Submit Button Click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el27.click();
        Thread.sleep(3000);

    }
}

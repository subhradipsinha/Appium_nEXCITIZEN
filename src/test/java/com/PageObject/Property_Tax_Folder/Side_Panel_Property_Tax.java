package com.PageObject.Property_Tax_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 13/10/2019
 */

public class Side_Panel_Property_Tax extends DriverManagerfile {
    @Test
    public void Hit_Side_Panel()throws Exception
    {
        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        //Property_Tax Tab Hit
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView");
        el2.click();

        System.out.println("Property_Tax Tab Hit");

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
        // Property Details Link Click
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ptextlay");
        el6.click();
        System.out.println("Property Details Link Click");
        Thread.sleep(3000);

        // Hit to the Owner Name Filled
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etowne");
        el7.sendKeys("Sanjay");
        System.out.println("Hit to the Owner Name Filled");
        Thread.sleep(2000);

        // House/ Flat No Filled
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethouses");
        el8.sendKeys("240");
        System.out.println("House/ Flat No Filled");

        // Hit Address filed
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etbuilding");
        el9.sendKeys("Bandel");
        System.out.println("Hit Address filed");
        Thread.sleep(2000);

        //Close Property Details Link Click
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el10.click();
        System.out.println("Close Property Details Link Click");

        // Owner Details LinK click
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
        el11.click();
        System.out.println("Owner Details LinK click");
        Thread.sleep(5000);

        //Mobile No
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmob");
        el12.sendKeys("1111111111");
        System.out.println("Mobile No");

        // Click to the Next Button
        MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next.click();
        Thread.sleep(2000);

        // Upload button Click
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el13.click();

        //Document type (Droupdown box)
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el15.click();
        // Upload button Click
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el16.click();
        Thread.sleep(5000);

        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el20.click();
        // Upload button Click
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el21.click();
        Thread.sleep(2000);
        //Back to Dashboard
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el22.click();
        Thread.sleep(3000);
    }
    }

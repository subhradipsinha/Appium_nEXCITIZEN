package com.PageObject.Property_Tax_Folder;


import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 12/10/2019
 */

public class Property_Tax extends DriverManagerfile {
    @Test(priority = 6)
    public void property_Tax_Test() throws Exception {
        // Hit To the property Tax Tab
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ptpic");
        el1.click();
        Thread.sleep(2000);

        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/textView1").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Hit To the property Tax Tab");
        } else {
            System.out.println("Not show Hit To the property Tax Tab");
        }

        // Assement For Droupdown box click
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el3.click();
        System.out.println("Assement For Droupdown box click");
        Thread.sleep(2000);


        // Property Details Link Click
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ptextlay");
        el4.click();
        System.out.println("Property Details Link Click");
        Thread.sleep(3000);

        // Hit to the Owner Name Filled
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etowne");
        el5.sendKeys("XYZ");
        System.out.println("Hit to the Owner Name Filled");
        Thread.sleep(2000);

        // House/ Flat No Filled
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethouses");
        el6.sendKeys("240");
        System.out.println("House/ Flat No Filled");

        // Hit Address filed
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etbuilding");
        el7.sendKeys("Bandel");
        System.out.println("Hit Address filed");
        Thread.sleep(2000);

        // total area of land
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ettaolland");
        el8.sendKeys("900");
        System.out.println("total area of land");
        Thread.sleep(2000);

        // Roof Type filled
        MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[5]/android.widget.Spinner/android.widget.TextView");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el10.click();
        System.out.println("Roof Type filled");
        Thread.sleep(2000);

        //Road name filled
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etstreet");
        el11.sendKeys("Bidha sagar Road");
        System.out.println("Road name filled");
        Thread.sleep(2000);

        // Scroll Down
        MobileElement elementscroll = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Ward No\"));");
        elementscroll.click();
        Thread.sleep(2000);

        //Nearest Landmark
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnlm");
        el12.sendKeys("Big Bazar Shop");
        System.out.println("Nearest Landmark");
        Thread.sleep(2000);

        //Post Office Name
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpost");
        el13.sendKeys("Bandel");
        System.out.println("Post Office Name");

        // Pin code
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el14.sendKeys("600013");
        System.out.println("Pin code");

        // District
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdist");
        el15.sendKeys("West Bengal");

        //State
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[11]");
        el17.click();
        System.out.println("State");

        // Country
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcountry");
        el18.sendKeys("India");
        System.out.println("Country");

        //ward no
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etward");
        el19.sendKeys("6");
        System.out.println("ward no");
        Thread.sleep(3000);

        //Scroll
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Owner Name\"));");
        elementscrol.click();

        MobileElement el40 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el40.click();

        // Owner Details LinK click
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
        el20.click();
        System.out.println("Owner Details LinK click");
        Thread.sleep(5000);

        // Click to the Next Button
        MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next.click();

        //Mobile No
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmob");
        el21.sendKeys("1111111111");
        System.out.println("Mobile No");

        // Email Address
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etemail");
        el22.sendKeys("S@yahoo.com");
        System.out.println("Email Address");

        // Click to the Next Button
        MobileElement next1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next1.click();

        //Aadhar No
        MobileElement el23 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etadhaars");
        el23.sendKeys("2222-2222-2222");
        System.out.println("Aadhar No");

       // Click to the Next Button
        MobileElement el24 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el24.click();
        System.out.println("Click to the Next Button");
        Thread.sleep(3000);

        // Upload button Click
        MobileElement el31 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el31.click();
        Thread.sleep(5000);

        //Document type (Droupdown box)
        MobileElement el25 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el25.click();
        MobileElement el26 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el26.click();
        // Upload button Click
        MobileElement el32 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el32.click();
        Thread.sleep(5000);

        MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el27.click();
        MobileElement el28 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el28.click();
        MobileElement el29 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el29.click();
        MobileElement el30 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el30.click();
        // Upload button Click
        MobileElement el33 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el33.click();
        Thread.sleep(2000);
        // Upload button Click
        MobileElement el34 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el34.click();
        Thread.sleep(3000);
        //Back to Dashboard
        MobileElement el35 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el35.click();
        Thread.sleep(3000);
    }
}
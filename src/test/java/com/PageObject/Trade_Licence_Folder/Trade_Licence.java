package com.PageObject.Trade_Licence_Folder;


import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 09/10/2019
 */
public class Trade_Licence extends DriverManagerfile {
    @Test(priority = 5)
    public void Trade_Licence_Test() throws Exception {

        // Hit Trade_Licence Tab Click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/tpic");
        el1.click();
        System.out.println("Hit Trade_Licence Tab Click");
        Thread.sleep(3000);

        // Property Details Droupdown box Click
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/pr");
        el2.click();
        Thread.sleep(3000);
        System.out.println("Property Details Droupdown box Click");

        // Zone Droupdown Box Click
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el4.click();
        Thread.sleep(3000);
        System.out.println("Zone Droupdown Box Click");

        //////////////////////////////////////////////////////////////////************************************///////////////////////////////////

       // Ward Number Droupdown box click
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.Spinner/android.widget.TextView");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el6.click();
        System.out.println("Ward Number Droupdown box click");
        ////////////////////////////////////************************************/////////////////////////////////////////////////////////

        // Hit House No Filled
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethouse");
        el7.sendKeys("265A");
        System.out.println("Hit House No Filled");


        // Scroll Down
        MobileElement elementscrol10 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Pin no\"));");
        elementscrol10.click();
        System.out.println("Scroll Down");

         ////////////////////////////////////////////////////////////////////////////////******************************//////////////////////////////////////////////////////////

        // Hit Building Name
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etbuilding");
        el8.sendKeys("Anujali Building");
        System.out.println("Hit Building Name");
        Thread.sleep(2000);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*****************************//////////////////////////////////////////////
        // Hit of Total area of land Filled
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ettaol");
        el9.sendKeys("4kata");
        System.out.println("Hit of Total area of land Filled");
        Thread.sleep(2000);


        /////////////////////////////////////////////////////*****************************************//////////////////////////////////////
        // Hit to the Roof type Droupdown Box
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el11.click();
        System.out.println("Hit to the Roof type Droupdown Box");
        Thread.sleep(2000);

        ////////////////////////////////////////////////////////////////////************************************************/////////////////////////

        // Hit Street/ Road Name
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etstreet");
        el12.sendKeys("Durgapure Road");
        System.out.println("Hit Street/ Road Name");
        Thread.sleep(2000);

      /////////////////////////////////////////////////////////////////*********************************************///////////////////////////////////

        // Hit Nearest Land Mark
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnlm");
        el13.sendKeys("More shoping Mall");
        System.out.println("Hit Nearest Land Mark");

        // Hit Post office Filled
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpost");
        el14.sendKeys("Durgapore");
        System.out.println("Hit Post office Filled");

        // Scroll Down
        MobileElement elementscrol13 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Amount Paid(Rs.)\"));");
        elementscrol13.click();
        System.out.println("Scroll Down");
        Thread.sleep(2000);

        // Hit pin code
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el15.sendKeys("500001");
        System.out.println("Hit pin code");
        Thread.sleep(2000);

        //Hit to District
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdist");
        el16.sendKeys("Assansole");
        System.out.println("Hit to District");
        Thread.sleep(2000);

        // Hit to State
        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etstate");
        el17.sendKeys("West Bengal");
        System.out.println("Hit to State");
        Thread.sleep(2000);

        //Hit To the Holding No.
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethold");
        el18.sendKeys("201");
        System.out.println("Hit To the Holding No.");
        Thread.sleep(2000);


        //Hit Type of Tax
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el20.click();
        System.out.println("Hit Type of Tax");
        Thread.sleep(2000);

        // Hit Amount paid
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etap");
        el21.sendKeys("50000");
        System.out.println("Hit Ammount Paid");


        // Scroll Down
        MobileElement elementscrol9 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Zone\"));");
        elementscrol9.click();
        System.out.println("Scroll Down");
        // Close Property Details Tab
        MobileElement el = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el.click();

        // Hit Trade Details Link
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
        el22.click();

        // Hit License Type Droupdown Box
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el23.click();
        MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el24.click();
        System.out.println("Hit License Type Droupdown Box");
        Thread.sleep(2000);

        // Hit Last License No
        MobileElement el25 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etlln");
        el25.sendKeys("0000100001234557");
        System.out.println("Hit Last License No");
        Thread.sleep(2000);

        // Hit For the Year Droupdown box
        MobileElement el26 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.Spinner/android.widget.TextView");
        el26.click();
        MobileElement el27 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[12]");
        el27.click();
        System.out.println("Hit For the Year Droupdown box");
        Thread.sleep(2000);

        // Hit to the Firm / company
        MobileElement el28 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnof");
        el28.sendKeys("XYZ");
        System.out.println("Hit to the Firm / company");

        // Name of GSTN no:
        MobileElement el29 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etgstin");
        el29.sendKeys("GN9876456789231H");
        System.out.println("Name of GSTN no:");
        Thread.sleep(2000);

        // Type of Business Structure
        MobileElement el30 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[6]/android.widget.Spinner/android.widget.TextView");
        el30.click();
        MobileElement el31 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el31.click();
        System.out.println("Type of Business Structure");
        Thread.sleep(3000);

        // Hit to the Licence qwner Details Link
        MobileElement el32 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/tradelaydetails");
        el32.click();
        Thread.sleep(2000);
        MobileElement el33 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/lodlay");
        el33.click();
        System.out.println("Hit to the Licence qwner Details Link");
        Thread.sleep(5000);

        // Hit Licence Owner Name filled
        MobileElement el34 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etlon");
        el34.sendKeys("R.Raghav");
        System.out.println("Hit Licence Owner Name filled");
        Thread.sleep(2000);

        // Hit Address Filled
        MobileElement el35 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etadd");
        el35.sendKeys("Durgapore");
        Thread.sleep(2000);
        System.out.println("Hit Address Filled");

        // Next Button Click
        MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next.click();
        System.out.println("Next Button Click");
        Thread.sleep(3000);

        //Hit Mobile number filled
        MobileElement el36 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmob");
        el36.sendKeys("1111111111");
        System.out.println("Hit Mobile number filled");
        Thread.sleep(2000);

        // Next Button Click
        MobileElement next1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next1.click();
        System.out.println("Next Button Click");
        Thread.sleep(3000);

        //Hit Financial Year filled
        MobileElement el37 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfiny");
        el37.sendKeys("2020");
        System.out.println("Hit Financial Year filled");
        Thread.sleep(2000);

        //Hit Comment Filled
        MobileElement el38 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcmnt");
        el38.sendKeys("no comments");
        System.out.println("Hit Comment Filled");

        // Next Button Click
        MobileElement el39 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el39.click();
        System.out.println("Next Button Click");
        Thread.sleep(3000);

        // Submit Button Click
        MobileElement el46 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el46.click();
        System.out.println("Submit Button Click");
        Thread.sleep(5000);

        // Document Type Droupdown box Click
        MobileElement el40 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el40.click();
        MobileElement el41 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el41.click();
        System.out.println("Document Type Droupdown box Click");
        Thread.sleep(2000);
        // Submit Button Click
        MobileElement el47 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el47.click();
        System.out.println("Submit Button Click");
        Thread.sleep(5000);

        // File Upload Click
        MobileElement el42 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el42.click();
        MobileElement el43 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el43.click();
        MobileElement el44 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el44.click();
        MobileElement el45 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el45.click();
        System.out.println("File Upload Click");
        Thread.sleep(2000);

        // Submit Button Click
        MobileElement el48 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el48.click();
        System.out.println("Submit Button Click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el49 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el49.click();
        Thread.sleep(3000);



    }
}

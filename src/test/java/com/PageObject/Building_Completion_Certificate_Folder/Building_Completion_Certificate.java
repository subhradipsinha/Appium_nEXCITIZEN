package com.PageObject.Building_Completion_Certificate_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date:
 */

public class Building_Completion_Certificate extends DriverManagerfile {
    @Test(priority = 10)
    public void Hit_Building_Commpletion_Tab(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bcc");
        el1.click();
    }
    @Test(priority = 11)
    public void Hit_Address_Details_Droupdown() throws Exception {
        //Hit_Address_Details_Droupdown
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el2.click();
        System.out.println("Hit_Address_Details_Droupdown");

        //Zone(Droupdown)
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
        el4.click();
        System.out.println("Zone(Droupdown)");

        //Ward number(Droupdown)
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.Spinner/android.widget.TextView");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el6.click();
        System.out.println("Ward number(Droupdown)");

        //Close_Address_Details_Droupdown
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el7.click();
        System.out.println("Close_Address_Details_Droupdown");
        Thread.sleep(3000);
    }
    @Test(priority = 12)
    public void Hit_Building_Details_Droupdown() throws InterruptedException {
        //Hit_Building_Details_Droupdown()
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
        el8.click();
        System.out.println("Hit_Building_Details_Droupdown()");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Area of Multi Purpose hall\"));");
        elementscrol.click();

        // Submit button click
        MobileElement submit = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit.click();
        ////////////////////////////////////////////////////////////////////////////**************************//////////////////////////////////////////////////////////
        // Scroll Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Owener Name\"));");
        elementscrol1.click();

        // Date of inspection by the Engineer
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etapt");
        el9.sendKeys("08/11/2019");
        System.out.println("Date of inspection by the Engineer");

        //Owner Name
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etname");
        el10.sendKeys("S.K. Dhara");
        System.out.println("Owner Name");
        // Scroll Down
        MobileElement elementscrol2 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Area of Multi Purpose hall\"));");
        elementscrol2.click();

        // Submit button click
        MobileElement submit1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit1.click();
        ////////////////////////////////////////////////////////////////////////////////////////**************************************************//////////////////////////////////////////////

        // Scroll Down
        MobileElement elementscrol11 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Owener Name\"));");
        elementscrol11.click();

        //Type of ownership of land
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.Spinner/android.widget.TextView");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el13.click();
        System.out.println("Type of ownership of land");
        // Scroll Down
        MobileElement elementscrol14 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Area of Multi Purpose hall\"));");
        elementscrol14.click();

        // Submit button click
        MobileElement submit2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit2.click();

        //////////////////////////////////////////////////////////////////////////////////****************************************************/////////////////////////////////////////////////////////////////
        // Scroll Down
        MobileElement elementscrol5 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Owener Name\"));");
        elementscrol5.click();

        //Date of Registration of land
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdorl");
        el15.sendKeys("20/10/2019");
        System.out.println("Date of Registration of land");

        //Registered in the office of sub-registrar with address
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etr");
        el16.sendKeys("Taratala");
        System.out.println("Registered in the office of sub-registrar with address");

        // Scroll Down
        MobileElement elementscrol6 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Area of Multi Purpose hall\"));");
        elementscrol6.click();

        // Building plan approved by(Droupdown box)
        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el18.click();
        System.out.println("Building plan approved by(Droupdown box)");
        ////////////////////////////////////////////////////////////////////////////////////////////*********************************************//////////////////////////////////////////////////////////////////
        //Address
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etadd");
        el19.sendKeys("Salt-Lake");
        System.out.println("Address");

        // Scroll Down
        MobileElement elementscrol9 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"SUBMIT\"));");


        // Submit button click
        MobileElement submit3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit3.click();
        //////////////////////////////////////////////////////////////////////////////////////////****************************************************///////////////////////////////////////
        // Scroll Down
        MobileElement elementscrol8 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Address\"));");
        elementscrol8.click();
        //Year of Construction
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etyoc");
        el20.sendKeys("1989");
        System.out.println("Year of Construction");

        // Submit button click
        MobileElement submit4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit4.click();

        /////////////////////////////////////////////////////////////////////////////////////////////////////*****************************************************////////////////////////////////////////////////////////////
        // Purpose for which the building in being used
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpur");
        el21.sendKeys("Rent for PG");
        System.out.println("Purpose for which the building in being used");

        // Submit button click
        MobileElement submit5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit5.click();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*******************************************************////////////////////////////////////////////////////
        // Roof Type(Droupdown box)
        MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[5]/android.widget.Spinner/android.widget.TextView");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el23.click();
        System.out.println("Roof Type(Droupdown box)");

        // Submit button click
        MobileElement submit6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit6.click();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////******************************************************************////////////////////////////////////////////////////////////////////

        // Area of Muilti purpose hall
        MobileElement el24 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etamh");
        el24.sendKeys("Kolkata");
        System.out.println("Area of Muilti purpose hall");

        // Submit button click
        MobileElement submit7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit7.click();

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////************************************************////////////////////////////////////////////////////////////////////////////////////
        // doucment Type(Droupdown box)
        MobileElement el25 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/doctype");
        el25.click();
        MobileElement el26 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el26.click();
        System.out.println("doucment Type(Droupdown box)");

        // Submit button click
        MobileElement submit8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit8.click();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////******************************************/////////////////////////////////////////////////////////////////////
        // photo upload
        MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el27.click();
        MobileElement el28 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el28.click();
        MobileElement el29 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el29.click();
        MobileElement el30 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el30.click();
        System.out.println("photo upload");
        Thread.sleep(5000);

        // Submit button click
        MobileElement submit9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit9.click();
        System.out.println("Submit button click");
        Thread.sleep(5000);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////***********************************************///////////////////////////////////////////////////////////////////
        //Back to Dashboard
        MobileElement el31 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el31.click();
        System.out.println("Back to the Dashboard");
        Thread.sleep(3000);

        //Scroll Dashboard
        // Scroll Down
        MobileElement elementscrol7 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        System.out.println("Scroll Dashboard");
        Thread.sleep(3000);
        }
}

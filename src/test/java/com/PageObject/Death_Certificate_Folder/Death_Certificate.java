package com.PageObject.Death_Certificate_Folder;


import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 03/10/2019
 */

// Extend filled used Appium_ConfigarationManager file

@Test
public class Death_Certificate extends DriverManagerfile {

    @Test(priority = 5)
    public void Registrasion() throws Exception {

        // Hit to Death Certificated Tab
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/deathlays");
        el1.click();
        System.out.println("Hit to Death Certificated Tab");

        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/textView1").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Hit to Death Certificated Tab");
        } else {
            System.out.println("Not show Hit to Death Certificated Tab");
        }


        // Hit Link Applicant Details
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el2.click();
        System.out.println("Hit Link Applicant Details");
        Thread.sleep(3000);

        // Hit to Droupdown Box(Relationship)
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el4.click();
        System.out.println("Hit to Droupdown Box(Relationship)");
        Thread.sleep(2000);

        ////////////////////////////////////////////////////////////////////////////***********************************////////////////////////////

        // Hit to the Appication name
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etappname");
        el5.sendKeys("abc");
        System.out.println("Hit to the Appication name");
        Thread.sleep(2000);
        //////////////////////////////////////////////////////////////*****************************************////////////////////////////////////////

        // Hit Age filled
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etage");
        el6.sendKeys("30");
        System.out.println("Hit Age filled");
        /////////////////////////////////////////////////////////////////////////////////////***************************************//////////////////////////////////////

        // Hit Scroll down (Sex)
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.Spinner/android.widget.TextView");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el8.click();
        System.out.println("Hit Scroll down (Sex)");

        ///////////////////////////////////////////////////////////////////////////////////////////*****************************************//////////////////////////////////////////////
        // Hit Mobile no filled
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmob");
        el9.sendKeys("1111111111");
        System.out.println("Hit Mobile no filled");

        ///////////////////////////////////////////////////////////////////////////////////////*******************************************//////////////////////////////////

        //Hit Email Id filled
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etemail");
        el10.sendKeys("a@yahoo.com");
        System.out.println("Hit Email Id filled");
       ////////////////////////////////////////////////////////////////////////////////////************************************//////////////////////////////////////
        //Close Application Details Tab
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el11.click();
        System.out.println("Death Certificated Tab");
        Thread.sleep(2000);

        // Hit Death person Details Tab
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
        el12.click();
        System.out.println("Hit Death person Details Tab");
        ////////////////////////////////////////////////////////////////////////////////***************************************//////////////////////////////////////////

        //Scroll Down
        MobileElement elementscrol17 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol17.click();
        // Next Button Click
        MobileElement Text20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text20.click();
        //Scroll Down
        MobileElement elementscrol16 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Death Person\"));");
        elementscrol16.click();
        ////////////////////////////////////////////////////////////////////////////////****************************************///////////////////////////////////////

        //Hit Death Person Name filled
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdp");
        el13.sendKeys("xxy");
        System.out.println("Hit Death Person Name filled");
        //Scroll Down
        MobileElement elementscrol15 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol15.click();

        // Next Button Click
        MobileElement Text7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text7.click();
        System.out.println("Next Button Click");
        //////////////////////////////////////////////////////////////////////////////////////*************************************///////////////////////////
        // Scroll in Down
        MobileElement elementscrol8 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Death Person\"));");
        elementscrol8.click();

        //Hit Death Person Date of Birth filled
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdobdead");
        el14.sendKeys("20/03/1954");
        System.out.println("Hit Death Person Date of Birth filled");
        // Scroll in Down
        MobileElement elementscrol9 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol9.click();
        // Next Button Click
        MobileElement Text8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text8.click();
        System.out.println("Next Button Click");
        ////////////////////////////////////////////////////////////////////////////////////////////******************************************///////////////////////////////////////////////
        // Scroll in Down
        MobileElement elementscrol4 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Death Person\"));");
        elementscrol4.click();

        //Hit Death Person Age filled
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etaged");
        el15.sendKeys("69");
        System.out.println("Hit Death Person Age filled");

        // Scroll in Down
        MobileElement elementscrol10 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol10.click();
        // Next Button Click
        MobileElement Text9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text9.click();
        System.out.println("Next Button Click");
        /////////////////////////////////////////////////////////////////////////////////////////////************************************//////////////////////////////////
        // Scroll in Down
        MobileElement elementscrol11 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Death Person\"));");
        elementscrol11.click();

        //Hit Droupdown box(Sex)
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el17.click();
        System.out.println("Hit Droupdown box(Sex)");

        // Scroll in Down
        MobileElement elementscrol12 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol12.click();
        // Next Button Click
        MobileElement Text10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text10.click();
        System.out.println("Next Button Click");
        //////////////////////////////////////////////////////////////////////////**********************************************///////////////////////////////////////

        // Scroll in Down
        MobileElement elementscrol13 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Death Person\"));");
        elementscrol13.click();
        // Hit Death person Present Location
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etparentadd");
        el18.sendKeys("Kolkata");
        System.out.println("Hit Death person Present Location");
        // Scroll in Down
        MobileElement elementscrol14 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol14.click();
        // Next Button Click
        MobileElement Text11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text11.click();
        System.out.println("Next Button Click");
        /////////////////////////////////////////////////////////////////////////////////////**********************************************///////////////////////////////////////////
        // Scroll in Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Death Person\"));");
        elementscrol1.click();
         //Hit Death person Parmanent Location
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpad");
        el19.sendKeys("Kolkata");
        System.out.println("Hit Death person Parmanent Location");
        Thread.sleep(3000);
        // Scroll in Down
        MobileElement elementscrol33 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol33.click();
        // Next Button Click
        MobileElement Text12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text12.click();
        System.out.println("Next Button Click");
        /////////////////////////////////////////////////////////////////////////////////////***************************************/////////////////////////////

        // Scroll in Down
        MobileElement elementscroll7 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Pin No\"));");
        elementscroll7.click();

        //Hit Pin code filled
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el20.sendKeys("700001");
        System.out.println("Hit Pin code filled");
        // Scroll in Down
        MobileElement elementscrol18 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol18.click();
        // Next Button Click
        MobileElement Text13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text13.click();
        System.out.println("Next Button Click");
        /////////////////////////////////////////////////////////////////////////////////////****************************************////////////////////////////////////////

        // Scroll in Down
        MobileElement elementscroll9 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Date of application\"));");
        elementscroll9.click();
        // Hit Dete of Application Filled
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdates");
        el21.sendKeys("10/10/2019");
        System.out.println("Hit Dete of Application Filled");

        // Scroll in Down
        MobileElement elementscrol20 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol20.click();

        // Next Button Click
        MobileElement Text14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text14.click();
        System.out.println("Next Button Click");

        ////////////////////////////////////////////////////////////////////////////////////////*************************************************//////////////////////////////////////////////

        // Scroll in Down
        MobileElement elementscrol21 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Date of application\"));");
        elementscrol21.click();

        // Hit AAdhar No filled
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etadhar");
        el22.sendKeys("2222-2222-2222");
        System.out.println("Hit AAdhar No filled");
        // Scroll in Down
        MobileElement elementscrol22 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol22.click();
        // Next Button Click
        MobileElement Text15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text15.click();
        System.out.println("Next Button Click");

        ///////////////////////////////////////////////////////////////////////////////////////***************************************************//////////////////////////////////////

        // Scroll in Down
        MobileElement elementscroll6 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Date of application\"));");
        elementscroll6.click();

        // Hit Death Type filled
        MobileElement el23 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdeathtype");
        el23.sendKeys("Hurt Attack");
        System.out.println("Hit Death Type filled");
        // Scroll in Down
        MobileElement elementscrol23 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol23.click();
        // Next Button Click
        MobileElement Text16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text16.click();
        System.out.println("Next Button Click");
        /////////////////////////////////////////////////////////////////////*************************************////////////////////////////////////////

        // Scroll in Down
        MobileElement elementscrol24 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Date of application\"));");
        elementscrol24.click();
        // Hit Details Type filled
        MobileElement el24 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdetail");
        el24.sendKeys("No");
        System.out.println("Hit Details Type filled");
        // Scroll in Down
        MobileElement elementscrol25 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol25.click();
        // Next Button Click
        MobileElement Text17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text17.click();
        System.out.println("Next Button Click");
        //////////////////////////////////////////////////////////////////////******************************************//////////////////////////////////////////////////

        // Scroll in Down
        MobileElement elementscrol26 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Date of application\"));");
        elementscrol26.click();
        //Hit District filled
        MobileElement el25 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdist");
        el25.sendKeys("Hooghly");
        System.out.println("Hit District filled");
        // Scroll in Down
        MobileElement elementscrol27 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol27.click();

        // Next Button Click
        MobileElement Text18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text18.click();
        System.out.println("Next Button Click");
        //////////////////////////////////////////////////////////////////////////*******************************************/////////////////////////////////
        // Scroll in Down
        MobileElement elementscrol28 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Details\"));");
        elementscrol28.click();

        // Hit State Filled
        MobileElement el26 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etstate");
        el26.sendKeys("WestBengal");
        System.out.println("Hit State Filled");
        // Scroll in Down
        MobileElement elementscrol29 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol29.click();
        // Next Button Click
        MobileElement Text19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text19.click();
        System.out.println("Next Button Click");
        ///////////////////////////////////////////////////////////////////////*****************************************************////////////////////////////////////////////
        // Scroll in Down
        MobileElement elementscrol30 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Details\"));");
        elementscrol30.click();

        // Hit Country Filled
        MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcountry");
        el27.sendKeys("India");
        System.out.println("Hit Country Filled");

        // Scroll in Down
        MobileElement elementscrol31 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Place of Death\"));");
        elementscrol31.click();
        // Next Button Click
        MobileElement Text21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Text21.click();
        System.out.println("Next Button Click");

        /////////////////////////////////////////////////////////////////////////////////****************************************/////////////////////////////
        // Hit Date of Death
        MobileElement el28 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdate");
        el28.sendKeys("25/02/2019");
        System.out.println("Hit Date of Death");
        Thread.sleep(2000);
        // Hit Place of Death
        MobileElement el29 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpod");
        el29.sendKeys("Kolkata");
        System.out.println("Hit Place of Death");
        Thread.sleep(2000);

        // Next Button Click
        MobileElement el30 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el30.click();
        System.out.println("Next Button Click");

        //Hit Submit button click
        MobileElement el39 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el39.click();
        System.out.println("Submit button click");

        // Droup-down bok click(Document Type)
        MobileElement el31 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el31.click();
        Thread.sleep(3000);
        MobileElement el32 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el32.click();
        Thread.sleep(3000);
        System.out.println("Droup-down bok click(Document Type)");

        //Hit Submit button click
        MobileElement el40 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el40.click();
        Thread.sleep(3000);
        System.out.println("Submit button click");
        Thread.sleep(3000);

        //Hit to the Upload File
        MobileElement el41 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el41.click();
        MobileElement el42 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el42.click();
        Thread.sleep(5000);
        MobileElement el43 = (MobileElement) driver.findElementByAccessibilityId("Shutter button");
        el43.click();
        MobileElement el44 = (MobileElement) driver.findElementById("com.android.camera:id/btn_done");
        el44.click();
        // Click Submit Button
        MobileElement el45 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el45.click();
        //Hit Submit button click
        MobileElement el46 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el46.click();
        System.out.println("Submit button click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el47 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el47.click();

        //Hit Submit button click
        MobileElement el48 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el48.click();
        System.out.println("Submit button click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el49 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el49.click();

        


    }
}
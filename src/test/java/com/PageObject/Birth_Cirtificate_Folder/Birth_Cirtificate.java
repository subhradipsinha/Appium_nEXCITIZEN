package com.PageObject.Birth_Cirtificate_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 30/09/2018
 */

@Test
// Extend to Appium_ConfigarationManager Class
public class Birth_Cirtificate extends DriverManagerfile {
    @Test(priority = 4)
    public void Birth_Cirtificate_Text() throws Exception {

        // Hit to Birth Certificate
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/blay");
        el1.click();
        Thread.sleep(3000);

        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/textView1").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Hit to Birth Certificate List");
        } else{
            System.out.println("Not show Hit to Birth Certificate List");
        }


        // Hit to Application Details DroupDown Box
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el2.click();
        System.out.println("Hit to Application Details DroupDown Box");

        // Scroll Down
        MobileElement elementscroll = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Relationship with applicant\"));");
        elementscroll.click();
        // Click to the Next Button
        MobileElement Test = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test.click();
        // Scroll Down
        MobileElement elementscrol2 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Child\"));");
        elementscrol2.click();
        ///////////////////////////////////////////////////////////////////////////////////**************************//////////////////////////////////////////////////////

        // Hit to the Name of Child filled
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etname");
        el3.sendKeys("Subhradip Sinha");
        System.out.println("Hit to the Name of Child filled");
        // Scroll Down
        MobileElement elementscrol3 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Relationship with applicant\"));");
        elementscrol3.click();
        // Click to the Next Button
        MobileElement Test1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test1.click();
        // Scroll Down
        MobileElement elementscrol4 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Child\"));");
        elementscrol4.click();
        /////////////////////////////////////////////////////////////////////////////////*****************************************//////////////////////////////////////////////////////
        //Hit to the DOB filled
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdob");
        el4.sendKeys("07/02/1993");
        System.out.println("Hit to the DOB filled");
        // Scroll Down
        MobileElement elementscrol5 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Relationship with applicant\"));");
        elementscrol5.click();
        // Click to the Next Button
        MobileElement Test2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test2.click();
        // Scroll Down
        MobileElement elementscrol6 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Child\"));");
        elementscrol6.click();
        ////////////////////////////////////////////////////////////////////////////**********************//////////////////////////////////////////////////

        //Hit to the DroupDown Box(Gender)
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el6.click();
        System.out.println("Hit to the DroupDown Box(Gender)");
        // Scroll Down
        MobileElement elementscrol7 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Relationship with applicant\"));");
        elementscrol7.click();
        // Click to the Next Button
        MobileElement Test3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test3.click();
        // Scroll Down
        MobileElement elementscrol8 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Child\"));");
        elementscrol8.click();
        /////////////////////////////////////////////////////////////////////////////////////**********************************************///////////////////////////////////////////////
        //Hit to the Birth Place
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etbp");
        el7.sendKeys("Serampore");
        System.out.println("Hit to the Birth Place");
        // Scroll Down
        MobileElement elementscrol9 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Relationship with applicant\"));");
        elementscrol9.click();
        // Click to the Next Button
        MobileElement Test4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test4.click();

        // Scroll Down
        MobileElement elementscrol10 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Child\"));");
        elementscrol10.click();
        /////////////////////////////////////////////////////////////////////****************************************//////////////////////////////////////////////////////////////////

        //Hit to the Present Address
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etadd");
        el8.sendKeys("Serampore");
        System.out.println("Hit to the Present Address");
        // Scroll Down
        MobileElement elementscrol11 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Relationship with applicant\"));");
        elementscrol11.click();

        // Click to the Next Button
        MobileElement Test5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test5.click();
        // Scroll Down
        MobileElement elementscrol12 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Child\"));");
        elementscrol12.click();

        /////////////////////////////////////////////////////////////////////////////////////////////*******************************///////////////////////////////////////

        //Hit to the Parmanent Address
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etperadd");
        el9.sendKeys("Serampore");
        System.out.println("Hit to the Parmanent Address");
        // Scroll Down
        MobileElement elementscrol13 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Relationship with applicant\"));");
        elementscrol13.click();
        // Click to the Next Button
        MobileElement Test6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test6.click();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////***************************************///////////////////////////////////////////////

        //Hit to the Family Religion
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfamr");
        el10.sendKeys("Hindu");
        System.out.println("Hit to the Family Religion");
        // Click to the Next Button
        MobileElement Test7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test6.click();
        Thread.sleep(2000);
        //////////////////////////////////////////////////////////////////////////////////////////////////************************************************//////////////////////////////////////////

        //Hit to the Father name Filled
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfather");
        el11.sendKeys("Pradip kumar Sinha");
        System.out.println("Hit to the Father name Filled");
        // Click to the Next Button
        MobileElement Test8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test8.click();
        Thread.sleep(2000);
        //////////////////////////////////////////////////////////////////////////////////////////////*************************************///////////////////////////////////////////////

        //Hit to the Mother name Filled
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmother");
        el12.sendKeys("Mamata Sinha");
        System.out.println("Hit to the Mother name Filled");
        // Click to the Next Button
        MobileElement Test9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test9.click();
        Thread.sleep(2000);
        ////////////////////////////////////////////////////////////////////////////////////////////////******************************/////////////////////////////////////////////

        // Hit to the Father Occupation Fille
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfatherocc");
        el13.sendKeys("Service");
        System.out.println("Hit to the Father Occupation Filled");

        // Click to the Next Button
        MobileElement Test10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test10.click();
        Thread.sleep(2000);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////*******************************************////////////////////////////////////////////

        //Hit to the Mother Occupation Filled
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmotherocc");
        el14.sendKeys("HomeMaker");
        System.out.println("Hit to the Mother Occupation Filled");
        // Click to the Next Button
        MobileElement Test11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test11.click();
        Thread.sleep(2000);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////********************8///////////////////////////

        // Hit to the Applicant Name
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etapp");
        el15.sendKeys("Rajdeep");
        System.out.println("Hit to the Applicant Name");
        // Click to the Next Button
        MobileElement Test12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test12.click();
        Thread.sleep(2000);
        //////////////////////////////////////////////////////////////////////////////////////////////*********************************/////////////////////////
        //Hit to the Relation with Applicant Name
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etrl");
        el16.sendKeys("Brother");
        System.out.println("Hit to the Relation with Applicant Name");
        // Click to the Next Button
        MobileElement Test13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Test13.click();
        System.out.println("Click to the Next Button");
        Thread.sleep(2000);
        // Click Submit Button
        MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el27.click();
        System.out.println("Click Submit Button");
        //////////////////////////////////////////////////////////////////////////////////////////******************************////////////////////////////////////

        // Hit Droupdown Box(Type)
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el19.click();
        System.out.println("Hit Droupdown Box(Type)");

        // Click Submit Button
        MobileElement el28 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el28.click();
        System.out.println("Click Submit Button");


        // Hit Droupdown Box(document Type)
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/doctype");
        el20.click();

        MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el21.click();
        System.out.println("Hit Droupdown Box(document Type)");
        // Click Submit Button
        MobileElement el29 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el29.click();
        System.out.println("Click Submit Button");

        //Hit to the Upload File
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el22.click();
        Thread.sleep(3000);
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el23.click();
        Thread.sleep(3000);
        MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el24.click();
        Thread.sleep(3000);
        MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el25.click();
        System.out.println("Hit to the Upload File");
        Thread.sleep(3000);
        // Click Submit Button
        MobileElement el26 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el26.click();
        System.out.println("Click Submit Button");
        Thread.sleep(10000);
        //Back to Dashboard
        MobileElement el30 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el30.click();
        System.out.println("Back to Dashboard");
        Thread.sleep(3000);


    }

}

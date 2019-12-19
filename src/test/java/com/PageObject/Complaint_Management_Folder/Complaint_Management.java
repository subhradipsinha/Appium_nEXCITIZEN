package com.PageObject.Complaint_Management_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 22/10/2019
 */

@Test
public class Complaint_Management extends DriverManagerfile {

    @Test(priority = 16)
    public void Hit_Complaint_Management_Tab() throws InterruptedException {
        // Scroll Down
        MobileElement elementscrol6 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/cm");
        el1.click();
        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/textView1").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Hit_Complaint_Management_Tab");
        } else {
            System.out.println("Not show Hit_Complaint_Management_Tab");
        }
    }
    @Test(priority = 17)
    public void Complain_Details_Link() throws InterruptedException {
        //Complain_Details_Link
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el2.click();
        System.out.println("Complain_Details_Link");

        //Submit button Click
        MobileElement submit = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit.click();
        /////////////////////////////////////////////////////////////////////////////////////////////*************************************////////////////////////////////////////////////////////
        // Complan and registered user are same(Droupdown box)
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el4.click();
        System.out.println("Complan and registered user are same(Droupdown box)");

        //Submit button Click
        MobileElement submit1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit1.click();
        //////////////////////////////////////////////////////////////////////////////////////******************************************************////////////////////////////////////////////////////////////

        //Name of person Making Complaint
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etname");
        el5.sendKeys("S.K.BAG");
        System.out.println("Name of person Making Complaint");

        //Submit button Click
        MobileElement submit2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit2.click();
        /////////////////////////////////////////////////////////////////////////////////////************************************************************/////////////////////////////////////////

        //Mobile Number
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmob");
        el6.sendKeys("1111111111");
        System.out.println("Mobile Number");
        //Submit button Click
        MobileElement submit3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit3.click();
        ////////////////////////////////////////////////////////////////////////////////////*****************************************************///////////////////////////////////////////////////////////////////////////

        // Address
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etaddress");
        el7.sendKeys("KaliTala Kolkata");
        System.out.println("Address");
        //Scroll
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Date of complaint\"));");
        elementscrol.click();

        //Submit button Click
        MobileElement submit5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit5.click();
        ///////////////////////////////////////////////////////////////////////////////////////////////***************************************************************/////////////////////////////////////////////////////////////

        // Nature of Complaint
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnoc");
        el8.sendKeys("Hodding Size not correct, and Hodding effected in my house");
        System.out.println("Nature of Complaint");

        //Submit button Click
        MobileElement submit6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit6.click();
        /////////////////////////////////////////////////////////////////////////////////////////////**************************************************///////////////////////////////////////////////////

        //Date of Complaint
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdate");
        el9.sendKeys("07/11/2019");
        System.out.println("Date of Complaint");

        //Submit button Click
        MobileElement submit7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit7.click();
        /////////////////////////////////////////////////////////////////////////////////////////////**********************************************///////////////////////////////////////////////////////
        //Hit to the Upload File
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el11.click();
        Thread.sleep(5000);
        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Shutter button");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementById("com.android.camera:id/btn_done");
        el13.click();
        // Click Submit Button
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el14.click();
        System.out.println("Submit button Click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el15.click();
        System.out.println("Back to Dashboard");
        Thread.sleep(3000);

        // Scroll Down
        MobileElement elementscrol5 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);

    }

}

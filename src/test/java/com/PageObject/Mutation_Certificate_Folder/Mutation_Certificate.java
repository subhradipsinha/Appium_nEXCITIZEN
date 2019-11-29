package com.PageObject.Mutation_Certificate_Folder;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

/**
 * @author Subhradip Sinha
 * Date: 24/10/2019
 */

@Test
// Extend to Appium_ConfigarationManager Class
public class Mutation_Certificate extends DriverManagerfile
{
    @Test(priority = 18)
    public void Hit_Mutation_Certificate_Tab() throws InterruptedException {

        // Scroll Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);
        //Hit_Mutation_Certificate_Tab
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/mc");
        el1.click();
        System.out.println("Hit_Mutation_Certificate_Tab");
    }
    @Test(priority = 19)
    public void Address_Seletion_Link() throws Exception {
        //Address_Seletion_Link
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el2.click();
        System.out.println("Address_Seletion_Link");
        Thread.sleep(2000);

        //Close Address_Seletion_Link
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el3.click();
        System.out.println("Close Address_Seletion_Link");
    }
    @Test(priority = 20)
    public void Mutation_Details_Link(){
        //Mutation_Details_Link
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
        el4.click();
        System.out.println("Mutation_Details_Link");

        //Nature of Mutation
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnom");
        el5.sendKeys("Joint");
        System.out.println("Nature of Mutation");

        //Holding No.
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethn");
        el6.sendKeys("26A");
        System.out.println("Holding No.");

        //Name of Street of Village
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnsv");
        el7.sendKeys("Barampore(Ship ghat)");
        System.out.println("Name of Street of Village");

        //Area(Sq. Ft)
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etarea");
        el8.sendKeys("900");
        System.out.println("Area(Sq. Ft)");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"House Details\"));");
        elementscrol.click();


        // C.S Plot No.
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcspn");
        el9.sendKeys("300");
        System.out.println("C.S Plot No.");

        // C.S Khatian No.
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcskn");
        el10.sendKeys("106B");
        System.out.println("C.S Khatian No.");

        //R.s plot No.
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etrspn");
        el11.sendKeys("1002");
        System.out.println("R.s plot No.");

        //R.s Khatian No.
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etrskn");
        el12.sendKeys("900");
        System.out.println("R.s Khatian No.");

        //Price(in Rupees)
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpir");
        el13.sendKeys("5000000");
        System.out.println("Price(in Rupees)");

        //Whether Purchased the entire Holding or a part of it
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etwpeh");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el15.click();
        System.out.println("Whether Purchased the entire Holding or a part of it");

        // Scroll Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Nature of Mutation\"));");
        elementscrol1.click();

        //Close_Mutation_Details_Link
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow1");
        el16.click();
        System.out.println("Close_Mutation_Details_Link");
    }
    @Test(priority = 21)
    public void House_Details_Link()
    {
        //House_Details_Link
        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow2");
        el17.click();
        System.out.println("House_Details_Link");

        //Floor No.
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfln");
        el18.sendKeys("3rd");
        System.out.println("Floor No.");

        //No. of rooms
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnor");
        el19.sendKeys("3");
        System.out.println("No. of rooms");

        //No. of Vaarandah
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnob");
        el20.sendKeys("1");
        System.out.println("No. of Vaarandah");

        //No of Wall
        MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnow");
        el21.sendKeys("8");
        System.out.println("No of Wall");

        //No. of S/L
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnosl");
        el22.sendKeys("4");
        System.out.println("No. of S/L");

        //Close House_Details_Link
        MobileElement el23 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow2");
        el23.click();
        System.out.println("Close House_Details_Link");
    }
    @Test(priority = 22)
    public void Application_Details_Link()
    {
        //Application_Details_Link
        MobileElement el24 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow3");
        el24.click();
        System.out.println("Application_Details_Link");

        //Applicant Name
        MobileElement el25 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etapname");
        el25.sendKeys("XYZ");
        System.out.println("Applicant Name");

        //Father's / Husband Name
        MobileElement el26 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfhname");
        el26.sendKeys("R.J");
        System.out.println("Father's / Husband Name");

        //Address
        MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etad");
        el27.sendKeys("Kolkata");
        System.out.println("Address");

        //Close_Application_Details_Link
        MobileElement el28 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow3");
        el28.click();
        System.out.println("Close_Application_Details_Link");
    }
    @Test(priority = 23)
    public void Owner_Details_Link() throws InterruptedException {
        //Owner_Details_Link
        MobileElement el29 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow4");
        el29.click();
        System.out.println("Owner_Details_Link");
        //Name of the Vendor / Previous Owner
        MobileElement el30 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnopa");
        el30.sendKeys("R.K.Saha");
        System.out.println("Name of the Vendor / Previous Owner");
        //Father's / Husband Name
        MobileElement el31 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfhn");
        el31.sendKeys("A.K.Saha");
        System.out.println("Father's / Husband Name");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"NEXT\"));");

        // Address
        MobileElement el32 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etadd");
        el32.sendKeys("Kolkata");
        System.out.println("Address");

        // Next Button Click
        MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next.click();

        //Date of Death
        MobileElement el33 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdod");
        el33.sendKeys("17/10/2019");
        System.out.println("Date of Death");

        //Comment
        MobileElement el34 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcomment");
        el34.sendKeys("No");
        System.out.println("Comment");

        // Next Button Click
        MobileElement el35 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el35.click();
        System.out.println("Next Button Click");

        // Upload Button Click
        MobileElement Upload = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Upload.click();

        //Document Type
        MobileElement el36 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el36.click();
        MobileElement el37 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el37.click();
        System.out.println("Document Type");

        // Upload Button Click
        MobileElement Upload1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        Upload1.click();


        //Upload Photo
        MobileElement el38 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el38.click();
        MobileElement el39 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el39.click();
        MobileElement el40 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el40.click();
        MobileElement el41 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el41.click();
        System.out.println("Upload Photo");

        // Upload Button Click
        MobileElement el42 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el42.click();
        System.out.println("Upload Button Click");
        Thread.sleep(5000);

        //Back to Dashboard
        MobileElement el43 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el43.click();
        System.out.println("Back to the Mane menu");
        Thread.sleep(3000);

        // Scroll Down
        MobileElement elementscrol2 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);


    }

}

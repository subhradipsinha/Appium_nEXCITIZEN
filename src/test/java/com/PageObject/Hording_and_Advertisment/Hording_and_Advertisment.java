package com.PageObject.Hording_and_Advertisment;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

@Test
public class Hording_and_Advertisment extends DriverManagerfile {

    @Test(priority = 13)
    //Hording_and_Advertisment_Tab
    public void Hording_and_Advertisment_Tab() throws InterruptedException {
        // Scroll Down
        MobileElement elementscrol5 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/haa");
        el1.click();
        System.out.println("Hording_and_Advertisment_Tab");
    }
    @Test(priority = 14)
    public void Applicant_Details_Link(){
        //Hit_Applicant_Details_Link
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el2.click();
        System.out.println("Hit_Applicant_Details_Link");

        //Name of Applicant
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etname");
        el3.sendKeys("K.K.Das");
        System.out.println("Name of Applicant");
        //Name of the Company/Firm
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcom");
        el4.sendKeys("XYZ.com");
        System.out.println("Name of the Company/Firm");
        //Status of Applicant
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        el6.click();
        System.out.println("Status of Applicant");
        //Present Address
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpadd");
        el7.sendKeys("Kolkata");
        System.out.println("Present Address");

        //Permanent Address
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpardd");
        el8.sendKeys("Brackpore");
        System.out.println("Permanent Address");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Office Landline No.\"));");
        elementscrol.click();

        // Phone number
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmob");
        el9.sendKeys("1111111111");
        System.out.println("Phone number");

        // Landline Number
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ettel");
        el10.sendKeys("033-2632-2489");
        System.out.println("Landline Number");

        //Office Address
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etofadd");
        el11.sendKeys("Barackpore");
        System.out.println("Office Address");

        //Office Landline number
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etoflan");
        el12.sendKeys("033-2662-7786");
        System.out.println("Office Landline number");
        //Description of site on which the advertisement is intended to be displayed and size
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etdes");
        el13.sendKeys("620*806");
        System.out.println("Description of site on which the advertisement.....");

        // Scroll Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Name of Applicant\"));");
        elementscrol1.click();

        //Close_Applicant_Details_Link
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/uparrow");
        el14.click();
        System.out.println("Close_Applicant_Details_Link");

    }
    @Test(priority = 15)
    public void Hit_Hording_Details_Link(){
        //Hit_Hording_Details_Link
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow1");
        el15.click();
        System.out.println("Hit_Hording_Details_Link");
        //Number of Hording
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Spinner/android.widget.TextView");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]");
        el7.click();
        System.out.println("Number of Hording");
        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Whether Lit/Non-Lit\"));");
        elementscrol.click();
        //Next Button Click
        MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next.click();
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////***************************************************/////////////////////////////////////////////////////////////////////////////////
        // Scroll Down
        MobileElement elementscrol1 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Number of Hording\"));");
        elementscrol1.click();
        //Location of each hoarding with relation to the address and land mark
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etloc");
        el8.sendKeys("Hazra Bus-stand");
        System.out.println("Location of each hoarding with relation to the address and land mark");
        //Size of each hoarding
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etsize");
        el9.sendKeys("600*400");
        System.out.println("Size of each hoarding");

        // Name of the owner and the Municipal Holding No.
        MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.EditText");
        el10.sendKeys("No Idea");
        System.out.println("Name of the owner and the Municipal Holding No.");

        // Scroll Down
        MobileElement elementscrol2 = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Size of each hoarding\"));");
        elementscrol2.click();





    }
}

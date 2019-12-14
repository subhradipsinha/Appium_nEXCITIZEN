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
    public void Applicant_Details_Link() throws InterruptedException {
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
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"submit\"));");


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

        //Number of Hording
        MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[10]/android.widget.Spinner/android.widget.TextView");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
        el15.click();
        System.out.println("Number of Hording");

        //Next Button Click
        MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next.click();
        Thread.sleep(4000);

        // Droupdown Document Type
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el17.click();

        // Hit Upload Photo
        MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el18.click();
        Thread.sleep(3000);

        MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el19.click();
        Thread.sleep(3000);
        MobileElement el20 = (MobileElement) driver.findElementByAccessibilityId("Shutter button");
        el20.click();
        Thread.sleep(3000);
        MobileElement el21 = (MobileElement) driver.findElementById("com.android.camera:id/btn_done");
        el21.click();
        Thread.sleep(3000);

        //Next Button Click
        MobileElement submit = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        submit.click();
        Thread.sleep(3000);

        //Back to Dashboard
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el22.click();
        Thread.sleep(3000);



    }
}

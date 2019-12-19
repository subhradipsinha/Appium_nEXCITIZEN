package com.PageObject.Water_Supply_Folder;

import com.demo.DriverManagerfile;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;


/**
 * @author Subhradip Sinha
 * Date: 30/10/2019
 */
@Test
public class Water_Supply extends DriverManagerfile {
    @Test(priority = 24)
    public void Hit_Water_Supply_Tab() throws InterruptedException {
        // Scroll Down
        MobileElement elementscrol= (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");
        Thread.sleep(2000);

        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/water");
        el1.click();
        Thread.sleep(3000);
        // Apply for condition
        Boolean isPresent = driver.findElementsById("com.nex.nexcitizen:id/textView1").size() > 0;

        if (isPresent == true) {
            System.out.println("Sucessfully Hit Water_Supply Tab");
        } else {
            System.out.println("Not show Hit Water_Supply Tab");
        }



    }
    @Test(priority = 25)
    public void Application_Details_Link(){
        //Application_Details_Link
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/downarrow");
        el2.click();
        System.out.println("Application_Details_Link");

    }
    @Test(priority = 26)
    public void Application_Details_From() throws InterruptedException {
        //Applicant Name
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etapp");
        el3.sendKeys("K.K.Dhara");
        System.out.println("Applicant Name");

        //Father Name
        MobileElement el4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etfather");
        el4.sendKeys("A.K.Dhara");
        System.out.println("Father Name");

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Size of Plot\"));");


        //Pin no.
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etpin");
        el5.sendKeys("111111");
        System.out.println("Pin no.");

        // Mobile Number
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etmob");
        el6.sendKeys("1111111111");
        System.out.println("Mobile Number");

        // HOUSE no.
        MobileElement el7 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/ethouse");
        el7.sendKeys("26A");
        System.out.println("HOUSE no.");

        //J.L no
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etjl");
        el8.sendKeys("26");
        System.out.println("J.L no");

        //Plot no.
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etplot");
        el9.sendKeys("36");
        System.out.println("Plot no.");

        //Size of Plot
        MobileElement el10 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etsplot");
        el10.sendKeys("1200*600");
        System.out.println("Size of Plot");

        // Next Button Click
        MobileElement next = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        next.click();

        //Category of plot
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etcat");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el12.click();
        System.out.println("Category of plot");

        //No of Flat
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etnflat");
        el13.sendKeys("6");
        System.out.println("No of Flat");

        //Requirement of water per day
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/etrow");
        el14.sendKeys("50");
        System.out.println("Requirement of water per day");

        // Next Button Click
        MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el15.click();
        System.out.println("Next Button Click");

        //Upload button Click
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el16.click();
        System.out.println("Upload button Click");

        //Document Type
        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/t1");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el18.click();
        System.out.println("Document Type");

        //Upload button Click
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el19.click();
        System.out.println("Upload button Click");

        //Upload Photo
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/browse");
        el20.click();
        MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[1]");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject");
        el23.click();
        System.out.println("Upload Photo");

        //Upload button Click
        MobileElement el24 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/submit");
        el24.click();
        System.out.println("Upload button Click");
        Thread.sleep(5000);

        // Back to Dashboard
        MobileElement el25 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/homelay");
        el25.click();
        System.out.println("Back to Dashboard");
        Thread.sleep(3000);
            }
}

package com.PageObject.Payment;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;


/**
 * @author Subhradip Sinha
 * Date: 06/10/2019
 */
public class SidePanel_Payment extends DriverManagerfile {
    @Test
    public void Hit_Side_Panel_Payment()throws Exception {
        Thread.sleep(2000);

        //Side_Panel click
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/menu");
        el1.click();
        System.out.println("Side_Panel click");
        Thread.sleep(2000);

        // Scroll Down
        MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Logout\"));");

       //Payment Tab Click
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[12]");
        el2.click();
        System.out.println("Payment Tab Click");
            }
    @Test
    public void Birth_Certificate_Tab_Click() throws InterruptedException {
        //Birth_Certificate_Tab
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/blays");
        el3.click();
        System.out.println("Birth_Certificate_Tab");
        Thread.sleep(2000);

        //Back Birth_Certificate_Tab
        MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el5.click();
        System.out.println("Back Birth_Certificate_Tab");

    }
    @Test
    public void Death_Certificate_Tab_Click() throws InterruptedException {
        //Death_Certificate_Tab
        MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/deathlays");
        el6.click();
        System.out.println("Death_Certificate_Tab");
        Thread.sleep(2000);

        //Back_Death_Certificate_Tab
        MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el8.click();
        System.out.println("Back_Death_Certificate_Tab");
    }
    @Test
    public void Trade_Licence_Tab_Click() throws InterruptedException {
        //Trade_Licence_Tab
        MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/tlays");
        el9.click();
        System.out.println("Trade_Licence_Tab");
        Thread.sleep(2000);


        //Back_Trade_Licence_Tab
        MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el11.click();
        System.out.println("Back_Trade_Licence_Tab");

    }
    @Test
    public void Property_Tax_Tab_Click() throws InterruptedException {
        //Property_Tax_Tab
        MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/pt");
        el12.click();
        System.out.println("Property_Tax_Tab");
        Thread.sleep(2000);


        //Back_Property_Tax_Tab
        MobileElement el13 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el13.click();
        System.out.println("Back_Property_Tax_Tab");
    }
    @Test
    public void Building_Plan_Tab_Click() throws InterruptedException {

        //Building_Plan_Tab
        MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bplan");
        el14.click();
        System.out.println("Building_Plan_Tab");
        Thread.sleep(2000);


        //Back_Building_Plan_Tab
        MobileElement el16 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el16.click();
        System.out.println("Back_Building_Plan_Tab");
    }
    @Test
    public void Building_Completion_Certificate_Tab_Click() throws InterruptedException {

        //Building_Completion_Certificate_Tab
        MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bcc");
        el17.click();
        System.out.println("Building_Completion_Certificate_Tab");
        Thread.sleep(2000);


        //Back_Building_Completion_Certificate_Tab
        MobileElement el19 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el19.click();
        System.out.println("Back_Building_Completion_Certificate_Tab");
        // Scroll Down
        MobileElement elementscrol= (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");


    }

    @Test
    public void Hording_and_Advertisement_Tab_Click() throws InterruptedException {
        //Hording_and_Advertisement_Tab
        MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/haa");
        el20.click();
        System.out.println("Hording_and_Advertisement_Tab");
        Thread.sleep(2000);

        //Back_Hording_and_Advertisement_Tab
        MobileElement el22 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el22.click();
        System.out.println("Back_Hording_and_Advertisement_Tab");
    }
    @Test
    public void Complaint_Management_Tab_Click() throws InterruptedException {
        //Complaint_Management_Tab
        MobileElement el23 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/cm");
        el23.click();
        System.out.println("Complaint_Management_Tab");
        Thread.sleep(2000);


        //Back_Complaint_Management_Tab
        MobileElement el25 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el25.click();
        System.out.println("Back_Complaint_Management_Tab");
    }

    @Test
    public void Mutation_Certificate_Tab_Click() throws InterruptedException {
        //Mutation_Certificate_Tab
        MobileElement el26 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/mc");
        el26.click();
        System.out.println("Mutation_Certificate_Tab");
        Thread.sleep(2000);


        //Back_Mutation_Certificate_Tab
        MobileElement el28 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el28.click();
        System.out.println("Back_Mutation_Certificate_Tab");
    }
    @Test
    public void Water_Supply_Tab_Click() throws InterruptedException {
        //Water_Supply_Tab
        MobileElement el29 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/water");
        el29.click();
        System.out.println("Water_Supply_Tab");
        Thread.sleep(2000);


        //Back_Water_Supply_Tab
        MobileElement el31 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el31.click();
        System.out.println("Back_Water_Supply_Tab");

    }

    }

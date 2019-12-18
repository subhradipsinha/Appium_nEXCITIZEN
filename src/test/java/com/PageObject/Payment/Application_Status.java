package com.PageObject.Payment;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


/**
 * @author Subhradip Sinha
 * Date: 05/10/2019
 */

public class Application_Status extends DriverManagerfile {
    @Test
    public void Application_status_hit() throws InterruptedException {
        //Application_status_hit
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bannerlay");
        el1.click();

        MobileElement dashboard =(MobileElement)driver.findElementsById("com.nex.nexcitizen:id/relayoutimage");
        boolean isDisplayed = dashboard.isDisplayed();
        if(isDisplayed) {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(isDisplayed, "Successfully login");
        }else {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(isDisplayed,"Un-successful");
        }
        System.out.println("Application_status_hit");
    }
    @Test
        public void Birth_Certificate_Tab_Click () throws InterruptedException {
        //Birth_Certificate_Tab
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/blays");
        if(el3.isDisplayed()) {
            el3.click();
            System.out.println("Birth_Certificate_Tab");
        }
        else {
            System.out.println("Birth_Certificate_Tab not Hit");
        }
        try {
            MobileElement dashboard = (MobileElement) driver.findElementsById("com.nex.nexcitizen:id/relayoutimage");
            Assert.assertTrue(dashboard.isDisplayed());
        } catch (Exception e ){

            Assert.assertEquals("Birth_Certificate_Tab","Birth_Certificate_Tab not Hit","Exact Error:............");
            System.out.println(" Element exception: "+e);
        }




            // View Documents
            MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
           if(el4.isDisplayed()) {
               el4.click();
               System.out.println("View Documents");
           }
           else {
               System.out.println("View Documents button not working");
               SoftAssert softAssert = new SoftAssert();
               String accual = "View Documents";
               String expect = "View Documents button not working";
               softAssert.assertEquals(accual,expect,"Not Working Reassion :............");
               softAssert.assertAll();
           }

            // Upload pic show
            MobileElement pic = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
           if(pic.isDisplayed()){
            pic.click();
            System.out.println("Upload pic show");}else {
               System.out.println("Upload pic not show");
           }
            Thread.sleep(2000);

            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();

            //Back Birth_Certificate_Tab
            MobileElement el5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el5.click();
            System.out.println("Back Birth_Certificate_Tab");

        }
        @Test
        public void Death_Certificate_Tab_Click () throws InterruptedException {
            //Death_Certificate_Tab
            MobileElement el6 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/deathlays");
            if(el6.isDisplayed()){
            el6.click();
            System.out.println("Death_Certificate_Tab");}
            else {System.out.println("Death_Certificate_Tab not Hit");}
            Thread.sleep(2000);

            // View Documents
            MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
           if(el7.isDisplayed()){ el7.click();
            System.out.println("View Documents");}else {System.out.println("View Documents Button not working");}

            // Upload pic show
            MobileElement pic1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
           if (pic1.isDisplayed()){
            pic1.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);}
           else {
               System.out.println("Upload pic not show");
           }
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();

            //Back_Death_Certificate_Tab
            MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            if(el8.isDisplayed()){
            el8.click();
            System.out.println("Back_Death_Certificate_Tab");}
            else {System.out.println("Back_Death_Certificate_Tab not hit");}
        }
        @Test
        public void Trade_Licence_Tab_Click () throws InterruptedException {
            //Trade_Licence_Tab
            MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/tlays");
            if(el9.isDisplayed()){
            el9.click();
            System.out.println("Trade_Licence_Tab");
            Thread.sleep(2000);}
            else {System.out.println("Trade_Licence_Tab not hit");}

            // View Documents
            MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
           if(el10.isDisplayed()){
            el10.click();
            System.out.println("View Documents");}
           else {System.out.println("View Documents not show");}

            // Upload pic show
            MobileElement pic2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
           if(pic2.isDisplayed()){
            pic2.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);}else {System.out.println("Upload pic not show");}
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();



            //Back_Trade_Licence_Tab
            MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            if(el11.isDisplayed()){
            el11.click();
            System.out.println("Back_Trade_Licence_Tab");}else {System.out.println("Back_Trade_Licence_Tab not click");}

        }
        @Test
        public void Property_Tax_Tab_Click () throws InterruptedException {
            //Property_Tax_Tab
            MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/pt");
            if(el12.isDisplayed()){
            el12.click();
            System.out.println("Property_Tax_Tab");
            Thread.sleep(2000);}else {System.out.println("Property_Tax_Tab not click");}

            // View Documents
            MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            if(el13.isDisplayed()){
            el13.click();
            System.out.println("View Documents");}else {System.out.println("View Documents not show");}

            // Upload pic show
            MobileElement pic3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            if (pic3.isDisplayed()){
            pic3.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);}else {System.out.println("Upload pic not show");}
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Property_Tax_Tab
            MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            if(el14.isDisplayed()){
            el14.click();
            System.out.println("Back_Property_Tax_Tab");}else {System.out.println("Back_Property_Tax_Tab not click");}
        }
        @Test
        public void Building_Plan_Tab_Click () throws InterruptedException {

            //Building_Plan_Tab
            MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bplan");
            if(el15.isDisplayed()){
            el15.click();
            System.out.println("Building_Plan_Tab");
            Thread.sleep(2000);}else {System.out.println("Building_Plan_Tab not click");}

            // View Documents
            MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            if(el16.isDisplayed()){
            el16.click();
            System.out.println("View Documents");}else {System.out.println("View Documents not show");}

            // Upload pic show
            MobileElement pic4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            if(pic4.isDisplayed()){
            pic4.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);}else {System.out.println("Upload pic not show");}
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Building_Plan_Tab
            MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            if (el17.isDisplayed()){
            el17.click();
            System.out.println("Back_Building_Plan_Tab");}else {System.out.println("Back_Building_Plan_Tab not click");}
        }
        @Test
        public void Building_Completion_Certificate_Tab_Click () throws InterruptedException {

            //Building_Completion_Certificate_Tab
            MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bcc");
            if (el18.isDisplayed()){
            el18.click();
            System.out.println("Building_Completion_Certificate_Tab");
            Thread.sleep(2000);}else {System.out.println("Building_Completion_Certificate_Tab not click");}

            // View Documents
            MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            if(el19.isDisplayed()){
            el19.click();
            System.out.println("View Documents");}else {System.out.println("View Documents not show");}

            // Upload pic show
            MobileElement pic5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            if(pic5.isDisplayed()){
            pic5.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);}else {System.out.println("Upload pic not show");}
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Building_Completion_Certificate_Tab
            MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            if(el20.isDisplayed()){
            el20.click();
            System.out.println("Back_Building_Completion_Certificate_Tab");}else {System.out.println("Back_Building_Completion_Certificate_Tab not click");}
            // Scroll Down
            MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");


        }

        @Test
        public void Hording_and_Advertisement_Tab_Click () throws InterruptedException {
            //Hording_and_Advertisement_Tab
            MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/haa");
            el21.click();
            MobileElement dashboard =(MobileElement)driver.findElementsById("com.nex.nexcitizen:id/list");

            if(dashboard.isDisplayed()){
                SoftAssert softAssert = new SoftAssert();
                String accual = "Hording_and_Advertisement_Tab Click";
                String expect ="Hording_and_Advertisement_Tab not_Click";
                softAssert.assertEquals(accual,expect,"Exact Error: ..........");
                softAssert.assertAll(); }else {
                SoftAssert softAssert = new SoftAssert();
                String accual = "Hording_and_Advertisement_Tab not Click";
                String expect ="Hording_and_Advertisement_Tab_Click";
                softAssert.assertEquals(accual,expect,"Exact Error: ..........");
                softAssert.assertAll();
            }




            // View Documents
            MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            if(el22.isDisplayed()){
            el22.click();
            System.out.println("View Documents");}else {System.out.println("View Documents not show");}

            // Upload pic show
            MobileElement pic5= (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            if (pic5.isDisplayed()){
            pic5.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);}else {System.out.println("Upload pic not show");}
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();

            //Back_Hording_and_Advertisement_Tab
            MobileElement el23= (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            if (el23.isDisplayed()){
            el22.click();
            System.out.println("Back_Hording_and_Advertisement_Tab");}else {System.out.println("Back_Hording_and_Advertisement_Tab not Hit");}
        }
        @Test
        public void Complaint_Management_Tab_Click () throws InterruptedException {
            //Complaint_Management_Tab
            MobileElement el24 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/cm");
            if (el24.isDisplayed()){
            el24.click();
            System.out.println("Complaint_Management_Tab");
            Thread.sleep(2000);}else { System.out.println("Complaint_Management_Tab not Hit");}

            // View Documents
            MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
           if (el25.isDisplayed()){
            el25.click();
            System.out.println("View Documents");}else {System.out.println("View Documents not show");}

            // Upload pic show
            MobileElement pic5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
           if (pic5.isDisplayed()){
            pic5.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);}else {System.out.println("Upload pic not show");}
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Complaint_Management_Tab
            MobileElement el26 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            if (el26.isDisplayed()){
            el26.click();
            System.out.println("Back_Complaint_Management_Tab");}else {System.out.println("Back_Complaint_Management_Tab not Hit");}
        }

        @Test
        public void Mutation_Certificate_Tab_Click () throws InterruptedException {
            //Mutation_Certificate_Tab
            MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/mc");
            if (el27.isDisplayed()){
            el27.click();
            System.out.println("Mutation_Certificate_Tab");
            Thread.sleep(2000);}else {System.out.println("Mutation_Certificate_Tab not Hit");}

            // View Documents
            MobileElement el28 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            if (el28.isDisplayed()){
            el28.click();
            System.out.println("View Documents");}else {System.out.println("View Documents not show");}

            // Upload pic show
            MobileElement pic6= (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            if(pic6.isDisplayed()){
            pic6.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);}else {System.out.println("Upload pic not show");}
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Mutation_Certificate_Tab
            MobileElement el29 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            if (el29.isDisplayed()) {
            el29.click();
            System.out.println("Back_Mutation_Certificate_Tab");}else {System.out.println("Back_Mutation_Certificate_Tab not hit");}
        }
        @Test
        public void Water_Supply_Tab_Click () throws InterruptedException {
            //Water_Supply_Tab
            MobileElement el30 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/water");
            if (el30.isDisplayed()){
            el30.click();
            System.out.println("Water_Supply_Tab");
            Thread.sleep(2000);}else {System.out.println("Water_Supply_Tab not Hit");}

            // View Documents
            MobileElement el31 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            if (el31.isDisplayed()){
            el31.click();
            System.out.println("View Documents");}else {System.out.println("View Documents not hit");}

            // Upload pic show
            MobileElement pic7= (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            if (pic7.isDisplayed()){
            pic7.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);}else {System.out.println("Upload pic not show");}
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();

            //Back_Water_Supply_Tab
            MobileElement el32 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            if (el32.isDisplayed()){
            el31.click();
            System.out.println("Back_Water_Supply_Tab");}else {System.out.println("Back_Water_Supply_Tab not hit");}

        }

    }

package com.PageObject.Payment;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;


/**
 * @author Subhradip Sinha
 * Date: 05/10/2019
 */

@Test
public class Application_Status extends DriverManagerfile {
    @Test
    public void Application_status_hit() throws InterruptedException {
        //Application_status_hit
        MobileElement el1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bannerlay");
        el1.click();
        System.out.println("Application_status_hit");
        Thread.sleep(2000);
    }
    @Test
        public void Birth_Certificate_Tab_Click () throws InterruptedException {
        //Birth_Certificate_Tab
        MobileElement el3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/blays");
            el3.click();
            System.out.println("Birth_Certificate_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el4.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic.click();
            System.out.println("Upload pic show");
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
            el6.click();
            System.out.println("Death_Certificate_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el7.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic1 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic1.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();

            //Back_Death_Certificate_Tab
            MobileElement el8 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el8.click();
            System.out.println("Back_Death_Certificate_Tab");
        }
        @Test
        public void Trade_Licence_Tab_Click () throws InterruptedException {
            //Trade_Licence_Tab
            MobileElement el9 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/tlays");
            el9.click();
            System.out.println("Trade_Licence_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el10.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic2.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();



            //Back_Trade_Licence_Tab
            MobileElement el11 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el11.click();
            System.out.println("Back_Trade_Licence_Tab");

        }
        @Test
        public void Property_Tax_Tab_Click () throws InterruptedException {
            //Property_Tax_Tab
            MobileElement el12 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/pt");
            el12.click();
            System.out.println("Property_Tax_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el13.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic3 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic3.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Property_Tax_Tab
            MobileElement el14 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el14.click();
            System.out.println("Back_Property_Tax_Tab");
        }
        @Test
        public void Building_Plan_Tab_Click () throws InterruptedException {

            //Building_Plan_Tab
            MobileElement el15 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bplan");
            el15.click();
            System.out.println("Building_Plan_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el16.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic4 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic4.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Building_Plan_Tab
            MobileElement el17 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el17.click();
            System.out.println("Back_Building_Plan_Tab");
        }
        @Test
        public void Building_Completion_Certificate_Tab_Click () throws InterruptedException {

            //Building_Completion_Certificate_Tab
            MobileElement el18 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/bcc");
            el18.click();
            System.out.println("Building_Completion_Certificate_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el19.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic5.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Building_Completion_Certificate_Tab
            MobileElement el20 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el20.click();
            System.out.println("Back_Building_Completion_Certificate_Tab");
            // Scroll Down
            MobileElement elementscrol = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains(\"Water Supply\"));");


        }

        @Test
        public void Hording_and_Advertisement_Tab_Click () throws InterruptedException {
            //Hording_and_Advertisement_Tab
            MobileElement el21 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/haa");
            el21.click();
            System.out.println("Hording_and_Advertisement_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el22.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic5= (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic5.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();

            //Back_Hording_and_Advertisement_Tab
            MobileElement el23= (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el22.click();
            System.out.println("Back_Hording_and_Advertisement_Tab");
        }
        @Test
        public void Complaint_Management_Tab_Click () throws InterruptedException {
            //Complaint_Management_Tab
            MobileElement el24 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/cm");
            el24.click();
            System.out.println("Complaint_Management_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el25.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic5 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic5.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Complaint_Management_Tab
            MobileElement el26 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el26.click();
            System.out.println("Back_Complaint_Management_Tab");
        }

        @Test
        public void Mutation_Certificate_Tab_Click () throws InterruptedException {
            //Mutation_Certificate_Tab
            MobileElement el27 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/mc");
            el27.click();
            System.out.println("Mutation_Certificate_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el28 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el28.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic6= (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic6.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();


            //Back_Mutation_Certificate_Tab
            MobileElement el29 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el29.click();
            System.out.println("Back_Mutation_Certificate_Tab");
        }
        @Test
        public void Water_Supply_Tab_Click () throws InterruptedException {
            //Water_Supply_Tab
            MobileElement el30 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/water");
            el30.click();
            System.out.println("Water_Supply_Tab");
            Thread.sleep(2000);

            // View Documents
            MobileElement el31 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button");
            el31.click();
            System.out.println("View Documents");

            // Upload pic show
            MobileElement pic7= (MobileElement) driver.findElementById("com.nex.nexcitizen:id/view");
            pic7.click();
            System.out.println("Upload pic show");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();

            //Back_Water_Supply_Tab
            MobileElement el32 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
            el31.click();
            System.out.println("Back_Water_Supply_Tab");

        }

    }

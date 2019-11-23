package com.PageObject.Payment;

import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;


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
        System.out.println("Application_status_hit");
        Thread.sleep(2000);

        //Back to the Dashboard
        MobileElement el2 = (MobileElement) driver.findElementById("com.nex.nexcitizen:id/back");
        el2.click();
        Thread.sleep(5000);
    }
}

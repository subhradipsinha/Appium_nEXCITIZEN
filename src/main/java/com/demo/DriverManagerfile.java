package com.demo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManagerfile {
    public static AndroidDriver driver = null;

    public static void setup() throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("no", true);
        //desiredCapabilities.setCapability("newCommandTimeout", 100000);
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "E:\\Appium_project\\com_nEXCITIZEN_demo\\Driver\\nexcitizen.apk");
        System.out.println("Url hit");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        //caps.setCapability("platformName","ANDROID");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        //desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_PACKAGE, "com.nex.nexcitizen");
        System.out.println("Package hit");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.nex.nexcitizen.Login");
        System.out.println("App hit");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-G531F");
        desiredCapabilities.setCapability("noReset", true);

        //Instantiate Appium Driver
        URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        System.out.println("Url hit test");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        // caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
    }

}


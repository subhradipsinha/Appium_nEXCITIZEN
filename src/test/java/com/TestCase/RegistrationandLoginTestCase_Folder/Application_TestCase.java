package com.TestCase.RegistrationandLoginTestCase_Folder;

import com.PageObject.New_Registration.Login_Page;
import com.PageObject.Payment.Application_Status;

import org.testng.annotations.Test;

public class Application_TestCase {
    Application_Status application_status = new Application_Status();
    @Test(priority = 4)
    public void Hit_Application()throws Exception{
        Thread.sleep(2000);
        application_status.Application_status_hit();
        Thread.sleep(2000);
        application_status.Hording_and_Advertisement_Tab_Click();
        Thread.sleep(2000);
        application_status.Birth_Certificate_Tab_Click();
        Thread.sleep(2000);
        application_status.Death_Certificate_Tab_Click();
        Thread.sleep(2000);
        application_status.Trade_Licence_Tab_Click();
        Thread.sleep(2000);
        application_status.Property_Tax_Tab_Click();
        Thread.sleep(2000);
        application_status.Building_Plan_Tab_Click();
        Thread.sleep(2000);
        application_status.Building_Completion_Certificate_Tab_Click();
        Thread.sleep(2000);
       application_status.Hording_and_Advertisement_Tab_Click();
       Thread.sleep(2000);}
       @Test(priority = 5)
       public void Application_Details()throws Exception{
       application_status.Complaint_Management_Tab_Click();
       Thread.sleep(2000);
       application_status.Mutation_Certificate_Tab_Click();
       Thread.sleep(2000);
       application_status.Water_Supply_Tab_Click();
       Thread.sleep(3000);
    }
}

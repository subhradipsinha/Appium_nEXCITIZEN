package com.TestCase.Payment_Test_Case_Folder;

import com.PageObject.Payment.Application_Status;
import org.testng.annotations.Test;

public class Application_Test_Case {
    Application_Status application_status = new Application_Status();
    @Test(priority = 4)
    public void Application_TabHit() throws InterruptedException {
        application_status.Application_status_hit();
        application_status.Birth_Certificate_Tab_Click();
        application_status.Death_Certificate_Tab_Click();
        application_status.Trade_Licence_Tab_Click();
        application_status.Property_Tax_Tab_Click();
        application_status.Building_Plan_Tab_Click();
        application_status.Building_Completion_Certificate_Tab_Click();
        application_status.Complaint_Management_Tab_Click();
        application_status.Mutation_Certificate_Tab_Click();
        application_status.Water_Supply_Tab_Click();
    }
}

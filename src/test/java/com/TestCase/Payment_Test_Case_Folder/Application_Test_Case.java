package com.TestCase.Payment_Test_Case_Folder;

import com.PageObject.Payment.Application_Status;
import org.testng.annotations.Test;

public class Application_Test_Case {
    Application_Status application_status = new Application_Status();
    @Test(priority = 4)
    public void Application_TabHit() throws InterruptedException {
        application_status.Application_status_hit();
    }
}

package com.TestCase.HordingTestCase_Folder;

import com.PageObject.Hording_and_Advertisment.Hording_and_Advertisment;
import org.testng.annotations.Test;

public class Hording_Test_Case {
    Hording_and_Advertisment hording_and_advertisment = new Hording_and_Advertisment();
    @Test(priority = 32)
    public void Hit_Hording_and_Advertisment_Tab() throws InterruptedException {
        hording_and_advertisment.Hording_and_Advertisment_Tab();
        hording_and_advertisment.Applicant_Details_Link();
    }

}

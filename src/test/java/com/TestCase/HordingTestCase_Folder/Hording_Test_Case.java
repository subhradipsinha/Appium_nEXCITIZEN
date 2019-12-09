package com.TestCase.HordingTestCase_Folder;

import com.PageObject.Hording_and_Advertisment.Hording_and_Advertisment;
import org.testng.annotations.Test;

public class Hording_Test_Case {
    Hording_and_Advertisment hording_and_advertisment = new Hording_and_Advertisment();
    @Test(priority = 15)
    public void Hit_Hording_and_Advertisment_Tab() throws InterruptedException {
        hording_and_advertisment.Hording_and_Advertisment_Tab();
    }
    @Test(priority = 16)
    public void Hit_Applicant_Details_Link(){
        hording_and_advertisment.Applicant_Details_Link();
    }
    @Test(priority = 17)
    public void Hit_Hording_Details(){
        hording_and_advertisment.Hit_Hording_Details_Link();
    }
}

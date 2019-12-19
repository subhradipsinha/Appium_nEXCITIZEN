package com.TestCase.HordingTestCase_Folder;

import com.PageObject.Hording_and_Advertisment.Side_Panel_Hording_and_Advertisment;
import org.testng.annotations.Test;

public class SidePanel_Hording_Test_Case {
    Side_Panel_Hording_and_Advertisment side_panel_hording_and_advertisment = new Side_Panel_Hording_and_Advertisment();
    @Test(priority = 33)
    public void Hit_Side_Panel()throws Exception{
        side_panel_hording_and_advertisment.Hit_Side_Panel_Hording_and_Advertisment();


    }
}

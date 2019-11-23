package com.TestCase.Building_Complain_Test_Case_Folder;

import com.PageObject.Building_Completion_Certificate_Folder.Side_Panel_Building_Completion_Certificate;
import org.testng.annotations.Test;

public class SidePanel_Building_Complain_Test_Case {
    Side_Panel_Building_Completion_Certificate side_panel_building_completion_certificate = new Side_Panel_Building_Completion_Certificate();
    @Test(priority = 24)
    public void Hit_Side_Panel_Building_Completion()throws Exception{
        side_panel_building_completion_certificate.Hit_Side_Panel_Building_Completion_Certificate();
        side_panel_building_completion_certificate.Edit_Update();
    }
}

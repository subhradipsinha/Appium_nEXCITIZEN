package com.TestCase.Death_Test_Case_Folder;

import com.PageObject.Death_Certificate_Folder.Side_Panel_Death_Certificate;
import org.testng.annotations.Test;

public class SidePanel_Death_Cirtificate_TestCase {

    Side_Panel_Death_Certificate side_panel_death_certificate = new Side_Panel_Death_Certificate();
    @Test(priority = 9)
    public void Hit_Side_Panel()throws Exception{
       side_panel_death_certificate.Side_panel_click();
    }
    @Test(priority = 10)
    public void Hit_Edit_Button()throws Exception{
        side_panel_death_certificate.Edit_Update();
    }
}

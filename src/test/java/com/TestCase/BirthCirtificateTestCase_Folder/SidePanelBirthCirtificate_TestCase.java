package com.TestCase.BirthCirtificateTestCase_Folder;

import com.PageObject.Birth_Cirtificate_Folder.Side_Panel_Birth_Cirtificate;
import org.testng.annotations.Test;

public class SidePanelBirthCirtificate_TestCase {
    Side_Panel_Birth_Cirtificate side_panel_birth_cirtificate = new Side_Panel_Birth_Cirtificate();

    @Test (priority = 16)
        public void Hit_Side_Panel()throws Exception{
            side_panel_birth_cirtificate.Side_panel_click();
    }
    @Test(priority = 17)
    public void Edit()throws Exception{
        side_panel_birth_cirtificate.Edit_Update();
    }
    }


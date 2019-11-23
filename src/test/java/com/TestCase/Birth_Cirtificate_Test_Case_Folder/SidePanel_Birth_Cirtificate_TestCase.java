package com.TestCase.Birth_Cirtificate_Test_Case_Folder;

import com.PageObject.Birth_Cirtificate_Folder.Side_Panel_Birth_Cirtificate;
import org.testng.annotations.Test;

public class SidePanel_Birth_Cirtificate_TestCase {
    Side_Panel_Birth_Cirtificate side_panel_birth_cirtificate = new Side_Panel_Birth_Cirtificate();

    @Test (priority = 6)
        public void Hit_Side_Panel()throws Exception{
            side_panel_birth_cirtificate.Side_panel_click();
    }
    @Test(priority = 7)
    public void Edit()throws Exception{
        side_panel_birth_cirtificate.Edit_Update();
    }
    }


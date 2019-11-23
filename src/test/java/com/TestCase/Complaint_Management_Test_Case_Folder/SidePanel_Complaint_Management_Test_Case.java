package com.TestCase.Complaint_Management_Test_Case_Folder;

import com.PageObject.Complaint_Management_Folder.Side_Panel_Complain_Management;
import org.testng.annotations.Test;

public class SidePanel_Complaint_Management_Test_Case {

    Side_Panel_Complain_Management side_panel_complain_management = new Side_Panel_Complain_Management();

    @Test(priority = 25)
    public void Hit_SidePanel_Complaint_Management()throws Exception{
        side_panel_complain_management.Hit_Side_Panel();
        side_panel_complain_management.Edit_Button();
    }

}

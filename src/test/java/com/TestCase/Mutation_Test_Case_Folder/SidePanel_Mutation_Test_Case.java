package com.TestCase.Mutation_Test_Case_Folder;

import com.PageObject.Mutation_Certificate_Folder.Side_Panel_Mutation_Certificate;
import org.testng.annotations.Test;

public class SidePanel_Mutation_Test_Case {

    Side_Panel_Mutation_Certificate side_panel_mutation_certificate = new Side_Panel_Mutation_Certificate();

    @Test(priority = 32)
    public void Hit_SidePanel_Mutation()throws Exception{
        side_panel_mutation_certificate.Hit_Side_Panel();
        side_panel_mutation_certificate.Edit_Button();
    }
}

package com.TestCase.MutationTestCase_Folder;

import com.PageObject.Mutation_Certificate_Folder.Side_Panel_Mutation_Certificate;
import org.testng.annotations.Test;

public class SidePanelMutation_TestCase {

    Side_Panel_Mutation_Certificate side_panel_mutation_certificate = new Side_Panel_Mutation_Certificate();

    @Test(priority = 32)
    public void Hit_SidePanel_Mutation()throws Exception{
        side_panel_mutation_certificate.Hit_Side_Panel();
        side_panel_mutation_certificate.Edit_Button();
    }
}

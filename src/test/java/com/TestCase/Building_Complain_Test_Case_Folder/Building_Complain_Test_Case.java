package com.TestCase.Building_Complain_Test_Case_Folder;

import com.PageObject.Building_Completion_Certificate_Folder.Building_Completion_Certificate;
import org.testng.annotations.Test;

public class Building_Complain_Test_Case {
    Building_Completion_Certificate building_completion_Certificate = new Building_Completion_Certificate();
    @Test(priority = 21)
    public void Building_Complain_URL_HIT_Test() throws Exception {
        building_completion_Certificate.Hit_Building_Commpletion_Tab();
    }
    @Test(priority = 22)
    public void address_details_link() throws Exception {
        building_completion_Certificate.Hit_Address_Details_Droupdown();
    }
    @Test(priority = 23)
    public void building_Details() throws Exception {
        building_completion_Certificate.Hit_Building_Details_Droupdown();
    }
}

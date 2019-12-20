package com.TestCase.BuildingTestCase_Folder;

import com.PageObject.Building_Plan_Folder.Building_Plan;
import com.PageObject.Building_Plan_Folder.Side_Panel_Building_Plan;
import com.demo.DriverManagerfile;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class SidePanelBuildingplan_TestCase {
    Side_Panel_Building_Plan side_panel_building_plan = new Side_Panel_Building_Plan();

    @Test(priority = 32)
    public void Hit_SidePanel_Building_plan() throws Exception {
        side_panel_building_plan.Hit_Side_Panel_Building_Plan();
        side_panel_building_plan.Hit_Edit_Button();
    }
}
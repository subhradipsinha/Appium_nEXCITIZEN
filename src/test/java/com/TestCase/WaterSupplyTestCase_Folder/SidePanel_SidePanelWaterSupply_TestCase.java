package com.TestCase.WaterSupplyTestCase_Folder;

import com.PageObject.Water_Supply_Folder.Side_Panel_Water_Supply;
import org.testng.annotations.Test;

public class SidePanel_SidePanelWaterSupply_TestCase {

    Side_Panel_Water_Supply side_panel_water_supply = new Side_Panel_Water_Supply();

    @Test(priority = 47)
    public void Hit_Side_Panel_Water_Supply()throws Exception
    {
        side_panel_water_supply.Hit_Side_Panel_Water_Supply();
        side_panel_water_supply.Edit_Button();
    }
}

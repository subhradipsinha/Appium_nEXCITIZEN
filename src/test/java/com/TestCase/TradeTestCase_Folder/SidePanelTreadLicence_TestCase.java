package com.TestCase.TradeTestCase_Folder;

import com.PageObject.Trade_Licence_Folder.Side_Panel_Trade_Licence;
import org.testng.annotations.Test;

public class SidePanelTreadLicence_TestCase {
    Side_Panel_Trade_Licence side_panel_trade_licence = new Side_Panel_Trade_Licence();
    @Test(priority = 22)
    public void Hit_Side_Panel()throws Exception{
        side_panel_trade_licence.Sidepanel_Click();
    }
    @Test(priority = 23)
    public void Hit_Edit_Button()throws Exception{
        side_panel_trade_licence.Edit_Update();
    }
    @Test(priority = 24)
    public void Hit_Property()throws Exception{
        side_panel_trade_licence.Hit_Trade_Details();
    }
    @Test(priority = 25)
    public void Hit_Owner_Details()throws Exception{
        side_panel_trade_licence.Licence_Owner_Details();
    }
}

package com.TestCase.PropertyTestCase_Folder;

import com.PageObject.Property_Tax_Folder.Side_Panel_Property_Tax;
import org.testng.annotations.Test;

public class SidePanelPropertyTax_TestCase {
    Side_Panel_Property_Tax side_panel_property_tax = new Side_Panel_Property_Tax();
    @Test(priority = 22)
    public void Hit_Property_Tax()throws Exception{
        side_panel_property_tax.Hit_Side_Panel();
    }
    @Test(priority = 23)
    public void Edit_Button()throws Exception{
        side_panel_property_tax.Edit_Update();
    }
}

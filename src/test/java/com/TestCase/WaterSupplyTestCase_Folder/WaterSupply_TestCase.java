package com.TestCase.WaterSupplyTestCase_Folder;

import com.PageObject.Water_Supply_Folder.Water_Supply;
import org.testng.annotations.Test;

public class WaterSupply_TestCase {
    Water_Supply water_supply = new Water_Supply();

    @Test(priority = 33)
    public void Hit_Water_Supply() throws Exception {
        water_supply.Hit_Water_Supply_Tab();
    }
    @Test(priority = 34)
    public void Application_link(){
        water_supply.Application_Details_Link();
    }
    @Test(priority = 35)
    public void Application_From() throws Exception {
        water_supply.Application_Details_From();
    }
}

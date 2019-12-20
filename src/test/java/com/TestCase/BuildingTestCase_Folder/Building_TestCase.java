package com.TestCase.BuildingTestCase_Folder;


import com.PageObject.Building_Plan_Folder.Building_Plan;
import org.testng.annotations.Test;

public class Building_TestCase {
    Building_Plan building_plan = new Building_Plan();

    @Test(priority = 29)
    public void Building_Tab() throws Exception {
        building_plan.Building_Tab();
    }

    @Test(priority = 30)
    public void Building_Droupdown(){
        building_plan.Building_Plan_Details();
    }
    @Test(priority = 31)
    public void Building_From() throws Exception {
        building_plan.building_From_Fill_up();
    }
}

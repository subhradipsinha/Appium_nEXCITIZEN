package com.TestCase.Payment_Test_Case_Folder;

import com.PageObject.Payment.Side_Panel_Payment;
import org.testng.annotations.Test;

public class SidePanel_Payment_Test_Case {
    Side_Panel_Payment side_panel_payment = new Side_Panel_Payment();

    @Test(priority = 37)
    public void Payment_History() throws Exception {
        side_panel_payment.Hit_Side_Panel_Payment();
        side_panel_payment.Birth_Certificate_Tab_Click();
        side_panel_payment.Death_Certificate_Tab_Click();
        side_panel_payment.Trade_Licence_Tab_Click();
        side_panel_payment.Property_Tax_Tab_Click();
        side_panel_payment.Building_Plan_Tab_Click();
        side_panel_payment.Building_Completion_Certificate_Tab_Click();
        side_panel_payment.Complaint_Management_Tab_Click();
        side_panel_payment.Mutation_Certificate_Tab_Click();
        side_panel_payment.Water_Supply_Tab_Click();
    }
}

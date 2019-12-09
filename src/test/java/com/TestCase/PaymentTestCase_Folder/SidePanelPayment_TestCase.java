package com.TestCase.PaymentTestCase_Folder;

import com.PageObject.Payment.SidePanel_Payment;
import org.testng.annotations.Test;

public class SidePanelPayment_TestCase {
    SidePanel_Payment side_panel_payment = new SidePanel_Payment();

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

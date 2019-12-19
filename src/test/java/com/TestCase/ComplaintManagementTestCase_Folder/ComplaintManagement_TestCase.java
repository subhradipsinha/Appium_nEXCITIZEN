package com.TestCase.ComplaintManagementTestCase_Folder;

import com.PageObject.Complaint_Management_Folder.Complaint_Management;
import org.testng.annotations.Test;

public class ComplaintManagement_TestCase {
    Complaint_Management complaint_management = new Complaint_Management();
    @Test(priority = 34)
    public void Hit_Complaint_Management_Tab_URl() throws InterruptedException {
        complaint_management.Hit_Complaint_Management_Tab();
    }
    @Test(priority = 35)
    public void Complain_Details_Link() throws InterruptedException {
        complaint_management.Complain_Details_Link();
    }
}

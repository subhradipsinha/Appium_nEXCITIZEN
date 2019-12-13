package com.TestCase.EmailTestCase_Folder;

import com.PageObject.EmailDemo.SendEmail;
import org.testng.annotations.Test;

public class SendEmail_TestCase {
    SendEmail sendEmail = new SendEmail();
    @Test(priority = 4)
    public void EmailSend_Message(){
        sendEmail.MailText();
    }
}

package com.TestCase.Registration_and_Login;

import com.PageObject.New_Registration.New_Registration;
import com.demo.DriverManagerfile;
import org.testng.annotations.Test;

public class New_Registration_Test_Case extends DriverManagerfile {

   New_Registration new_registration = new New_Registration();

   @Test(priority = 1)
    public void Call_App()throws Exception{
       new_registration.Login();
       new_registration.new_Registration_link_Click();
       new_registration.Registration_From();
    }
}

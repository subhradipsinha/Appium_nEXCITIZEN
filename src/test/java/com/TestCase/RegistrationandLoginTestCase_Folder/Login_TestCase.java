package com.TestCase.RegistrationandLoginTestCase_Folder;

import com.PageObject.New_Registration.Login_Page;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_TestCase {
    Login_Page login_page = new Login_Page();
@BeforeTest
public void Url_login() throws Exception {
    login_page.Login();
    System.out.println("login");
    Thread.sleep(5000);
}
@Test(enabled = false)
public void Without_Username() throws Exception {
    login_page.OnlyPassWordtest();
}
@Test(enabled = false)
public void Without_Password() throws Exception {
    login_page.OnlyUserNametest();
}
@Test(priority = 3)
public void Orginal_user_pass() throws Exception {
    login_page.UserTest();
}
}
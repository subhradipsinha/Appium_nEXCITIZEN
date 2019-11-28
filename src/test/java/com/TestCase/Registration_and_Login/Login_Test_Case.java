package com.TestCase.Registration_and_Login;

import com.PageObject.New_Registration.Login_Page;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test_Case {
    Login_Page login_page = new Login_Page();
@BeforeTest
public void Url_login() throws Exception {
    login_page.Login();
    System.out.println("login");
    Thread.sleep(5000);
}
@Test(priority = 1)
public void Without_Username() throws Exception {
    login_page.OnlyPassWordtest();
}
@Test(priority = 2)
public void Without_Password() throws Exception {
    login_page.OnlyUserNametest();
}
@Test(priority = 3)
public void Orginal_user_pass() throws Exception {
    login_page.UserTest();
}
}
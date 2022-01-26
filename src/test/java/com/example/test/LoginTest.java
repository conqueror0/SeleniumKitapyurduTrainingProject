package com.example.test;

import com.example.driver.BaseTest;
import com.example.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest()
    {
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }

}

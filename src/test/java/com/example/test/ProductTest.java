package com.example.test;

import com.example.driver.BaseTest;
import com.example.page.HomePage;
import com.example.page.LoginPage;
import com.example.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
    }

    @Test
    public void getAttribute(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }

    @Test
    public void getTextTest(){
        HomePage homePage= new HomePage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        homePage.home();
        loginPage.login();
        productPage.textControl();
    }

    @Test
    public void valueTest(){
        ProductPage productPage= new ProductPage();

        productPage.valueControlTest();
    }
}

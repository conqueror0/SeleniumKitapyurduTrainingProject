package com.example.test;

import com.example.page.HomePage;
import com.example.driver.BaseTest;
import com.example.page.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {
    @Test
    public void homeTest(){
        HomePage homePage= new HomePage();

        homePage.home();
    }
}

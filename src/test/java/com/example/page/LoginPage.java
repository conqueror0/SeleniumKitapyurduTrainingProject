package com.example.page;

import com.example.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage() {
        methods = new Methods();
    }

    public void login()
    {
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"),"nese.aydin@testinium.com");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-password"),"1q2w3e4r5t");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(5);
    }

}

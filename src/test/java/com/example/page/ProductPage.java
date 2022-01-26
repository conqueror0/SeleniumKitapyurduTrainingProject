package com.example.page;

import com.example.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"edebiyat");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.click(By.cssSelector(".pr-img-link"));
        methods.scrollWithAction(By.cssSelector("#review-reply-button"));
        methods.waitBySeconds(3);

        methods.selectByText(By.cssSelector("select#review-sort-selection"),"Oylama (Düşük > Yüksek)");
    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text: "+ attribute);
        logger.info("Alınan text: " + attribute);
        methods.waitBySeconds(5);
    }

    public void textControl(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan Text: "+ text);
        logger.info("Alınan Text: "+ text);
        methods.waitBySeconds(3);
    }

    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: "+ value);
        logger.info("Alınan Text: "+ value);
        Assert.assertEquals("testinium", value);
        methods.waitBySeconds(5);
    }
}

package com.cydeo.testNG;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    WebDriver driver;
    @Test (dataProvider = "searchData")
    public void test1(String keyWord, String expectedTitle){
         driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyWord+ Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        driver.quit();

    }

    @DataProvider (name = "searchData")
    public  Object [][] testData() {
        return new Object[][]{
                {"selenium","selenium - Google'da Ara"},
                {"java","java - Google'da Ara"},
                {"job","job - Google'da Ara"},
                {"cydeo","cydeo - Google'da Ara"}
        };

    }


}

package com.cydeo.testNG;

import com.cydeo.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P03_TestNG_Selenium extends TestBase {

    @Test
    public  void   googleTitle(){
        driver.get("https://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Google title is not matching!!!");


    }



}

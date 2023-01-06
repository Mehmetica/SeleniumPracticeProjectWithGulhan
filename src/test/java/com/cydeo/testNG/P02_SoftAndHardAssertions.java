package com.cydeo.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P02_SoftAndHardAssertions {
    @Test
    public  void hardAssertions(){
        Assert.assertEquals("apple","app");
        System.out.println("After assertion fail");
        Assert.assertTrue("orange".equals("oranger"));
        System.out.println("After assertion fail");

    }

    @Test
    public  void softAssertions(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple","app");
        System.out.println("After assertion fail");
        softAssert.assertTrue("orange".equals("oranger"));
        System.out.println("After assertion fail");

        softAssert.assertAll("Test is over");




    }



}

package com.cydeo.testNG;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class P01_TestNG_Intro {

    @Test (priority = 2)
    public void testOnePlusFive(){
        System.out.println("1+5 is running");

        assertEquals(1+5,6);
    }

    @Test (priority = 1)
    public void testTenMinusFour(){
        System.out.println("10-4 is running");
        assertEquals(10-4,6);
    }

    @BeforeClass
    public void setUp(){
        System.out.println("-----> BeforeClass is running");
    }
    @AfterClass
    public  void afterClass(){
        System.out.println("-----> AfterClass is running");
    }

    @BeforeMethod
    public  void setUpMethod(){
        System.out.println("-----> BeforeMethod is running");

    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("-----> afterMethod is running");
    }
}

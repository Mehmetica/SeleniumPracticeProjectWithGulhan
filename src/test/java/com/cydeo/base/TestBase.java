package com.cydeo.base;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {//After creating this class, we don't have to write down these syntax everytime.
    // Just use inheritance and use it in every test. this class includes before and after method.

    public WebDriver driver ;

    @BeforeMethod
    public  void setUp(){
        driver = WebDriverFactory.getDriver("chrome");//this is the shortcut of setup.
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
    }

    @AfterMethod
    public  void tearDown(){

        driver.quit();
    }
}

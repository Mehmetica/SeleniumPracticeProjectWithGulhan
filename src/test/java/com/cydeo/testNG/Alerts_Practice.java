package com.cydeo.testNG;

import com.cydeo.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts_Practice extends TestBase {
    @Test
    public void alertTest(){
        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement jsAlert =driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed());
    }
}

package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_03_task_02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login1.nextbasecrm.com/");
        driver.manage().window().maximize();
//Verify “remember me” label text is as expected:
        String actualText = driver.findElement(By.cssSelector(".login-item-checkbox-label")).getText();
        String expectedText = "Remember me on this computer";
        if (actualText.equals(expectedText)) {
            System.out.println("Remember - PASS");
        } else System.out.println("Remember - FAIL");

//Verify “forgot password” link text is as expected:
        String actualForgotText = driver.findElement(By.cssSelector(".login-link-forgot-pass")).getText();
        String expectedForgotText = "Forgot your password?";
        if (actualForgotText.equals(expectedForgotText)) {
            System.out.println("Forgot - PASSED");
        } else System.out.println("Forgot - FAILED");

//Verify “forgot password” href attribute’s value contains expected:
        WebElement hrefAttribute = driver.findElement(By.cssSelector(".login-link-forgot-pass"));
        String actualAttribute = hrefAttribute.getAttribute("href");
        if (actualAttribute.contains("forgot_password=yes ")){
            System.out.println();
        }


        driver.quit();


    }
}

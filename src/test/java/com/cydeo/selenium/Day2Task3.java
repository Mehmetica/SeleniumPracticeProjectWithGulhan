package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement googleBox =driver.findElement(By.name("q"));
        googleBox.sendKeys("apple" + Keys.ENTER); // enter a basma

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification is PASSED");
        }else System.out.println("Title verification is FAILED");




    }
}

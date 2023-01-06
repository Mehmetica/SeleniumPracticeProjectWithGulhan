package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https:/practice.cydeo.com");
        driver.manage().window().maximize();
       // driver.findElement(By.linkText("A/B Testing")).click();
        WebElement linkTextAB = driver.findElement(By.linkText("A/B Testing"));
        linkTextAB.click();
        String title = driver.getTitle();
        if (title.equals("No A/B Test")){
            System.out.println("Title verification passed");
        }else System.out.println("Title verification is failed");

        driver.navigate().back();
        String currentTitle = driver.getTitle();
        String expectedTitle = "Practice";
        if (expectedTitle.equals(currentTitle)){
            System.out.println("Main title validation is passed");
        }else System.out.println("Main title validation is failed");




    }
}

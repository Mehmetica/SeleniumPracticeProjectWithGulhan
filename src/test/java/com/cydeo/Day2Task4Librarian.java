package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task4Librarian {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");
        driver.manage().window().maximize();
        driver.findElement(By.className("form-control")).sendKeys("incorrectemail@gmail.com");

        driver.findElement(By.id("inputPassword")).sendKeys("incorrectPassword");




    }
}

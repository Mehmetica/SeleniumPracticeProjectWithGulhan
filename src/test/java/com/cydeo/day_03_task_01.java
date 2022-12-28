package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_03_task_01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login1.nextbasecrm.com/ ");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.cssSelector("[name='USER_LOGIN']"));
        userName.sendKeys("asdasdasdaf");

        WebElement password = driver.findElement(By.cssSelector("[name='USER_PASSWORD']"));
        password.sendKeys("sdfsdfsdf");

        WebElement logInButton = driver.findElement(By.cssSelector(".log-popup-footer>input"));
        logInButton.click();

        WebElement error = driver.findElement(By.cssSelector(".errortext"));
        String actualErrorText = error.getText();
        String expectedErrorText = "Incorrect login or password";

        if (actualErrorText.equals(expectedErrorText)) {
            System.out.println("Error text verification is PASSED!");
        } else
            System.out.println("Error text verification is FAİLED!");


        driver.close();
    }
}

package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cydeo.com");
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        if (title.equals("Cydeo")){
            System.out.println("test passed");
        }else System.out.println("test fail");
        driver.quit();


    }
}

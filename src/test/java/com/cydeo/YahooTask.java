package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.yahoo.com");
        String title = driver.getTitle();
        System.out.println(title);
        if (title.contains("Yahoo")){
            System.out.println("Pass");
        }else System.out.println("Fail");

 
    }
}

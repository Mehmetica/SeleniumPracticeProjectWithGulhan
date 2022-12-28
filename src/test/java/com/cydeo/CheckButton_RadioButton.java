package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButton_RadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();

        WebElement blueRadioButton= driver.findElement(By.id("blue"));
        System.out.println("Before click blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        blueRadioButton.click();
        System.out.println("After click blueRadioButton.isSelected() = " + blueRadioButton.isSelected());


    }
}

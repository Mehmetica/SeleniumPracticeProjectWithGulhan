package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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

        WebElement redRadioButton = driver.findElement(By.id("red"));
        System.out.println("Before click redRadioButton.isSelected() = " + redRadioButton.isSelected());
        redRadioButton.click();
        System.out.println("After click redRadioButton.isSelected() = " + redRadioButton.isSelected());
        System.out.println("After selecting redRadioButton.isSelected() = " + blueRadioButton.isSelected());

         WebElement greenRadioButton = driver.findElement(By.id("green"));
        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());

        List<WebElement> allColors = driver.findElements(By.name("color"));
        System.out.println("allColors.size() = " + allColors.size());
        for (WebElement eachColor : allColors) {
            System.out.println("Current radio button is "+ eachColor.getAttribute("id"));
            System.out.println("Is it enabled: "+eachColor.isEnabled());
            System.out.println("Is it selected: "+eachColor.isSelected());

        }

        driver.quit();

    }
}

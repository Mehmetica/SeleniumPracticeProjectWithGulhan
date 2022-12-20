package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2RegistirationForm {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/registration_form");
        driver.manage().window().maximize();

        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeaderText = "Registration form";
        String actualHeaderText =headerText.getText();
        System.out.println("actualHeaderText = " + actualHeaderText);
        System.out.println("expectedHeasdwerText = " + expectedHeaderText);

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header verification Passed");
        }else System.out.println("Header verification Failed");



        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Mehmet");
        String expectedPlaceHolder ="first name";
        String actualPlacaeHolder = firstName.getAttribute("placeholder");
        if (expectedPlaceHolder.equals(actualPlacaeHolder)){
            System.out.println("Placeholder veriication PASSED");
        }else System.out.println("Placeholder verification FAİLED");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Gezer");

        driver.close();

    }
}

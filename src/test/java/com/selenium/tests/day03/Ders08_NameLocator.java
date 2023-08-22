package com.selenium.tests.day03;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ders08_NameLocator {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://devbook.bootflow.academy/login");
        driver.manage().window().maximize();

        WebElement understand_btn = driver.findElement(By.id("rcc-confirm-button"));
        understand_btn.click();

        WebElement email_textBox = driver.findElement(By.name("email"));
        email_textBox.sendKeys("falanca@gmail.com");
        WebElement password_textBox = driver.findElement(By.name("password"));

        String placeholderOfPassword = password_textBox.getAttribute("placeholder");
        System.out.println("placeholderOfPassword = " + placeholderOfPassword);

        String idOfPassword = password_textBox.getAttribute("id");
        System.out.println("idOfPassword = " + idOfPassword);

        driver.close();
    }
}

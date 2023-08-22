package com.selenium.tests.day03;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ders07_IdLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize(); //pencereyi tam sayfa yapar.

        WebElement fullName_textBox = driver.findElement(By.id("userName"));
        fullName_textBox.sendKeys("Ahmet Falanca");

        WebElement userEmail_textBox = driver.findElement(By.id("userEmail"));
        userEmail_textBox.sendKeys("falanca@gmail.com");

        driver.close();
    }
}

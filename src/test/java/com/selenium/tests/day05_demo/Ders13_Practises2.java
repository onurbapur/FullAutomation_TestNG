package com.selenium.tests.day05_demo;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ders13_Practises2 {

    /*
        Go to wikipedia.org (Links to an external site.)
        enter search term selenium webdriver
        click on search button
        click on search result Selenium (software)
        verify url ends with `Selenium_(software)'
     */
    public static void main(String[] args) {
        String searchWord = "selenium webdriver";
        String searchWord2 = "Selenium (software)";
        String verifyWord = "Selenium_(software)";

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://tr.wikipedia.org/wiki/Anasayfa");

        driver.findElement(By.xpath("(//div[@id='p-search']//input)[1]")).sendKeys(searchWord);
        driver.findElement(By.xpath("//button[text()='Ara']")).click();

        driver.findElement(By.xpath("//input[@id='ooui-php-1']")).clear();
        driver.findElement(By.xpath("//input[@id='ooui-php-1']")).sendKeys(searchWord2);
        driver.findElement(By.xpath("//span[@class='oo-ui-labelElement-label'][text()='Ara']")).click();

        System.out.println("driver.getCurrentUrl().endsWith(verifyWord) = " + driver.getCurrentUrl().endsWith(verifyWord));

        driver.close();
    }

}

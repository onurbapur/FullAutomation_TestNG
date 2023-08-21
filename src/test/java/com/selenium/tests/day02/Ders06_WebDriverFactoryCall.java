package com.selenium.tests.day02;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Ders06_WebDriverFactoryCall {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://www.facebook.com/" );

        Thread.sleep(2000);
        driver.close();

    }
}

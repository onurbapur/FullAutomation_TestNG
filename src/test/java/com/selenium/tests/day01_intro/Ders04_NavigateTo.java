package com.selenium.tests.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders04_NavigateTo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(2);  //2 saniye bekler

        driver.navigate().to("https://www.youtube.com"); // yteni bir url e gider

        Thread.sleep(2);
        driver.navigate().back(); // önceki sayfaya gider

        Thread.sleep(2);
        driver.navigate().forward(); // sayfayı ileri alır

        Thread.sleep(2);
        driver.navigate().refresh();  // Sayfayı yeniler

        Thread.sleep(2);
        driver.close();
    }
}

package com.selenium.tests.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders01_OpenBrowser {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        ((JavascriptExecutor) driver).executeScript("window.open()"); // yeni pencere açar
        driver.get("https://www.youtube.com"); // yeni pencere açılsa da aktif pencere değişmez

        driver.quit();  //  driver tüm pencereleriyle kapanır..
      //  driver.close(); //aktif olan pencereyi kapatır. driver kapalı pencerede kalır
    }
}

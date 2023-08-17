package com.selenium.tests.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders02_CLoseAndQuit {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.get("https://www.youtube.com");


        WebDriver driver1 = new ChromeDriver();

        driver1.get("https://www.google.com");


        //driver.quit();  //  driver tüm pencereleriyle kapanır..
        //  driver.close(); //aktif olan pencereyi kapatır. driver kapalı pencerede kalır
    }
}

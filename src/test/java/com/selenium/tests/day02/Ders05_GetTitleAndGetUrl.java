package com.selenium.tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders05_GetTitleAndGetUrl {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
        String actCurrentURL = driver.getCurrentUrl(); // açılan pencerenin URL metninini String olarak return eder.
        String expURL = "https://www.instagram.com/";
        if(actCurrentURL.equals(expURL)){   // açılan pencerenin o anki url ile beklediğimiz url karşılaştırmasını yapar
            System.out.println("URL ---> PASS");
        }else{
            System.out.println("URL ---> FAILED");
        }
        String actTitle = driver.getTitle(); // açılan pencerenin title metninini String olarak return eder.
        String expTitle = "Instagram";
        if(actTitle.equals(expTitle)){   // açılan pencerenin o anki title ile beklediğimiz title karşılaştırmasını yapar.
            System.out.println("TITLE ---> PASS");
        }else{
            System.out.println("TITLE ---> FAILED");
        }
    }
}

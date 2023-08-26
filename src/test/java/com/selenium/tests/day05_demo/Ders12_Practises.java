package com.selenium.tests.day05_demo;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ders12_Practises {
    /*
       Test case 1
       Go to Ebay
       enter search term as "java"
       click on search button
       print number of results
       verify title contains "java"
    */
    public static void main(String[] args) {
        String searchWord = "java";

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        // WebElement searchBox = driver.findElement(By.id("gh-ac"));
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys(searchWord);

        // WebElement searchButton = driver.findElement(By.id("gh-btn"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();

        String textOfResult = driver.findElement(By.xpath("//h1[contains(text(),'results for ')]")).getText();
        WebElement numberOfResult = driver.findElement(By.xpath("//h1[contains(text(),'results for ')]/*[1]"));

        if (textOfResult.contains("+")) {
            System.out.println("numberOfResult.getText() = " + numberOfResult.getText() + "+");
        } else {
            System.out.println("numberOfResult.getText() = " + numberOfResult.getText());
        }

        // tüm arama sonuç metnini verir
        System.out.println("All text for searchWord: " + driver.findElement(By.xpath("//h1[contains(text(),'results for ')]")).getText());

        System.out.println("driver.getTitle().contains(searchWord) = " + driver.getTitle().contains(searchWord));

        driver.close();
    }
}

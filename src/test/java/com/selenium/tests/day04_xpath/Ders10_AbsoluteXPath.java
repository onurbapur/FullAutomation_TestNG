package com.selenium.tests.day04_xpath;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ders10_AbsoluteXPath {

    // /html/body/div[1]/div[6]/div/main/turbo-frame/div/react-app/div/div/div[1]/div/div/main/div[2]/div/div[1]/div/div[1]/div/div[1]/div/div/button[1] absolute xpath

    // ---->  //button[@id="branch-picker-repos-header-ref-selector"] xpath

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");

        WebElement girisButonu = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]"));
        girisButonu.click();
    }

}

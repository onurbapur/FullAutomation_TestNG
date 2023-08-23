package com.selenium.tests.day04_xpath;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ders11_RelativeXPath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");

        // ---> //a[@class="nav-a nav-a-2   nav-progressive-attribute"][1]
        // ---> //a[@id="nav-link-accountList"]    --->  //span[text()='Merhaba, Giriş yapın']/../..
        WebElement girisButonu = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute'][1]"));

        girisButonu.click();

        // ---> //*[@id="nav-link-accountList"]   id attribute değeri "nav-link-accountList" olan her tagı(elementi) bulur
        // ---> //*[@*="nav-link-accountList"]

    }
}

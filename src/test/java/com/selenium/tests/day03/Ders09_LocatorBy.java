package com.selenium.tests.day03;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ders09_LocatorBy {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().window().maximize();

        WebElement example1_link = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        String hrefOfExample1 = example1_link.getAttribute("href");
        System.out.println("hrefOfExample1 = " + hrefOfExample1);

        WebElement example2_link = driver.findElement(By.partialLinkText("rendered after"));
        String textOfExample2 = example2_link.getText();
        System.out.println("textOfExample2 = " + textOfExample2);

        WebElement divAll = driver.findElement(By.className("example"));

    }
}

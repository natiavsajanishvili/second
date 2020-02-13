package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PARAM {

    @Test
    @Parameters({"saxeli", "paroli"})


    public void setup(String saxeli, String paroli) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://365.ge");
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys(saxeli);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(paroli);
        WebElement shesvla = driver.findElement(By.id("login-form-submit"));
        shesvla.click();
        Thread.sleep(3000);

        if (driver.findElements((By.xpath("//span[@id='otp-approve-content-close']"))).size() == 0) {
            quit(driver);
        } else {
            (driver.findElement(By.xpath("//span[@id='otp-approve-content-close']"))).click();
            quit(driver);
        }
    }

    public void quit(WebDriver driver) {
        driver.quit();


    }

}
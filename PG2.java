package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PG2 {
    @Test
    public void fb () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("pass"));
        email.sendKeys("natiatsu@gmail.com");
        password.sendKeys("123zxcZXC");
        WebElement login = driver.findElement(By.id("u_0_b"));
        Thread.sleep(5000);
        driver.quit();
    }
}

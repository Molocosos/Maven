package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.220-volt.ru/");
        driver.manage().window().setSize(new Dimension(1920, 935));
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        driver.findElement(By.id("link-login")).click();
        driver.findElement(By.id("user_email")).click();
        driver.findElement(By.id("user_email")).sendKeys(new CharSequence[]{"nastena.shock23@gmail.com"});
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).sendKeys(new CharSequence[]{"nastena1990"});
        driver.findElement(By.id("reg")).click();
        driver.findElement(By.id("user_email")).click();
        driver.findElement(By.id("user_email")).sendKeys(new CharSequence[]{"nastena.shock23@gmail.com"});
        driver.findElement(By.id("user_fullname")).sendKeys(new CharSequence[]{"MIRONOVA ANASTASIIA"});
        driver.findElement(By.id("user_phone")).sendKeys(new CharSequence[]{"+7 (981) 862-83-26"});
        driver.findElement(By.id("password1")).click();
        driver.findElement(By.id("password1")).sendKeys(new CharSequence[]{"9JAUSDLCchCqv4U"});
        driver.findElement(By.id("password2")).sendKeys(new CharSequence[]{"9JAUSDLCchCqv4U"});
        driver.findElement(By.cssSelector(".pvspace-40")).click();
        driver.findElement(By.id("register-submit-button")).click();
    }
}

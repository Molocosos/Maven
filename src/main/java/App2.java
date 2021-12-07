import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class App2 {
    public App2() {
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.220-volt.ru/login/");
        driver.manage().window().setSize(new Dimension(1920, 935));
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".menu-catalog-item-text:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".group-list-item:nth-child(2) .cont > .togglable > .togglable-toggler > .togglable-toggler-text")).click();
        driver.findElement(By.cssSelector(".group-list-item:nth-child(2) .togglable .togglable:nth-child(3) .togglable-toggler-text")).click();
        driver.findElement(By.xpath(".//a[@href='/catalog/fitnes-trekery/' and not(contains(@title,'Фитнес-трекеры'))]")).click();
        driver.findElement(By.cssSelector(".box-inline:nth-child(2) .new-item-list-group .text-in-cart-btn")).click();
        driver.findElement(By.linkText("Оформить заказ")).click();
    }
}
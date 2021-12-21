package PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public abstract class AbstractTest {
    static WebDriver webDriver;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    }

    @BeforeEach
    void initMainPage() {
        Assertions.assertDoesNotThrow(() -> webDriver.navigate().to("https://www.220-volt.ru/"));
    }

    @AfterAll
    public static void exit() {
        if (webDriver != null) webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return this.webDriver;
    }
}

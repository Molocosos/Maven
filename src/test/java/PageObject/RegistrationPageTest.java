package PageObject;

import PageObject.AbstractTest;
import PageObject.RegistrationPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RegistrationPageTest extends AbstractTest {

    @Test
    void registration() {
        new RegistrationPage(getWebDriver()).setEmail("nastena.shock23@gmail.com").setPassword("9JAUSDLCchCqv4U").loginIn();
        Assertions.assertTrue(webDriver.findElement(By.id("user_email")).getText.equals("Your account");

    }

}
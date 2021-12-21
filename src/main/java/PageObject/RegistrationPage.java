package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {
    public RegistrationPage(WebDriver driver) {
        super(driver);


        @FindBy(id = "user_email")
        private WebElement email;

        @FindBy(id = "user_email")
        private WebElement email;

        @FindBy(id = "user_password")
        private WebElement password;

        @FindBy(id = "user_password")
        private WebElement password;


        public void RegistrationPage setEmail(String email) {
            this.email.click();
            this.emailInput.sendKeys(email);
            return this;
        }

        public void RegistrationPage setPassword(String password) {
            this.password.click();
            this.passwordInput.sendKeys(password);
            return this;
        }
    }
}

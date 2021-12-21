package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {
    public MainPage(WebDriver driver) {
        super(driver);


        @FindBy(css = "li:nth-child(2) > .menu-catalog-item")
        private WebElement catalog;


        @FindBy(css = ".text-in-cart-btn")
        private WebElement cart;

    }
public void MainPage setCatalog () {
        this.catalog.click();
    }

    public void MainPage setCart() {
        this.cart.click();
    }

}

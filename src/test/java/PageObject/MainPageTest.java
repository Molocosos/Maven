package PageObject;

import PageObject.AbstractTest;
import PageObject.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainPageTest  extends AbstractTest {

    @Test
    void catalog(){
        new MainPage(getWebDriver()).setCatalog("catalog");
        Assertions.assertTrue(webDriver.findElement("li:nth-child(2) > .menu-catalog-item"));
    }



    @Test
    void cart(){
        new MainPage(getWebDriver()).setCart("cart");
        Assertions.assertTrue(webDriver.findElement(".text-in-cart-btn"));
    }
}

package Tests;


import Objects.Product;
import Pages.CartPage;
import Pages.HomePage;
import Pages.SearchPage;
import Utilities.Parser;
import Utilities.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.FileNotFoundException;

public class AddProductToCartTest extends BaseTest {

    public AddProductToCartTest() {
        super("firefox", "https://demo.opencart.com/");
    }

    @Test()
    public void addProductToCart() throws InterruptedException {
        SearchPage search = new SearchPage(getDriver());
        HomePage home = new HomePage(getDriver());
        CartPage cart = new CartPage(getDriver());
        Wait w = new Wait(getDriver());
        search.searchProduct("MacBook");
        w.waitElement(search.getSearchH1());
        search.addProductToCart("MacBook");
        Wait wait = new Wait(getDriver());
        // this method will wait for the success message to load
        wait.waitForJSandJQueryToLoad();
        Assert.assertTrue(search.getSuccessMessage().getText().contains("Success"));
        home.getShoppingCartCTA().click();
        //wait for the "Shopping Cart" h1
        w.waitElement(cart.getCartH1());
        cart.getCheckoutButton().click();
        w.waitElement(cart.getAlertMessage());
        //validate that message is displayed after clicking the checkout button
        Assert.assertEquals(cart.getAlertMessage().isDisplayed(), true);

    }
}

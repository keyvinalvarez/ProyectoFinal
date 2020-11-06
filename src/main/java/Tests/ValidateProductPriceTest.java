package Tests;

import Objects.Product;
import Pages.HomePage;
import Pages.ProductDetailPage;
import Utilities.Parser;
import Utilities.Utilities;
import Utilities.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateProductPriceTest extends  BaseTest{
    int count =0;

    public ValidateProductPriceTest(){
      super("firefox", "https://demo.opencart.com/");
    }

    @Test(dataProvider = "getProductsFromJson", dataProviderClass = Parser.class)
    public void validateProductPrice(Product products){
        HomePage home = new HomePage(getDriver());
        ProductDetailPage pdp = new ProductDetailPage(getDriver());
        Utilities util = new Utilities();
        Wait w = new Wait(getDriver());
        getDriver().get(products.getUrl());
        w.waitElement(pdp.getProductDetailH1());
        home.getCurrencyToggle().click();
        home.getDolarButton().click();
        Assert.assertEquals(util.removeSpecialCaractersFromText(pdp.getPrice().getText()), products.getPrice().get(count).getDolar());
        home.getCurrencyToggle().click();
        home.getEuroButton().click();
        Assert.assertEquals(util.removeSpecialCaractersFromText(pdp.getPrice().getText()), products.getPrice().get(count).getEuro());
        home.getCurrencyToggle().click();
        home.getPoundButton().click();
        Assert.assertEquals(util.removeSpecialCaractersFromText(pdp.getPrice().getText()), products.getPrice().get(count).getPound());

    }
}

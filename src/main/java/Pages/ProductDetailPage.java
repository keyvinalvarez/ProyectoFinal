package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

    @FindBy(xpath="//*[contains(@id,'content')]//h1")
    WebElement productDetailH1;

    @FindBy(xpath="//*[contains(@class,'col-sm-4')]//h2")
    WebElement price;

    public  ProductDetailPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getProductDetailH1() {
        return productDetailH1;
    }

    public void setProductDetailH1(WebElement productDetailH1) {
        this.productDetailH1 = productDetailH1;
    }

    public WebElement getPrice() {
        return price;
    }

    public void setPrice(WebElement price) {
        this.price = price;
    }
}

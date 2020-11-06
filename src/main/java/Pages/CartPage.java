package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement cartH1;

    @FindBy(xpath = "//*[@class='btn btn-primary' and contains(., 'Checkout')]")
    WebElement checkoutButton;

    @FindBy(xpath = "//*[@class='alert alert-danger alert-dismissible']")
    WebElement alertMessage;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getCartH1() {
        return cartH1;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getAlertMessage() {
        return alertMessage;
    }
}

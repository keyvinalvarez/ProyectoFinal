package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    @FindBy(xpath = "//*[@class='hidden-xs hidden-sm hidden-md' and contains(text(), 'My Account')]")
    WebElement myAccountCTA;

    @FindBy(xpath = "//ul/*[@class='dropdown open']/ul/li/a[contains(text(), 'Register')]")
    WebElement registerCTA;

    @FindBy(xpath = "//*[@class='list-unstyled']/li/a[contains(.,'My Account')]")
    WebElement myAccountFooterCTA;

    @FindBy(xpath = "//*[@class='hidden-xs hidden-sm hidden-md' and contains(text(), 'Shopping Cart')]")
    WebElement ShoppingCartCTA;

    @FindBy(xpath = "//*[@class='btn btn-link dropdown-toggle']")
    WebElement currencyToggle;

    @FindBy(xpath = "//*[@name='EUR']")
    WebElement euroButton;

    @FindBy(xpath = "//*[@name='GBP']")
    WebElement poundButton;

    @FindBy(xpath = "//*[@name='USD']")
    WebElement dolarButton;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyAccountCTA() {
        return myAccountCTA;
    }

    public WebElement getRegisterCTA() {
        return registerCTA;
    }

    public WebElement getShoppingCartCTA() {
        return ShoppingCartCTA;
    }

    public WebElement getCurrencyToggle() {
        return currencyToggle;
    }

    public WebElement getEuroButton() {
        return euroButton;
    }

    public WebElement getPoundButton() {
        return poundButton;
    }

    public WebElement getDolarButton() {
        return dolarButton;
    }

    public WebElement getMyAccountFooterCTA() {
        return myAccountFooterCTA;
    }
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchPage {

    @FindBy(xpath = "//*[@id='search']/input")
    WebElement searchBar;

    @FindBy(xpath = "//*[@id='search']/span/button")
    WebElement searchButton;

    @FindBy(xpath = "//h1[contains(text(),'Search')]")
    WebElement searchH1;

    @FindBy(xpath = "//*[@class='caption']/h4/a")
    List<WebElement> productNames;

    @FindBy(xpath = "//button[@type='button' and contains(.,'Add to Cart')]")
    List<WebElement> AddToCartButtons;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible' and contains(text(),'Success')]")
    WebElement successMessage;


    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public List<WebElement> getProductNames() {
        return productNames;
    }

    public List<WebElement> getAddToCartButtons() {
        return AddToCartButtons;
    }

    public WebElement getSearchH1() {
        return searchH1;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public void searchProduct(String productName) {
        searchBar.sendKeys(productName);
        searchButton.click();
    }


    public void addProductToCart(String productName) {
        for (int i = 0; i < this.productNames.size(); i++) {
            if (productNames.get(i).getText().equals(productName)) {
                this.AddToCartButtons.get(i).click();
            }
        }
    }

}

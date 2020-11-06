package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage {
    @FindBy(xpath = "//*[@id='content']/h1")
    WebElement registrationSuccessLabel;

    @FindBy(xpath = "//*[@class='btn btn-primary' and contains(text(),'Continue')]")
    WebElement continueButton;

    public SuccessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getRegistrationSuccessLabel() {
        return registrationSuccessLabel;
    }

    public void setRegistrationSuccessLabel(WebElement registrationSuccessLabel) {
        this.registrationSuccessLabel = registrationSuccessLabel;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}

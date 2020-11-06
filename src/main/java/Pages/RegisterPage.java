package Pages;

import Objects.User;
import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class RegisterPage {

    @FindBy(xpath = "//*[@id='content']/h1")
    WebElement h1Title;

    @FindBy(xpath = "//*[@id='input-firstname']")
    WebElement firstNameField;

    @FindBy(xpath = "//*[@id='input-lastname']")
    WebElement lastNameField;

    @FindBy(xpath = "//*[@id='input-email']")
    WebElement emailField;

    @FindBy(xpath = "//*[@id='input-telephone']")
    WebElement telephoneField;

    @FindBy(xpath = "//*[@id='input-password']")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id='input-confirm']")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//*[@class='radio-inline' and contains(.,'Yes')]")
    WebElement newsletterSubscribeYesRadio;

    @FindBy(xpath = "//*[@class='radio-inline' and contains(.,'No')]")
    WebElement newsletterSubscribeNoRadio;

    @FindBy(xpath = "//*[@name='agree']")
    WebElement agreePolicyPrivacyCheckField;

    @FindBy(xpath = "//*[@class='btn btn-primary' and contains(@value, 'Continue')]")
    WebElement continueButton;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public WebElement getH1Title() {
        return h1Title;
    }

    public void setH1Title(WebElement h1Title) {
        this.h1Title = h1Title;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public void setFirstNameField(WebElement firstNameField) {
        this.firstNameField = firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(WebElement lastNameField) {
        this.lastNameField = lastNameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public void setEmailField(WebElement emailField) {
        this.emailField = emailField;
    }

    public WebElement getTelephoneField() {
        return telephoneField;
    }

    public void setTelephoneField(WebElement telephoneField) {
        this.telephoneField = telephoneField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(WebElement passwordField) {
        this.passwordField = passwordField;
    }

    public WebElement getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public void setConfirmPasswordField(WebElement confirmPasswordField) {
        this.confirmPasswordField = confirmPasswordField;
    }

    public WebElement getNewsletterSubscribeYesRadio() {
        return newsletterSubscribeYesRadio;
    }

    public void setNewsletterSubscribeYesRadio(WebElement newsletterSubscribeYesRadio) {
        this.newsletterSubscribeYesRadio = newsletterSubscribeYesRadio;
    }

    public WebElement getNewsletterSubscribeNoRadio() {
        return newsletterSubscribeNoRadio;
    }

    public void setNewsletterSubscribeNoRadio(WebElement newsletterSubscribeNoRadio) {
        this.newsletterSubscribeNoRadio = newsletterSubscribeNoRadio;
    }

    public WebElement getAgreePolicyPrivacyCheckField() {
        return agreePolicyPrivacyCheckField;
    }

    public void setAgreePolicyPrivacyCheckField(WebElement agreePolicyPrivacyCheckField) {
        this.agreePolicyPrivacyCheckField = agreePolicyPrivacyCheckField;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public void setContinueButton(WebElement continueButton) {
        this.continueButton = continueButton;
    }

    public void fillRegistrationForm(User user) {

        Utilities util = new Utilities();

        getFirstNameField().sendKeys(user.getFirstName());
        getLastNameField().sendKeys(user.getLastName());
        getEmailField().sendKeys(util.generateRandomEmail());
        getTelephoneField().sendKeys(user.getTelephone());
        getPasswordField().sendKeys(user.getPassword());
        getConfirmPasswordField().sendKeys(user.getPassword());
        getNewsletterSubscribeYesRadio().click();
        getAgreePolicyPrivacyCheckField().click();
        getContinueButton().click();
    }
}

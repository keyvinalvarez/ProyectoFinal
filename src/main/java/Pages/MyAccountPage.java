package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    @FindBy(xpath = "//*[@id='content']/h2[contains(., 'My Account')]")
    WebElement myAccountH1;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyAccountH1() {
        return myAccountH1;
    }
}

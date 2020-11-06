package Tests;

import Objects.User;
import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.RegisterPage;
import Pages.SuccessPage;
import Utilities.Parser;
import Utilities.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUserTest extends BaseTest {


    public RegisterUserTest() {
        super("firefox", "https://demo.opencart.com/");
    }

    @Test(dataProvider = "getUsersFromJson", dataProviderClass = Parser.class)
    public void registerNewUser(User user) {
        HomePage home = new HomePage(getDriver());
        RegisterPage register = new RegisterPage(getDriver());
        SuccessPage success = new SuccessPage(getDriver());
        MyAccountPage account = new MyAccountPage(getDriver());
        Wait w = new Wait(getDriver());
        String expectedMessage = "Your Account Has Been Created!";
        //open the registration form from the main navigation
        home.getMyAccountCTA().click();
        w.waitElement(home.getRegisterCTA());
        home.getRegisterCTA().click();
        //fill the registration form and continue
        register.fillRegistrationForm(user);
        //validate the success message
        w.waitElement(register.getH1Title());
        success.getContinueButton().click();
        home.getMyAccountFooterCTA().click();
        w.waitElement(account.getMyAccountH1());
        Assert.assertTrue(account.getMyAccountH1().getText().contains("My Account"));
    }

}

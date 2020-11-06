package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;
    private String browser;
    private String baseURL;

    public BaseTest(String browser, String baseURL) {
        this.browser = browser;
        this.baseURL = baseURL;
    }

    public WebDriver getDriver() {
        return driver;
    }




    @BeforeMethod
    public void setUpTest() {
        this.setWebDriver(this.browser);
        this.driver.get(this.baseURL);
    }

    @AfterMethod
    public void tearDown() {
        this.driver.quit();
    }

    private void setWebDriver(String browser) {

        switch (browser.toLowerCase()) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                this.driver = new FirefoxDriver();
                break;

            case "chrome":
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();
                this.driver.manage().window().maximize();
                break;

        }

    }
}

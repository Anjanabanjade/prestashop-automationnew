package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import prestashop.DriverFactory;

public class BaseTest {

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp( String browser) {
        DriverFactory.createDriver(browser);
    }

    protected WebDriver driver() {
        return DriverFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
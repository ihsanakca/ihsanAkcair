package seleniumTests.day_5;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumTests.utilities.WebDriverFactory;

public class SaucedemoTest_TestNG {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test1() {
        System.out.println("ihsan");
        Assert.assertNotEquals(3, 4);
        System.out.println("test doğru ama kod yanlış...düzeltildi..");
        driver.get("https://www.saucedemo.com");
    }
}

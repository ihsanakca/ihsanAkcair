package seleniumTests.day_6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumTests.utilities.WebDriverFactory;

import java.util.List;

public class FindElements {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/components/listgroup");

        List<WebElement> elements=driver.findElements(By.cssSelector(".form-check-input.me-1"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",elements.get(4));

        Thread.sleep(5000);

        System.out.println("elements.size() = " + elements.size());

        for (WebElement element:elements) {
            element.click();
        }
        Thread.sleep(5000);
        for (WebElement element:elements) {
            Assert.assertTrue(element.isSelected());
        }
    }
}

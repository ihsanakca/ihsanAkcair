package seleniumTests.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumTests.utilities.WebDriverFactory;

import java.util.Set;

public class MultipleWindows {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/components/opennew");

        WebElement openNewTab= driver.findElement(By.xpath("//a[.='Open New Tab']"));
        Thread.sleep(3000);
        String firstPage = driver.getWindowHandle();
        openNewTab.click();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(firstPage)){
                driver.switchTo().window(windowHandle);
                break;

            }

        }

        Thread.sleep(3000);

        String actualText=driver.findElement(By.xpath("//h1[.='Alerts']")).getText();
        String expectedtext="Alerts";

        System.out.println("actualText = " + actualText);

        Assert.assertEquals(actualText,expectedtext,"FAIL");

    }
}

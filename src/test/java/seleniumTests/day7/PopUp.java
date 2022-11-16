package seleniumTests.day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumTests.utilities.WebDriverFactory;

import java.util.List;

public class PopUp {
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
        driver.get("https://www.krafttechexlab.com/javascript/alerts");
        WebElement clickButton = driver.findElement(By.cssSelector("#myBtnClick"));
        Thread.sleep(1000);
        clickButton.click();
        Thread.sleep(1000);

        Alert alert=driver.switchTo().alert();
        //accept()
        //dismiss()
        //sendkeys()
        //getText()
        Thread.sleep(1000);
        alert.accept();

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/javascript/alerts");

        List<WebElement> elements = driver.findElements(By.xpath("//button[.='Click Me']"));
        elements.get(2).click();
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert();

        alert.dismiss();
        Thread.sleep(2000);


    }
}

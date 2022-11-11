package seleniumTests.day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumTests.utilities.WebDriverFactory;

import java.util.List;

public class DropDown {
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
    public void test() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/forms/select");
        WebElement dropDownMenu= driver.findElement(By.xpath("(//select[@class='form-select'])[1]"));

        Select select=new Select(dropDownMenu);

        select.selectByIndex(3);
        System.out.println("select.getFirstSelectedOption().getText() = " + select.getFirstSelectedOption().getText());

        select.selectByVisibleText("Two");

        Thread.sleep(3000);

        List<WebElement> options = select.getOptions();

        System.out.println("options.size() = " + options.size());
        int actual=options.size();
        int expected=4;

        Assert.assertEquals(actual,expected,"verifing list size");

        for (WebElement option : options) {
            System.out.println("option.getText() = " + option.getText());
        }
    }
}

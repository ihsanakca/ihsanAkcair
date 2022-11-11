package seleniumTests.day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumTests.utilities.WebDriverFactory;

public class RadioButtons {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/forms/radio");

        WebElement clickedBtn = driver.findElement(By.cssSelector("#gridRadios1"));
        System.out.println("clickedBtn.isSelected() = " + clickedBtn.isSelected());
        System.out.println("clickedBtn.isDisplayed() = " + clickedBtn.isDisplayed());
        System.out.println("clickedBtn.isEnabled() = " + clickedBtn.isEnabled());

        Assert.assertTrue(clickedBtn.isSelected(), "FAIL");
        Thread.sleep(2000);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/index");
        WebElement formsBtn = driver.findElement(By.xpath("//span[.='Forms']"));
        formsBtn.click();
        Thread.sleep(3000);

        WebElement radioBtn = driver.findElement(By.xpath("//span[.='Radio']/../i"));

        System.out.println("radioBtn.isEnabled() = " + radioBtn.isEnabled());
        System.out.println("radioBtn.isDisplayed() = " + radioBtn.isDisplayed());
        System.out.println("radioBtn.isSelected() = " + radioBtn.isSelected());

        Assert.assertTrue(radioBtn.isDisplayed(),"verifies that button can be displayed");
    }

    @Test
    public void test3() {
        driver.get("https://www.krafttechexlab.com");

        WebElement componentsBtn=driver.findElement(By.cssSelector("ul#components-nav"));
        System.out.println("componentsBtn.getAttribute(\"class\") = " + componentsBtn.getAttribute("class"));
        System.out.println("componentsBtn.getAttribute(\"outerHTML\") = " + componentsBtn.getAttribute("innerHTML"));
//Burayı tamamlamalı.....
    }
}

package seleniumTests.mentorHW.day3_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumTests.utilities.WebDriverFactory;

public class Assertions_TestNG {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        WebElement sellElement = driver.findElement(By.xpath("//a[text()='Sell']"));

        String beklenen="Sell";

        String gerçek=sellElement.getText();

        Assert.assertEquals(gerçek,beklenen);

        driver.close();
    }

    @Test
    public void test2(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        WebElement sellElement = driver.findElement(By.xpath("//a[text()='Sell']"));

        String actualValue=sellElement.getText();

        String expectedValue="Seller";

        Assert.assertTrue(expectedValue.contains(actualValue));

        driver.close();

    }

}

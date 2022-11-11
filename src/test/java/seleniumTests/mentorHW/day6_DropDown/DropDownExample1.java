package seleniumTests.mentorHW.day6_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumTests.utilities.WebDriverFactory;

public class DropDownExample1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("edge");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/");

        WebElement formsBtn = driver.findElement(By.xpath("(//i[@class='bi bi-journal-text'])[1]"));
        formsBtn.click();
        Thread.sleep(3000);

        WebElement roadioBtn = driver.findElement(By.xpath("//a[@href='https://www.krafttechexlab.com/forms/radio']"));
        roadioBtn.click();
        Thread.sleep(3000);

        WebElement checkRadio1Btn = driver.findElement(By.cssSelector("#gridRadios1"));
        System.out.println("checkRadio1Btn.isSelected() = " + checkRadio1Btn.isSelected());

        Assert.assertTrue(checkRadio1Btn.isSelected(), "First Button must be selected..");

        String expectedText = "Checked Radio 1";
        String actualText = driver.findElement(By.xpath("//input[@id='gridRadios1']/..")).getText();
        System.out.println("actualText = " + actualText);

        Assert.assertEquals(actualText, expectedText, "Checked Radio 1 text must be displayed.");

        System.out.println("checkRadio1Btn.isDisplayed() = " + checkRadio1Btn.isDisplayed());

        Assert.assertTrue(checkRadio1Btn.isDisplayed());

        WebElement radio2Btn = driver.findElement(By.cssSelector("#gridRadios2"));
        System.out.println("radio2Btn.isSelected() = " + radio2Btn.isSelected());

        Assert.assertTrue(!radio2Btn.isSelected(), "Radio 2 boutton should be non-selected..");

        String expectedText2 = "Radio 2";
        String actualText2 = driver.findElement(By.xpath("//input[@id='gridRadios2']/..")).getText();
        System.out.println("actualText2 = " + actualText2);

        Assert.assertEquals(actualText2, expectedText2, "'Radio 2' writing should be seen...");

        System.out.println("radio2Btn.isDisplayed() = " + radio2Btn.isDisplayed());

        Assert.assertTrue(radio2Btn.isDisplayed(), "Radio 2 Button must be displayed..");

        Thread.sleep(2000);

        WebElement disabledRadioBtn = driver.findElement(By.cssSelector("#gridRadios"));
        System.out.println("disabledRadioBtn.isSelected() = " + disabledRadioBtn.isSelected());

        Assert.assertFalse(disabledRadioBtn.isSelected(), "Disable Radio button should be non-selected..");

        System.out.println("disabledRadioBtn.isEnabled() = " + disabledRadioBtn.isEnabled());
        System.out.println("disabledRadioBtn.isDisplayed() = " + disabledRadioBtn.isDisplayed());

        Assert.assertTrue(!disabledRadioBtn.isEnabled(), "button should be disable..");
        Assert.assertTrue(disabledRadioBtn.isDisplayed(), "button should be seen...");

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/");

        WebElement checkBox = driver.findElement(By.xpath("//a[@href='https://www.krafttechexlab.com/forms/checkbox']"));
        System.out.println("checkBox.isDisplayed() = " + checkBox.isDisplayed());
        Assert.assertFalse(checkBox.isDisplayed(), "checkBox button shouldn't be seen...");

        driver.findElement(By.xpath("(//a[@class='nav-link collapsed'])[2]")).click();
        Thread.sleep(3000);

        System.out.println("checkBox.isDisplayed() = " + checkBox.isDisplayed());
        Assert.assertTrue(checkBox.isDisplayed(), "checkBox button should be seen...");
        checkBox.click();

        WebElement checkBox1 = driver.findElement(By.cssSelector("#gridCheck1"));
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        Assert.assertFalse(checkBox1.isSelected(), "should be non-selected");
        checkBox1.click();
        Assert.assertTrue(checkBox1.isSelected(), "should be selected...");

        WebElement checkBox2 = driver.findElement(By.cssSelector("#gridCheck2"));
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());
        Assert.assertTrue(checkBox2.isSelected(), "should be default selected...");

        WebElement checkBox3 = driver.findElement(By.cssSelector("#gridCheck3"));
        System.out.println("checkBox3.isEnabled() = " + checkBox3.isEnabled());
        Assert.assertTrue(!checkBox3.isEnabled(), "should be disable");

        WebElement checkBox4 = driver.findElement(By.cssSelector("#gridCheck4"));
        System.out.println("checkBox4.isDisplayed() = " + checkBox4.isDisplayed());
        Assert.assertTrue(checkBox4.isDisplayed(),"should be seen, but non activee button...");
    }
}

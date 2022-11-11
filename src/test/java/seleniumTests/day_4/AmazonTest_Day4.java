package seleniumTests.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTests.utilities.WebDriverFactory;

public class AmazonTest_Day4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("edge");
        driver.get("https://www.amazon.com.tr");

        WebElement hesapButton=driver.findElement(By.xpath("//span[text()='Hesap ve Listeler']"));
        hesapButton.click();

        WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("ihsanakcair@gmail.com");

        WebElement continueButton=driver.findElement(By.xpath("//input[@class='a-button-input']"));
        continueButton.click();

        WebElement forget=driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']"));
        forget.click();

//        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
//        password.sendKeys("Mpxja261");
//
//        WebElement singInButton=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
//        singInButton.click();

        driver.quit();
    }
}

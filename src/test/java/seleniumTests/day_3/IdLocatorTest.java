package seleniumTests.day_3;

import seleniumTests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        WebElement searchDropBox=driver.findElement(By.id("searchDropdownBox"));
        searchDropBox.click();
        Thread.sleep(3000);

        WebElement serachBar=driver.findElement(By.id("twotabsearchtextbox"));
        serachBar.sendKeys("java books");

        Thread.sleep(3000);

        WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        WebElement javaNathanBook=driver.findElement(By.partialLinkText("Java: Programming Basics" +
                " for Absolute Beginners (Step-By-Step Java)"));
        javaNathanBook.click();

        WebElement addToCartButton=driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        WebElement goToCartButton=driver.findElement(By.partialLinkText("Go to Cart"));
        goToCartButton.click();

       WebElement proceedToCheckoutButton=driver.findElement(By.name("proceedToRetailCheckout"));
       proceedToCheckoutButton.click();

       WebElement appEmail=driver.findElement(By.id("ap_email"));

       appEmail.sendKeys("abc@gmail.com");

       WebElement continueButton=driver.findElement(By.id("continue"));
       continueButton.click();




    driver.quit();

    }
}

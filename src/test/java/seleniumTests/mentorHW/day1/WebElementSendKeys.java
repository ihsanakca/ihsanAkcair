package seleniumTests.mentorHW.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys("apple");
        Thread.sleep(3000);
        WebElement searchButton =driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        Thread.sleep(3000);
        driver.quit();
    }
}

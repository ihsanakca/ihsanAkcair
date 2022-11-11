package seleniumTests.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTests.utilities.WebDriverFactory;

public class hepsiBuradaCont {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com");
        Thread.sleep(2000);

        WebElement searchBar = driver.findElement(By.xpath("//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));
        searchBar.sendKeys("mouse");
        Thread.sleep(2000);
        WebElement araButton = driver.findElement(By.xpath("//div[text()='ARA']"));
        araButton.click();



        driver.close();
    }

}

package seleniumTests.day_3;

import seleniumTests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hepsiBuradaExircise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Edge");
        driver.get("https://www.hepsiburada.com");
        driver.manage().window().maximize();
        WebElement searchBar = driver.findElement(By.className("desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b"));
        searchBar.sendKeys("java");
        WebElement araButton = driver.findElement(By.className("SearchBoxOld-cHxjyU99nxdIaAbGyX7F"));
        araButton.click();
        Thread.sleep(3000);



//        driver.quit();
    }
}

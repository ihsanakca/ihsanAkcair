package seleniumTests.mentorHW.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTests.utilities.WebDriverFactory;

public class CssOrnek {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        String str = "selenium";
        searchBar.sendKeys(str);

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();

        Thread.sleep(2000);

        WebElement searchingMaterialName=driver.findElement(By.cssSelector(".a-color-state.a-text-bold"));

        System.out.println("searchingMaterialName.getText() = " + searchingMaterialName.getText());
        System.out.println("str = " + str);

        if(searchingMaterialName.getText().equals("\""+str+"\"")){
            System.out.println("PASS...");
        }else {
            System.out.println("FAILED...");
        }

        WebElement fourStar=driver.findElement(By.cssSelector(".a-icon.a-icon-star-medium.a-star-medium-4"));
        fourStar.click();
        driver.quit();


    }
}

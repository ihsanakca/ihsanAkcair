package seleniumTests.day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTests.utilities.WebDriverFactory;

public class LivescoreTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.livescore.in/tr/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[.='Kabul ediyorum']")).click();

        driver.findElement(By.xpath("(//span[.='Süper Lig'])[2]")).click();

        driver.findElement(By.id("li3")).click();

     String str= driver.findElement(By.xpath("//a[.='Trabzonspor']")).getText();

        System.out.println("Şampiyon "+str);

        Thread.sleep(3000);

        driver.close();




    }
}

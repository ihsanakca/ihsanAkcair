package amazonCom.mentorExample.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementIntro {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        WebElement searchButton=driver.findElement(By.id("twotabsearchtextbox"));
        searchButton.click();

        String expectedUrl="https://www.amazon.com/";
        String actualUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASSED");
        }else {
            System.out.println("UNPASSED");
        }
        driver.quit();
    }
}

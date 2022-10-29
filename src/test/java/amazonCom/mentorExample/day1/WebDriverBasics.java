package amazonCom.mentorExample.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverBasics {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.com");
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.amazon.com");

        Thread.sleep(3000);

        String currentUrl = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println("currentUrl = " + currentUrl);
        System.out.println("title = " + title);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.quit();



    }
}

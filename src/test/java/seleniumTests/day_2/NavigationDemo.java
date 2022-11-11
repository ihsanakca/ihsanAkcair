package seleniumTests.day_2;

import seleniumTests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("fireFox");

        driver.get("https://www.krafttechnologie.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.close();

        WebDriver driver1= WebDriverFactory.getDriver("Edge");
        driver1.get("https://www.facebook.com");
        System.out.println("driver1.getTitle() = " + driver1.getTitle());
        driver1.quit();
    }
}

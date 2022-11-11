package seleniumTests.day_2;

import seleniumTests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class GetUrl {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chRome");
        driver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String actualUrl=driver.getCurrentUrl();
        Thread.sleep(2000);
        String expectedUrl="https://www.facebook.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Existing URL is correct.");
        }else {
            System.out.println("Existing URL is INCORRECT");
        }
        String pageSource = driver.getPageSource();
        Thread.sleep(2000);
        if (pageSource.contains("facebook")){
            System.out.println("The domain name is written on the source page.");
        }else {
            System.out.println("The domain name can not be found on the source page.");
        }
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.close();
    }
}

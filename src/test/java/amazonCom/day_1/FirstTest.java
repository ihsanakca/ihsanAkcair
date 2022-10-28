package amazonCom.day_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driverChrome=new ChromeDriver();
//        WebDriver driverChrome1=new ChromeDriver();

        driverChrome.get("https://www.hepsiburada.com/");
        driverChrome.manage().window().maximize();

        System.out.println("driverChrome.getTitle() = " + driverChrome.getTitle());

        String actualTitle="Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com";

        if (actualTitle.equals(driverChrome.getTitle())){
            System.out.println("Test GEÇTİ. Başlık Doğru...");
        }else {
            System.err.println("Test BAŞARISIZ. Başlık HATALI...");
        }

        driverChrome.close();

//        driverChrome1.get("https://www.amazon.com/");
//        System.out.println("driverChrome1.getTitle() = " + driverChrome1.getTitle());
    }
}

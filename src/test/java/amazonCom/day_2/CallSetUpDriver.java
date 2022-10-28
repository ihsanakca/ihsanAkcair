package amazonCom.day_2;

import amazonCom.usableMethods.SetUpDriver;
import org.openqa.selenium.WebDriver;

public class CallSetUpDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=SetUpDriver.getDriver("EDGE");

        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com.tr/");

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        String expectedTitle="Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, " +
                "oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";
        System.out.println("expectedTitle = " + expectedTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is corect.");
        }else{
            System.err.println("Title is INCORRECT. Must be corrected");
        }
        driver.quit();



    }
}

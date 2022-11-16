package seleniumTests.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumTests.utilities.WebDriverFactory;

public class Iframe {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/components/iframe");

//        driver.switchTo().frame(0);
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));


        driver.findElement(By.xpath("(//button[@class='btn-close'])[1]")).click();
        Thread.sleep(2000);

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame("frame1");
        Thread.sleep(2000);
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.xpath("//p[.='Child Iframe']")).getText());

//        driver.switchTo().parentFrame(); //bir üste
//        driver.switchTo().defaultContent();//en üste

    }
}

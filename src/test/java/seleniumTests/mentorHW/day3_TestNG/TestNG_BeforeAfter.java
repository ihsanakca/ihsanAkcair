package seleniumTests.mentorHW.day3_TestNG;

import org.testng.annotations.*;

public class TestNG_BeforeAfter {

    @Test
    public void test1(){
        System.out.println("first test case");
    }

    @Test
    public void test2(){
        System.out.println("first test case");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Webdriver, opening browser");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("close driver");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }


}

package Definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //el trabajo del robot automatizado


    @After
    public static void tearDown (){
        driver.manage().deleteAllCookies();
        //driver.close();
    }
}
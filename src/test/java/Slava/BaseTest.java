package Slava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Vladyslav Vlasov on 02.12.2018.
 */
public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "H:\\projects\\automationFromScratch\\src\\main\\utils\\chromedriver.exe");

        driver = new ChromeDriver();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}

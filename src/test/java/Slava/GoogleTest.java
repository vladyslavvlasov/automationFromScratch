package Slava;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class GoogleTest extends BaseTest
{
    private String expectedURL= "https://www.google.com.ua/";

    @Test
    public void openHomePage()
    {
        driver.get("https://www.google.com.ua");
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL, "Expected current url to equal " + expectedURL);
    }
}

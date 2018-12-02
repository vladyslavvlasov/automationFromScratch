package Slava;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Murcielago on 02.12.2018.
 */
public class FootballTest extends BaseTest {
    private String expectedURL= "https://www.google.com.ua/";

    private String expectedWrongURL= "https://www.google.com.ua2/";

    @Test
    public void openHomePage()
    {
        driver.get("https://www.football.com.ua");
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL, "Expected current url to equal " + expectedURL);
    }
}

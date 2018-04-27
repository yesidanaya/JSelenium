package selenium.tests;

import org.junit.Assert;
import org.junit.Test;
import selenium.pages.HomePage;

public class HomeTest extends AutoLoginBaseTest {

    @Test
    public void testWelcomeInfo() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals("Welcome Admin", homePage.getWelcomeInfo());
    }
}

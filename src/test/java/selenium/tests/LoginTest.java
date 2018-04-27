package selenium.tests;

import org.junit.Assert;
import org.junit.Test;
import selenium.pages.HomePage;
import selenium.pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        navigateTo("http://opensource.demo.orangehrmlive.com/");
        loginPage.login("Admin", "admin");

        Assert.assertEquals("Dashboard", homePage.getCurrentTabText());
    }
}

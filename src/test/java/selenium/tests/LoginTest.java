package selenium.tests;

import org.junit.Test;
import selenium.pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(driver);
        navigateTo("http://opensource.demo.orangehrmlive.com/");
        loginPage.login("Admin", "admin");
    }
}

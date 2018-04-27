package selenium.tests;

import selenium.pages.LoginPage;

public class AutoLoginBaseTest extends BaseTest {

    @Override
    public void init() {
        super.init();
        LoginPage loginPage = new LoginPage(driver);
        navigateTo("http://opensource.demo.orangehrmlive.com/");
        loginPage.login("Admin", "admin");
    }
}

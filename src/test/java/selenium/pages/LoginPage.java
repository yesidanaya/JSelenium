package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private By usernameLocator;
    private By passwordLocator;
    private By loginButtonLocator;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        usernameLocator = By.id("txtUsername");
        passwordLocator = By.id("txtPassword");
        loginButtonLocator = By.id("btnLogin");
    }

    public void enterUsername(String username) {
        WebElement usernameTextBox = driver.findElement(usernameLocator);
        usernameTextBox.clear();
        usernameTextBox.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordTextBox = driver.findElement(passwordLocator);
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
    }

    public void doLogin() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        doLogin();
    }
}

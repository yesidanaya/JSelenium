package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    protected WebDriver driver;
    private By currentTabLocator;
    private By welcomeInfoLocator;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        currentTabLocator = By.className("current");
        welcomeInfoLocator = By.id("welcome");
    }

    public String getCurrentTabText() {
        WebElement tab = driver.findElement(currentTabLocator);
        return tab.getText();
    }

    public String getWelcomeInfo() {
        WebElement welcomeInfo = driver.findElement(welcomeInfoLocator);
        return welcomeInfo.getText();
    }
}

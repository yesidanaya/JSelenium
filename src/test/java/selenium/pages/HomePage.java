package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    protected WebDriver driver;
    private By currentTabLocator;

    public HomePage(WebDriver driver){
        this.driver = driver;
        currentTabLocator = By.className("current");
    }

    public String getCurrentTabText(){
        WebElement tab = driver.findElement(currentTabLocator);
        return tab.getText();
    }
}

package Atlatl.AtlatlPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by arkbr on 2/20/2017.
 */
public class Pages {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions action;

    public Pages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        action = new Actions(driver);
    }
}

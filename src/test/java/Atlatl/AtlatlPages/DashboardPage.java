package Atlatl.AtlatlPages;

import Atlatl.AtlatlPages.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * Created by arkbr on 2/20/2017.
 */
public class DashboardPage extends Pages {
    public DashboardPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[href='#/quote/']")
    protected WebElement QuotesLink;

    public void switchToQuotes(){
        wait.until(elementToBeClickable(QuotesLink));
        QuotesLink.click();
    }
}

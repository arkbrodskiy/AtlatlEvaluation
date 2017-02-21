package Atlatl.AtlatlPages;

import Atlatl.AtlatlPages.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * Created by arkbr on 2/20/2017.
 */
public class QuotesPage extends Pages {
    public QuotesPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='btn btn-default ng-scope'][contains(., '100')]")
    protected WebElement HundredButton;
    @FindBy(css = "[class='pull-right ng-binding']")
    protected List<WebElement> PriceList;

    public void expandTo100(){
        wait.until(elementToBeClickable(HundredButton));
        HundredButton.click();
    }
    public void getAverageQuote(){
        wait.until(elementToBeClickable(PriceList.get(0)));
        ArrayList<String> quotesList = new ArrayList<String>();
        for (WebElement element: PriceList) {
            quotesList.add(element.getText());
        }
        ArrayList<String> correctList = new ArrayList<String>();
        for (String initialPrice: quotesList){
            String noDollarPrice = initialPrice.replace("$", "");
            String correctPrice = noDollarPrice.replace(",", "");
            correctList.add(correctPrice);
            }
         int count = quotesList.size();
        System.out.println("Quotes amount = " + count);
        Double quotesSum = 0.00;
        for (String correctPrice: correctList) {
            quotesSum += Double.parseDouble(correctPrice);
            }
        System.out.println("Total price = " + quotesSum);
        Double quotesAverage = quotesSum / count;
        System.out.println("Average quote = " + quotesAverage);
        }
    }


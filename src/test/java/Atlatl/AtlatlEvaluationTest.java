package Atlatl;

import Atlatl.AtlatlPages.DashboardPage;
import Atlatl.AtlatlPages.LoginPage;
import Atlatl.AtlatlPages.QuotesPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by arkbr on 2/20/2017.
 */
public class AtlatlEvaluationTest {
    public WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private QuotesPage quotesPage;

    @Before
    public void start(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        quotesPage = new QuotesPage(driver);
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

    @Test
    public void AtlatlAverageQuotes(){
        loginPage.open();
        loginPage.login("atlatlqe+test@gmail.com", "Test321#");
        dashboardPage.switchToQuotes();
        quotesPage.expandTo100();
        quotesPage.getAverageQuote();
    }
}

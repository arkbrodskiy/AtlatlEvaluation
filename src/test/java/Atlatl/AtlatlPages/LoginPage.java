package Atlatl.AtlatlPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * Created by arkbr on 2/20/2017.
 */
public class LoginPage extends Pages {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id_email")
    protected WebElement UserNameField;
    @FindBy(id = "id_password")
    protected WebElement PasswordField;
    @FindBy(css = "[value='Login']")
    protected WebElement SignInButton;

    public LoginPage open(){
        driver.get("https://testclient.staging.salesresourceplanning.com");
        return this;
    }

    public void login(String email, String password){
        wait.until(elementToBeClickable(UserNameField));
        UserNameField.sendKeys(email);
        PasswordField.sendKeys(password);
        SignInButton.click();
    }
}

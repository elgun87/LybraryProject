package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.setDriver(), this);
    }

    @FindBy(id = "inputEmail")
    WebElement input_email;

    @FindBy(id = "inputPassword")
    WebElement input_password;

    @FindBy(xpath = "//*[contains(text(),'Sign in')]")
    WebElement signin_btn;

    @FindBy(css = "a#navbarDropdown span")
    private WebElement user_name_account_link;

    public void type_user_name(String email) {
        input_email.sendKeys(email);
    }

    public void type_password(String password) {
        input_password.sendKeys(password);
    }

    public void click_signin_btn() {
        signin_btn.click();
    }

    public String verify_user_access(){
        WebDriverWait wait = new WebDriverWait(Driver.setDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(user_name_account_link));
        return user_name_account_link.getText();
    }
}

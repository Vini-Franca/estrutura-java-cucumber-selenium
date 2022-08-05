package brComFrame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditarContaPage {

    @FindBy(className = "ico-register")
    private WebElement register;

    @FindBy(id = "gender-male")
    private WebElement gender;

    @FindBy(id = "FirstName")
    private WebElement firstName;

    @FindBy(id = "LastName")
    private WebElement lastName;

    @FindBy(id = "Email")
    private WebElement emailSignup;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    private WebElement confirmPassword;

    @FindBy(xpath = "//input[@id='register-button']")
    private WebElement btnRegister;

    @FindBy(className = "ico-login")
    private WebElement login;

    @FindBy(name = "Email")
    private WebElement email;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    private WebElement loginSubmit;

    @FindBy(className = "account")
    private WebElement account;

    @FindBy(xpath = "//input[@class='button-1 save-customer-info-button']")
    private WebElement saveEmail;

    @FindBy(linkText = "Change password")
    private WebElement changePassword;

    @FindBy(id = "OldPassword")
    private WebElement oldPassword;

    @FindBy(id = "NewPassword")
    private WebElement newPassword;

    @FindBy(id = "ConfirmNewPassword")
    private WebElement confirmNewPassword;

    @FindBy(xpath = "//input[@class='button-1 change-password-button']")
    private WebElement savePassword;

    @FindBy(className = "ico-logout")
    private WebElement logout;


    public EditarContaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getChangePassword() {
        return changePassword;
    }

    public WebElement getLogout() {
        return logout;
    }

    public WebElement getOldPassword() {
        return oldPassword;
    }

    public WebElement getNewPassword() {
        return newPassword;
    }

    public WebElement getConfirmNewPassword() {
        return confirmNewPassword;
    }

    public WebElement getSavePassword() {
        return savePassword;
    }

    public WebElement getRegister() {
        return register;
    }

    public WebElement getSaveEmail() {
        return saveEmail;
    }

    public WebElement getGender() {
        return gender;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmailSignup() {
        return emailSignup;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getBtnRegister() {
        return btnRegister;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getLoginSubmit() {
        return loginSubmit;
    }

    public WebElement getAccount() {
        return account;
    }

}

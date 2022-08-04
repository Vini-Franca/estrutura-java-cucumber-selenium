package brComFrame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

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

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[1]/a/img")
    private WebElement homePage;

    @FindBy(className = "result")
    private WebElement msgConfirm;

    @FindBy(className = "content")
    private WebElement msgCarrinho;

    @FindBy(xpath = "//span[@for='FirstName']")
    private WebElement firstError;

    @FindBy(xpath = "//span[@for='LastName']")
    private WebElement lastError;

    @FindBy(xpath = "//span[@for='Email']")
    private WebElement emailError;

    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    private WebElement passwordError;

    @FindBy(className = "ico-login")
    private WebElement login;

    @FindBy(className = "email")
    private WebElement email;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    private WebElement loginSubmit;

    @FindBy(className = "account")
    private WebElement accountEmail;


    public CadastroPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getRegister() {
        return register;
    }

    public WebElement getFirstError() {
        return firstError;
    }

    public WebElement getPasswordError() {
        return passwordError;
    }


    public WebElement getEmailError() {
        return emailError;
    }

    public WebElement getLastError() {
        return lastError;
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

    public WebElement getHomePage() {
        return homePage;
    }

    public WebElement getMsgConfirm() {
        return msgConfirm;
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

    public WebElement getAccountEmail() {
        return accountEmail;
    }

}

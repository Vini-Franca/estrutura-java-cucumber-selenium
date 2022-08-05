package brComFrame.funcionalidades;

import brComFrame.pages.CadastroPage;
import brComFrame.util.BaseTest;
import org.junit.Assert;

public class CadastroFuncionalidade extends BaseTest {

    private CadastroPage user;

    public CadastroFuncionalidade() {
        this.user = new CadastroPage(webDriver);
    }

    public void HomePage() {
        this.webDriver.get("http://demowebshop.tricentis.com/");
        String URL = webDriver.getCurrentUrl();
        Assert.assertEquals(URL, "http://demowebshop.tricentis.com/");
    }

    public void SignupUser() {
        user.getRegister().click();
        user.getGender().click();
        user.getFirstName().sendKeys("Frank");
        user.getLastName().sendKeys("Castle");
        user.getEmailSignup().sendKeys("justiceiro@teste.com");
        user.getPassword().sendKeys("teste123");
        user.getConfirmPassword().sendKeys("teste123");
    }

    public void loginConfirm(String email) {
        user.getAccountEmail().getText();
    }

    public void Credentials() {
        user.getEmail().sendKeys("justiceiro@teste.com");
        user.getPassword().sendKeys("teste123");
        user.getLoginSubmit().click();
    }

    public void Submit() {
        user.getBtnRegister().click();
    }

    public void Home() {
        String URL = webDriver.getCurrentUrl();
        Assert.assertEquals(URL, "http://demowebshop.tricentis.com/");
    }

    public void LoginNews() {
        this.webDriver.get("http://demowebshop.tricentis.com/");
        user.getLogin().click();
        user.getEmail().sendKeys("justiceiro@teste.com");
        user.getPassword().sendKeys("teste123");
        user.getLoginSubmit().click();
    }


    public void NewsletterEmail() {
        user.getNewsletterEmail().sendKeys("teste12@teste.com");
    }

    public void NewsletterSubmit() {
        user.getNewslleterSubmit().click();
    }

    public void NewsletterConfirm() {
        user.getNewsletterConfirm().getText();
    }


    public void TextoConfirmação(String register) {
        user.getMsgConfirm().getText();
    }

    public void Login() {
        user.getLogin().click();
    }


    public void registerPage() {
        user.getRegister().click();
    }

    public void validateFisrName() {
        user.getGender().click();
        user.getLastName().sendKeys("Anisío");
        user.getEmailSignup().sendKeys("chico.anisio@teste.com");
        user.getPassword().sendKeys("teste123");
        user.getConfirmPassword().sendKeys("teste123");
        user.getBtnRegister().click();
    }

    public void validateLastName() {
        user.getGender().click();
        user.getFirstName().sendKeys("Chico");
        user.getEmailSignup().sendKeys("chico.anisio@teste.com");
        user.getPassword().sendKeys("teste123");
        user.getConfirmPassword().sendKeys("teste123");
        user.getBtnRegister().click();
    }

    public void validateEmail() {
        user.getGender().click();
        user.getFirstName().sendKeys("Chico");
        user.getLastName().sendKeys("Anisío");
        user.getPassword().sendKeys("teste123");
        user.getConfirmPassword().sendKeys("teste123");
        user.getBtnRegister().click();
    }

    public void validateWrongEmail() {
        user.getGender().click();
        user.getFirstName().sendKeys("Chico");
        user.getLastName().sendKeys("Anisío");
        user.getEmailSignup().sendKeys("chico.anisio.com");
        user.getPassword().sendKeys("teste123");
        user.getConfirmPassword().sendKeys("teste123");
        user.getBtnRegister().click();
    }

    public void validatePassword() {
        user.getGender().click();
        user.getFirstName().sendKeys("Chico");
        user.getLastName().sendKeys("Anisío");
        user.getEmailSignup().sendKeys("chico.anisio@teste.com");
        user.getBtnRegister().click();
    }

    public void validateWrongPassword() {
        user.getGender().click();
        user.getFirstName().sendKeys("Chico");
        user.getLastName().sendKeys("Anisío");
        user.getEmailSignup().sendKeys("chico.anisio@teste.com");
        user.getPassword().sendKeys("teste123");
        user.getConfirmPassword().sendKeys("teste12345");
        user.getBtnRegister().click();
    }

    public void firstNameMsg(String firstMsg) {
        user.getFirstError().getText();
    }

    public void lastNameMsg(String lastMsg) {
        user.getLastName().getText();
    }

    public void emailMsg(String emailMsg) {
        user.getEmailError().getText();
    }

    public void passwordMsg(String passwordMsg) {
        user.getConfirmPassword().getText();
    }
}

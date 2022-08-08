package brComFrame.funcionalidades;

import brComFrame.pages.CadastroPage;
import brComFrame.util.BaseTest;
import org.junit.Assert;

public class ValidarLoginFuncionalidade extends BaseTest {

    private CadastroPage user;

    public ValidarLoginFuncionalidade() {
        this.user = new CadastroPage(webDriver);
    }

    public void InvalidEMail() {
        user.getLogin().click();
        user.getEmail().sendKeys("teste.teste");
        user.getPassword().sendKeys("teste123");
        user.getLoginSubmit().click();
    }

    public void WithoutEmail() {
        user.getLogin().click();
        user.getEmail().sendKeys("");
        user.getPassword().sendKeys("teste123");
        user.getLoginSubmit().click();
    }

    public void WrongPassword() {
        user.getLogin().click();
        user.getEmail().sendKeys("teste@teste.com");
        user.getPassword().sendKeys("teste123456");
        user.getLoginSubmit().click();
    }

    public void WithoutPassword() {
        user.getLogin().click();
        user.getEmail().sendKeys("teste@teste.com");
        user.getPassword().sendKeys("");
        user.getLoginSubmit().click();
    }

    public void WithoutCredentials() {
        user.getLogin().click();
        user.getEmail().sendKeys("");
        user.getPassword().sendKeys("");
        user.getLoginSubmit().click();
    }

    public void ErrorMessage(String error) {
        user.getMsgError().getText();
    }

    public void ErrorEmail(String emailError) {
        user.getMsgEmail().getText();
    }

}

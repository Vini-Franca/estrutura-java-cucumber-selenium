package brComFrame.funcionalidades;

import brComFrame.pages.EditarContaPage;
import brComFrame.util.BaseTest;

public class EditarFuncionalidade extends BaseTest {

    private EditarContaPage edit;

    public EditarFuncionalidade() {
        this.edit = new EditarContaPage(webDriver);
    }

    public void SignupUser() {
        this.webDriver.get("http://demowebshop.tricentis.com/");
        edit.getRegister().click();
        edit.getGender().click();
        edit.getFirstName().sendKeys("Osmar");
        edit.getLastName().sendKeys("Namaie");
        edit.getEmailSignup().sendKeys("osmar.namaier@teste.com");
        edit.getPassword().sendKeys("teste123");
        edit.getConfirmPassword().sendKeys("teste123");
        edit.getBtnRegister().click();
    }

    public void Change() {
        edit.getAccount().click();
    }

    public void EditEmail() {
        edit.getAccount().click();
        edit.getEmail().clear();
        edit.getEmail().sendKeys("osmar.namaier01@teste.com");
        edit.getSaveEmail().click();
    }

    public void EditPassword() {
        edit.getChangePassword().click();
        edit.getOldPassword().sendKeys("teste123");
        edit.getNewPassword().sendKeys("teste1234");
        edit.getConfirmNewPassword().sendKeys("teste1234");
        edit.getSavePassword().click();
    }

    public void NewLogin() {
        edit.getLogout().click();
        edit.getLogin().click();
        edit.getEmail().sendKeys("osmar.namaier01@teste.com");
        edit.getPassword().sendKeys("teste1234");
        edit.getLoginSubmit().click();
    }
}
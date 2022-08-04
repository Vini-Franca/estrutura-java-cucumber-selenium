package brComFrame.steps;

import brComFrame.funcionalidades.CadastroFuncionalidade;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ValidateSteps {

    private CadastroFuncionalidade validate;

    public ValidateSteps() {
        this.validate = new CadastroFuncionalidade();
    }

    @E("clico em Register")
    public void clicoEmRegister() {
        this.validate.registerPage();
    }

    @Quando("envio o formulário sem first name")
    public void envioOFormulárioSemFirstName() {
        this.validate.validateFisrName();
    }

    @Entao("devo visualizar a mensagem de erro {string}")
    public void devoVisualizarAMensagemDeErro(String firstMsg) {
        this.validate.firstNameMsg(firstMsg);
    }

    @Quando("envio o formulário sem last name")
    public void envioOFormulárioSemLastName() {
        this.validate.validateLastName();
    }

    @Entao("devo visualizar a mensagem com erro {string}")
    public void devoVisualizarAMensagemComErro(String lastMsg) {
        this.validate.lastNameMsg(lastMsg);
    }

    @Quando("envio o formulário sem email")
    public void envioOFormulárioSemEmail() {
        this.validate.validateEmail();
    }

    @Entao("devo visualizar a mensagem erro {string}")
    public void devoVisualizarAMensagemErro(String emailMsg) {
        this.validate.emailMsg(emailMsg);
    }

    @Quando("envio o formulário com email inválido")
    public void envioOFormulárioComEmailInválido() {
        this.validate.validateWrongEmail();
    }

    @Quando("envio o formulário com sem preencher os campos password")
    public void envioOFormulárioComSemPreencherOsCamposPassword() {
        this.validate.validatePassword();
    }

    @Entao("devo visualizar mensagem de erro {string}")
    public void devoVisualizarMensagemDeErro(String passwordMsg) {
        this.validate.passwordMsg(passwordMsg);
    }

    @Quando("envio o formulário com passwords divergentes")
    public void envioOFormulárioComPasswordsDivergentes() {
        this.validate.validateWrongPassword();

    }
}

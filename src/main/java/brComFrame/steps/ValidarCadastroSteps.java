package brComFrame.steps;

import brComFrame.funcionalidades.CadastroFuncionalidade;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ValidarCadastroSteps {

    private CadastroFuncionalidade validar;

    public ValidarCadastroSteps() {
        this.validar = new CadastroFuncionalidade();
    }

    @E("clico em Register")
    public void clicoEmRegister() {
        this.validar.registerPage();
    }

    @Quando("envio o formulário sem first name")
    public void envioOFormulárioSemFirstName() {
        this.validar.validateFisrName();
    }

    @Entao("devo visualizar a mensagem de erro {string}")
    public void devoVisualizarAMensagemDeErro(String firstMsg) {
        this.validar.firstNameMsg(firstMsg);
    }

    @Quando("envio o formulário sem last name")
    public void envioOFormulárioSemLastName() {
        this.validar.validateLastName();
    }

    @Entao("devo visualizar a mensagem com erro {string}")
    public void devoVisualizarAMensagemComErro(String lastMsg) {
        this.validar.lastNameMsg(lastMsg);
    }

    @Quando("envio o formulário sem email")
    public void envioOFormulárioSemEmail() {
        this.validar.validateEmail();
    }

    @Entao("devo visualizar a mensagem erro {string}")
    public void devoVisualizarAMensagemErro(String emailMsg) {
        this.validar.emailMsg(emailMsg);
    }

    @Quando("envio o formulário com email inválido")
    public void envioOFormulárioComEmailInválido() {
        this.validar.validateWrongEmail();
    }

    @Quando("envio o formulário com sem preencher os campos password")
    public void envioOFormulárioComSemPreencherOsCamposPassword() {
        this.validar.validatePassword();
    }

    @Entao("devo visualizar mensagem de erro {string}")
    public void devoVisualizarMensagemDeErro(String passwordMsg) {
        this.validar.passwordMsg(passwordMsg);
    }

    @Quando("envio o formulário com passwords divergentes")
    public void envioOFormulárioComPasswordsDivergentes() {
        this.validar.validateWrongPassword();

    }

}

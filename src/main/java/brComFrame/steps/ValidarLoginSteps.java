package brComFrame.steps;

import brComFrame.funcionalidades.ValidarLoginFuncionalidade;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ValidarLoginSteps {

    private ValidarLoginFuncionalidade validar;

    public ValidarLoginSteps() {
        this.validar = new ValidarLoginFuncionalidade();
    }

    @Quando("envio as credenciais sem email")
    public void envioAsCredenciaisSemEmail() {
        this.validar.WithoutEmail();
    }

    @Quando("envio as credenciais com email inválido")
    public void envioAsCredenciaisComEmailInválido() {
        this.validar.InvalidEMail();
    }

    @Entao("devo visualizar em vermelho {string}")
    public void devoVisualizarEmVermelho(String error) {
        this.validar.ErrorMessage(error);
    }

    @Quando("envio as credenciais sem senha")
    public void envioAsCredenciaisSemSenha() {
        this.validar.WithoutPassword();
    }

    @Quando("envio as credenciais com senha inválida")
    public void envioAsCredenciaisComSenhaInválida() {
        this.validar.WrongPassword();
    }

    @Entao("devo visualizar em vermelho a mensagem {string}")
    public void devoVisualizarEmVermelhoAMensagem(String emailError) {
        this.validar.ErrorEmail(emailError);
    }

    @Quando("envio as credenciais sem preencher nenhum campo")
    public void envioAsCredenciaisSemPreencherNenhumCampo() {
        this.validar.WithoutCredentials();
    }
}

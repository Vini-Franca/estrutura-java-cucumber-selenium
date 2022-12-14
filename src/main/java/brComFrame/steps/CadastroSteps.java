package brComFrame.steps;

import brComFrame.funcionalidades.CadastroFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CadastroSteps {

    private CadastroFuncionalidade user;


    public CadastroSteps() {
        this.user = new CadastroFuncionalidade();
    }

    @Dado("que estou na página inicial")
    public void queEstouNaPáginaInicial() {
        this.user.HomePage();
    }

    @E("preencho o formulário de cadastro")
    public void preenchoOFormulárioDeCadastro() {
        this.user.SignupUser();
    }

    @Quando("envio o formulário")
    public void envioOFormulário() {
        this.user.Submit();
    }

    @Entao("devo visualizar a mensagem {string}")
    public void devoVisualizarAMensagem(String register) {
        this.user.TextoConfirmação(register);
    }

    @E("clico em login")
    public void clicoEmLogin() {
        this.user.Login();
    }

    @Quando("preencho e envio minhas credenciais")
    public void preenchoEEnvioMinhasCredenciais() {
        this.user.Credentials();
    }

    @Entao("devo visualizar {string} no cabeçalho da página")
    public void devoVisualizarNoCabeçalhoDaPágina(String email) {
        this.user.loginConfirm(email);
    }

    @Dado("que possuo um cadastro válido")
    public void quePossuoUmCadastroVálido() {
        this.user.LoginNews();

    }

    @E("estou na home")
    public void estouNaHome() {
        this.user.Home();
    }

    @Quando("insiro meu email para assinar a newsletter")
    public void insiroMeuEmailParaAssinarANewsletter() {
        this.user.NewsletterEmail();
    }

    @E("clico em Subscribe")
    public void clicoEmSubscribe() {
        this.user.NewsletterSubmit();
    }

    @Entao("devo visualizar um texto com a confirmação")
    public void devoVisualizarUmTextoComAConfirmação() {
        this.user.NewsletterConfirm();
    }

    @E("faço o login com minhas credenciais")
    public void façoOLoginComMinhasCredenciais() {
        clicoEmLogin();
        preenchoEEnvioMinhasCredenciais();
    }

    @Quando("clico em Log out")
    public void clicoEmLogOut() {
        this.user.Logout();
    }

    @Entao("devo ser redirecionado a página inicial")
    public void devoSerRedirecionadoAPáginaInicial() {
        estouNaHome();
    }
}


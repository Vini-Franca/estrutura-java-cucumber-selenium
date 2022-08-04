package brComFrame.steps;

import brComFrame.funcionalidades.EditarFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class EditarContaSteps {

    private EditarFuncionalidade edit;


    public EditarContaSteps() {
        this.edit = new EditarFuncionalidade();
    }

    @Dado("que sou um usuário cadastrado")
    public void queSouUmUsuárioCadastrado() {
        this.edit.SignupUser();
    }

    @E("desejo alterar meu email e senha")
    public void desejoAlterarMeuEmailESenha() {
        this.edit.Change();
    }

    @Quando("cadastro um novo endereço de email")
    public void cadastroUmNovoEndereçoDeEmail() {
        this.edit.EditEmail();
    }

    @E("uma nova senha")
    public void umaNovaSenha() {
        this.edit.EditPassword();
    }

    @Entao("devo realizar login com as novas credenciais")
    public void devoRealizarLoginComAsNovasCredenciais() {
        this.edit.NewLogin();
    }
}


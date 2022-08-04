package brComFrame.steps;

import brComFrame.funcionalidades.CheckoutFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CheckoutSteps {

    private CheckoutFuncionalidade add;


    public CheckoutSteps() {
        this.add = new CheckoutFuncionalidade();
    }

    @Dado("que estou logado")
    public void que_estou_logado() {
        this.add.Login();
    }

    @Dado("adiciono um computador ao carrinho")
    public void adiciono_um_computador_ao_carrinho() {
        this.add.AddProduct();
    }

    @Entao("devo receber a mensagem {string}")
    public void devoReceberAMensagem(String msgCarrinho) {
        this.add.AddCarrinho(msgCarrinho);
    }

    @Quando("clico em add to cart")
    public void clicoEmAddToCart() {
        this.add.AddToCart();
    }

    @E("tenho um produto no carrinho")
    public void tenhoUmProdutoNoCarrinho() {
        this.add.AddProduct();
        this.add.AddToCart();
        this.add.Cart();
    }

    @E("aceito os termos de uso")
    public void aceitoOsTermosDeUso() {
        this.add.Terms();
    }

    @Quando("clico em checkout")
    public void clicoEmCheckout() {
        this.add.Checkout();
    }

    @Entao("recebo a mensagem {string}")
    public void receboAMensagem(String msgCompra) {
        this.add.ConfirmCheckout(msgCompra);
    }

    @E("preencho o formulário")
    public void preenchoOFormulário() throws InterruptedException {
        this.add.FormCash();
    }

    @E("preencho o formulário selecionando a opção crédito")
    public void preenchoOFormulárioSelecionandoAOpçãoCrédito() {
        this.add.FormCredit();
    }

    @E("preencho o formulário selecionando a opção cheque ou ordem de pagamento")
    public void preenchoOFormulárioSelecionandoAOpçãoChequeOuOrdemDePagamento() {
        this.add.FormCheck();
    }

    @E("preencho o formulário selecionando a opção ordem de compra")
    public void preenchoOFormulárioSelecionandoAOpçãoOrdemDeCompra() {
        this.add.FormPO();
    }
}

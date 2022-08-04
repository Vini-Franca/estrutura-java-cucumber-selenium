package brComFrame.steps;

import brComFrame.funcionalidades.CarrinhoFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CarrinhoSteps {

    private CarrinhoFuncionalidade carrinho;

    public CarrinhoSteps() {

        this.carrinho = new CarrinhoFuncionalidade();
    }
    @Dado("que ja estou logado")
    public void que_ja_estou_logado() {
       this.carrinho.Login();
    }

    @Quando("clico add to cart")
    public void clico_add_to_cart() {
        this.carrinho.AddCart();
    }

    @Entao("devo visualizar uma mensagem {string}")
    public void devo_visualizar_uma_mensagem(String msg) {
        this.carrinho.MsgCarrinho(msg);
    }

    @E("escolho um pc para comprar")
    public void EscolhoUmPcParaComprar() {
        this.carrinho.AddPC();
    }

    @E("escolho um livro para comprar")
    public void escolhoUmLivroParaComprar() {
        this.carrinho.AddBook();
    }

    @E("escolho um celular para comprar")
    public void escolhoUmCelularParaComprar() {
        this.carrinho.AddElectronics();
    }

    @E("escolho itens de vestuario para comprar")
    public void escolhoItensDeVestuarioParaComprar() {
        this.carrinho.AddAppareel();

    }

    @E("escolho itens de download digital para comprar")
    public void escolhoItensDeDownloadDigitalParaComprar() {
        this.carrinho.AddDigital();
    }

    @E("escolho joias para comprar")
    public void escolhoJoiasParaComprar() {
        this.carrinho.AddJewelry();
    }

    @E("escolho um gift card para comprar")
    public void escolhoUmGiftCardParaComprar() {
        this.carrinho.AddGiftCard();
    }

    @E("desejo excluir os itens adicionados ao carrinho")
    public void desejoExcluirOsItensAdicionadosAoCarrinho() {
      this.carrinho.Cart();
    }

    @Quando("seleciono os itens")
    public void selecionoOsItens() {
        this.carrinho.SelectCheckbox();
    }

    @E("clico em Update shopping cart")
    public void clicoEmUpdateShoppingCart() {
        this.carrinho.UpdateCart();
    }

    @Entao("deve ser exibido {string}")
    public void deveSerExibido(String msgEmpty) {
        this.carrinho.emptyCart(msgEmpty);
    }
}

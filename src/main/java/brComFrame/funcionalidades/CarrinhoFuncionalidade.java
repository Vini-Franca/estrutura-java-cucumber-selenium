package brComFrame.funcionalidades;

import brComFrame.pages.CarrinhoPage;
import brComFrame.util.BaseTest;

public class CarrinhoFuncionalidade extends BaseTest {

    private CarrinhoPage carrinhoPage;

    public CarrinhoFuncionalidade() {
        this.carrinhoPage = new CarrinhoPage(webDriver);
    }

    public void Login() {
        this.webDriver.get("http://demowebshop.tricentis.com/");
        carrinhoPage.getLogin().click();
        carrinhoPage.getEmail().sendKeys("carlos.maluf@teste.com");
        carrinhoPage.getPassword().sendKeys("teste123");
        carrinhoPage.getLoginSubmit().click();
    }

    public void AddPC() {
        carrinhoPage.getComputer().click();
        carrinhoPage.getDesktop().click();
        carrinhoPage.getAddPC().click();
    }

    public void AddBook() {
        carrinhoPage.getBooks().click();
        carrinhoPage.getFiction().click();
    }

    public void AddElectronics() {
        carrinhoPage.getElectronics().click();
        carrinhoPage.getCellPhones().click();
        carrinhoPage.getSmartphone().click();
    }

    public void AddAppareel() {
        carrinhoPage.getApparelShoes().click();
        carrinhoPage.getShoes().click();
        carrinhoPage.getAddCart().click();
        carrinhoPage.getApparelShoes().click();
        carrinhoPage.getJeans().click();
    }

    public void AddDigital() {
        carrinhoPage.getDigital().click();
        carrinhoPage.getAlbum().click();
        carrinhoPage.getQty().sendKeys("100");
    }

    public void AddJewelry() {
        carrinhoPage.getJewelry().click();
        carrinhoPage.getOwnJewelry().click();
        carrinhoPage.getLengthCm().sendKeys("40");
        carrinhoPage.getAddCart().click();
        carrinhoPage.getJewelry().click();
        carrinhoPage.getDiamond().click();
    }

    public void AddGiftCard() {
        carrinhoPage.getGiftCards().click();
        carrinhoPage.getPhysicalCard().click();
        carrinhoPage.getRecipient().sendKeys("Yamanos");
        carrinhoPage.getMessage().sendKeys("Está é uma mensagem de esperança a todos Yamanos");
    }

    public void AddCart() {
        carrinhoPage.getAddCart().click();
    }

    public void MsgCarrinho(String msg) {
        carrinhoPage.getMsgCarrinho().getText();
    }
}

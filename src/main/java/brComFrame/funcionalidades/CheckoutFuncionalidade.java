package brComFrame.funcionalidades;

import brComFrame.pages.CheckoutPage;
import brComFrame.util.BaseTest;

public class CheckoutFuncionalidade extends BaseTest {

    private CheckoutPage checkoutPage;

    public CheckoutFuncionalidade() {
        this.checkoutPage = new CheckoutPage(webDriver);
    }

    public void Login() {
        this.webDriver.get("http://demowebshop.tricentis.com/");
        checkoutPage.getLogin().click();
        checkoutPage.getEmail().sendKeys("carlos.maluf@teste.com");
        checkoutPage.getPassword().sendKeys("teste123");
        checkoutPage.getLoginSubmit().click();
    }

    public void FormCash() throws InterruptedException {
        checkoutPage.getSelectCountry().click();
        checkoutPage.getCity().sendKeys("São Paulo");
        checkoutPage.getAdress().sendKeys("Rua Barão do Rio Branco");
        checkoutPage.getZipCode().sendKeys("04845161");
        checkoutPage.getPhone().sendKeys("+5511985447858");
        checkoutPage.getContinueButton().click();
        checkoutPage.getStore().click();
        checkoutPage.getNextButton().click();
        checkoutPage.getNextButton1().click();
        checkoutPage.getNextButton2().click();
        checkoutPage.getConfirmButton().click();
    }

    public void FormCredit() {
        checkoutPage.getContinueButton().click();
        checkoutPage.getStore().click();
        checkoutPage.getNextButton().click();
        checkoutPage.getPayment().click();
        checkoutPage.getNextButton1().click();
        checkoutPage.getCreditCard().click();
        checkoutPage.getCardName().sendKeys("Claudia Santos Raia");
        checkoutPage.getCardNumber().sendKeys("5367 8005 5165 4444");
        checkoutPage.getExpireMonth().click();
        checkoutPage.getExpireYear().click();
        checkoutPage.getCardCode().sendKeys("1234");
        checkoutPage.getNextButton2().click();
        checkoutPage.getConfirmButton().click();
    }

    public void FormCheck() {
        checkoutPage.getContinueButton().click();
        checkoutPage.getNextButton().click();
        checkoutPage.getShipping().click();
        checkoutPage.getNextShipping().click();
        checkoutPage.getPaymentCheck().click();
        checkoutPage.getNextButton1().click();
        checkoutPage.getNextButton2().click();
        checkoutPage.getConfirmButton().click();
    }

    public void FormPO() {
        checkoutPage.getContinueButton().click();
        checkoutPage.getNextButton().click();
        checkoutPage.getShipping2().click();
        checkoutPage.getNextShipping().click();
        checkoutPage.getPaymentPo().click();
        checkoutPage.getNextButton1().click();
        checkoutPage.getOrderNumber().sendKeys("02082022-QA");
        checkoutPage.getNextButton2().click();
        checkoutPage.getConfirmButton().click();
    }


    public void ConfirmCheckout(String msgCompra) {
        checkoutPage.getCheckoutMsg().getText();
    }

    public void AddProduct() {
        checkoutPage.getComputer().click();
        checkoutPage.getDesktop().click();
        checkoutPage.getAddProduct().click();
    }

    public void AddToCart() {
        checkoutPage.getAddCart().click();
    }


    public void AddCarrinho(String msgCarrinho) {
        checkoutPage.getMsgCarrinho().getText();
    }

    public void Cart() {
        checkoutPage.getCart().click();
    }

    public void Terms() {
        checkoutPage.getTerms().click();
    }

    public void Checkout() {
        checkoutPage.getCheckout().click();
    }


}

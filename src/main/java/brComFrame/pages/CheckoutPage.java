package brComFrame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutPage {

    @FindBy(className = "ico-register")
    private WebElement register;

    @FindBy(id = "Email")
    private WebElement emailSignup;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement password;

    @FindBy(xpath = "//div[@class='result']")
    private WebElement msgConfirm;

    @FindBy(className = "ico-login")
    private WebElement login;

    @FindBy(className = "email")
    private WebElement email;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    private WebElement loginSubmit;

    @FindBy(linkText = "Computers")
    private WebElement computer;

    @FindBy(linkText = "Desktops")
    private WebElement desktop;

    @FindBy(linkText = "Build your own cheap computer")
    private WebElement addProduct;

    @FindBy(xpath = "//input[@name='product_attribute_72_5_18']")
    private WebElement processor;

    @FindBy(id = "product_attribute_72_6_19_91")
    private WebElement ram;

    @FindBy(id = "product_attribute_72_3_20_58")
    private WebElement hdd;

    @FindBy(id = "product_attribute_72_8_30_95")
    private WebElement software;

    @FindBy(className = "account")
    private WebElement msgCarrinho;

    @FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")
    private WebElement addCart;

    @FindBy(className = "cart-label")
    private WebElement cart;

    @FindBy(id = "termsofservice")
    private WebElement terms;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkout;

    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']/option[33]")
    private WebElement selectCountry;

    @FindBy(name = "BillingNewAddress.City")
    private WebElement city;

    @FindBy(name = "BillingNewAddress.Address1")
    private WebElement adress;

    @FindBy(name = "BillingNewAddress.ZipPostalCode")
    private WebElement zipCode;

    @FindBy(name = "BillingNewAddress.PhoneNumber")
    private WebElement phone;

    @FindBy(xpath = "//input[@class='button-1 new-address-next-step-button']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@id='shipping-buttons-container']//child::input")
    private WebElement nextButton;

    @FindBy(xpath = "//div[@id='payment-method-buttons-container']//child::input")
    private WebElement nextButton1;

    @FindBy(xpath = "//div[@id='payment-info-buttons-container']//child::input")
    private WebElement nextButton2;

    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']//child::input")
    private WebElement nextShipping;

    @FindBy(xpath = "//input[@id='shippingoption_1']")
    private WebElement shipping;

    @FindBy(xpath = "//input[@id='shippingoption_2']")
    private WebElement shipping2;

    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    private WebElement paymentOption;

    @FindBy(xpath = "//div[@id='confirm-order-buttons-container']//child::input")
    private WebElement confirmButton;

    @FindBy(xpath = "//*[contains(text(),'Your order has been successfully processed!')]")
    private WebElement checkoutMsg;

    @FindBy(id = "PickUpInStore")
    private WebElement store;

    @FindBy(id = "paymentmethod_2")
    private WebElement payment;

    @FindBy(id = "paymentmethod_1")
    private WebElement paymentCheck;

    @FindBy(id = "paymentmethod_3")
    private WebElement paymentPo;

    @FindBy(xpath = "//select[@id='CreditCardType']/option[2]")
    private WebElement creditCard;

    @FindBy(id = "CardholderName")
    private WebElement cardName;

    @FindBy(id = "CardNumber")
    private WebElement cardNumber;

    @FindBy(xpath = "//select[@id='ExpireMonth']/option[7]")
    private WebElement expireMonth;

    @FindBy(xpath = "//select[@id='ExpireYear']/option[6]")
    private WebElement expireYear;

    @FindBy(id = "PurchaseOrderNumber")
    private WebElement orderNumber;

    @FindBy(id = "CardCode")
    private WebElement cardCode;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getSelectCountry() {
        return selectCountry;
    }

    public WebElement getOrderNumber() {
        return orderNumber;
    }

    public WebElement getPaymentCheck() {
        return paymentCheck;
    }

    public WebElement getPaymentPo() {
        return paymentPo;
    }

    public WebElement getCardCode() {
        return cardCode;
    }

    public WebElement getCardNumber() {
        return cardNumber;
    }

    public WebElement getExpireMonth() {
        return expireMonth;
    }

    public WebElement getExpireYear() {
        return expireYear;
    }

    public WebElement getCardName() {
        return cardName;
    }

    public WebElement getCreditCard() {
        return creditCard;
    }

    public WebElement getNextButton1() {
        return nextButton1;
    }

    public WebElement getNextButton2() {
        return nextButton2;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    public WebElement getStore() {
        return store;
    }

    public WebElement getPayment() {
        return payment;
    }

    public WebElement getCheckoutMsg() {
        return checkoutMsg;
    }

    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public WebElement getPaymentOption() {
        return paymentOption;
    }

    public WebElement getShipping() {
        return shipping;
    }

    public WebElement getShipping2() {
        return shipping2;
    }

    public WebElement getNextShipping() {
        return nextShipping;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getPhone() {
        return phone;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getAdress() {
        return adress;
    }

    public WebElement getZipCode() {
        return zipCode;
    }

    public WebElement getAddCart() {
        return addCart;
    }

    public WebElement getMsgCarrinho() {
        return msgCarrinho;
    }

    public WebElement getComputer() {
        return computer;
    }

    public WebElement getAddProduct() {
        return addProduct;
    }

    public WebElement getDesktop() {
        return desktop;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getMsgConfirm() {
        return msgConfirm;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getLoginSubmit() {
        return loginSubmit;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getTerms() {
        return terms;
    }

    public WebElement getCheckout() {
        return checkout;
    }
}

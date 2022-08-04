package brComFrame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CarrinhoPage {

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement password;

    @FindBy(className = "ico-login")
    private WebElement login;

    @FindBy(className = "email")
    private WebElement email;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    private WebElement loginSubmit;

    @FindBy(className = "content")
    private WebElement msgCarrinho;


    @FindBy(className = "cart-label")
    private WebElement cart;

    @FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")
    private WebElement addCart;

    @FindBy(linkText = "Computers")
    private WebElement computer;

    @FindBy(linkText = "Desktops")
    private WebElement desktop;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[1]/a/img")
    private WebElement addPC;

    @FindBy(linkText = "Books")
    private WebElement books;

    @FindBy(linkText = "Fiction")
    private WebElement fiction;

    @FindBy(linkText = "Electronics")
    private WebElement electronics;

    @FindBy(linkText = "Cell phones")
    private WebElement cellPhones;

    @FindBy(linkText = "Smartphone")
    private WebElement smartphone;

    @FindBy(linkText = "Apparel & Shoes")
    private WebElement apparelShoes;

    @FindBy(linkText = "Blue and green Sneaker")
    private WebElement shoes;

    @FindBy(linkText = "Blue Jeans")
    private WebElement jeans;

    @FindBy(linkText = "Digital downloads")
    private WebElement digital;

    @FindBy(linkText = "3rd Album")
    private WebElement album;

    @FindBy(className = "qty-input")
    private WebElement qty;

    @FindBy(linkText = "Jewelry")
    private WebElement jewelry;

    @FindBy(linkText = "Create Your Own Jewelry")
    private WebElement ownJewelry;

    @FindBy(className = "textbox")
    private WebElement lengthCm;

    @FindBy(linkText = "Black & White Diamond Heart")
    private WebElement diamond;

    @FindBy(linkText = "Gift Cards")
    private WebElement giftCards;

    @FindBy(linkText = "$100 Physical Gift Card")
    private WebElement physicalCard;

    @FindBy(className = "recipient-name")
    private WebElement recipient;

    @FindBy(className = "message")
    private WebElement message;

    @FindBy(xpath = "//*[contains(text(),'Your Shopping Cart is empty!')]")
    private WebElement empty;

    @FindBy(xpath = "//input[@name='removefromcart']")
    private WebElement removeCart;

    @FindBy(xpath = "//input[@class='button-2 update-cart-button']")
    private WebElement updateCart;



    public CarrinhoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getGiftCards() {
        return giftCards;
    }

    public WebElement getPhysicalCard() {
        return physicalCard;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getEmpty() {
        return empty;
    }

    public WebElement getUpdateCart() {
        return updateCart;
    }

    public WebElement getRemoveCart() {
        return removeCart;
    }

    public WebElement getRecipient() {
        return recipient;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebElement getJewelry() {
        return jewelry;
    }

    public WebElement getOwnJewelry() {
        return ownJewelry;
    }

    public WebElement getLengthCm() {
        return lengthCm;
    }

    public WebElement getDiamond() {
        return diamond;
    }

    public WebElement getAddCart() {
        return addCart;
    }

    public WebElement getDigital() {
        return digital;
    }

    public WebElement getAlbum() {
        return album;
    }

    public WebElement getQty() {
        return qty;
    }

    public WebElement getApparelShoes() {
        return apparelShoes;
    }

    public WebElement getShoes() {
        return shoes;
    }

    public WebElement getJeans() {
        return jeans;
    }

    public WebElement getSmartphone() {
        return smartphone;
    }

    public WebElement getElectronics() {
        return electronics;
    }

    public WebElement getCellPhones() {
        return cellPhones;
    }

    public WebElement getBooks() {
        return books;
    }

    public WebElement getFiction() {
        return fiction;

    }

    public WebElement getMsgCarrinho() {
        return msgCarrinho;
    }

    public WebElement getComputer() {
        return computer;
    }

    public WebElement getAddPC() {
        return addPC;
    }

    public WebElement getDesktop() {
        return desktop;
    }

    public WebElement getPassword() {
        return password;
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


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }




    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public static WebElement signInLoginLinki;


    @FindBy(xpath = "//input[@data-qa='login-email']")
    public static WebElement emailBox;

    @FindBy(xpath = "//input[@type='password']")
    public static WebElement passwordBox;

    @FindBy(xpath = "//*[text()='Login']")
    public static WebElement loginLinki;

    @FindBy(xpath = " //i[@class='fa fa-home']")
    public WebElement loginAsUserName;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement addToCart;

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[1]")
    public WebElement urunResmi;

    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutLinki;

    @FindBy(xpath = "//*[text()='Your delivery address']")
    public WebElement Yourdeliveryaddress;

    @FindBy(xpath = "//*[text()='Your billing address']")
    public WebElement Yourbillingaddress;

    @FindBy(xpath = " //*[text()=' Delete Account']")
    public WebElement deleteAccountLinki;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement accountDeletedYazisi;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueLinki;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public static WebElement  LogintoyouraccountText;

    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public static WebElement YouremailorpasswordisincorrectText;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement ContinueShopping;

    @FindBy(xpath = "//*[@class='searchform']")
    public static WebElement subscriptionText;

    @FindBy(xpath = "//a[@id='scrollUp']")
    public static WebElement arrowUpwart;// turuncu yukarı ok butonu

    @FindBy(xpath = "(//div[@class='item active'])[1]")
    public static WebElement autoEnginerText;//Full-Fledged practice website for Automation Engineers text









}

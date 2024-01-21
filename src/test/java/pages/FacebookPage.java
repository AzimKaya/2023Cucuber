package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@title='Allow all cookies']")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "(//div[@class='_6ltg'])[2]")
    public WebElement yeniHesapOlusturButonu;

    @FindBy(name = "websubmit")
    public WebElement yeniKayitKaydolButonu;

}

package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SaucedemoPage;

public class SaucedemoStepdefinitions {

SaucedemoPage saucedemoPage=new SaucedemoPage();

String ilkUrunİsmi;

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String kullanıcıUsername) {
   saucedemoPage.usernameKutusu.sendKeys(kullanıcıUsername);

    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String kullanıcıPassword) {
    saucedemoPage.passwordKutusu.sendKeys(kullanıcıPassword);

    }
    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        saucedemoPage.loginButonu.click();

    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
    ilkUrunİsmi=saucedemoPage.ilkUrunIsimElementi.getText();
    saucedemoPage.ilkUrunIsimElementi.click();

    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {
    saucedemoPage.ilkUrunAddToCartButonu.click();

    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {
    saucedemoPage.sepetElementi.click();

    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {

     String actualSepettekiUrunİsmi=saucedemoPage.sepettekiUrunIsimElementi.getText();
     Assert.assertEquals(ilkUrunİsmi,actualSepettekiUrunİsmi);


    }

}

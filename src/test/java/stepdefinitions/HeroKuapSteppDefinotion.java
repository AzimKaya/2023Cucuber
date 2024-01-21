package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HerokuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HeroKuapSteppDefinotion {

    HerokuPage herokuPage = new HerokuPage();


    @Given("kullanici herokuapp anasayfasina gider")
    public void kullaniciHerokuappAnasayfasinaGider(String sauceUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(sauceUrl));

    }



    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {
    herokuPage.addElementButonu.click();

    }
    @Then("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());

    }
    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {
    herokuPage.deleteButonu.click();


    }
    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {

     Assert.assertTrue(herokuPage.addRemoveyaziElementi.isDisplayed());

    }


}

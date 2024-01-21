package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class OtomationExercise {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();


    @Given("Navigate to go url automationexercise")
    public void navigateToGoUrlAutomationexercise() {
        Driver.getDriver().get("http://automationexercise.com");

    }

    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        String expectedUrl="http://automationexercise.com";
        String actualUrl=Driver.getDriver().getCurrentUrl();

    }

    @Then("Scroll down page to bottom")
    public void scroll_down_page_to_bottom() {
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",AutomationExercisePage.subscriptionText);

    }

    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {

        String expectedText="SUBSCRIPTION";
        String actualText=AutomationExercisePage.subscriptionText.getText();

    }

    @Then("Click on arrow at bottom right side to move upward")
    public void click_on_arrow_at_bottom_right_side_to_move_upward() {

        AutomationExercisePage.arrowUpwart.click();

    }

    @Then("Verify that page is scrolled up and {string} text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String expectedEnginerrText="Full-Fledged practice website for Automation Engineers";
        String actualEnginerrText=AutomationExercisePage.autoEnginerText.getText();
        System.out.println(AutomationExercisePage.autoEnginerText.getText());



    }



    @Then("Click on Signup \\/ Login button")
    public void clickOnSignupLoginButton() {
        AutomationExercisePage.signInLoginLinki.click();

    }


    @Then("Verify Login to your account  is visible")
    public void verify_login_to_your_account_is_visible() {

        Assert.assertTrue(AutomationExercisePage.LogintoyouraccountText.isDisplayed());

    }
    @Then("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        AutomationExercisePage.emailBox.sendKeys("azimkaya77@gmail.com");
        AutomationExercisePage.passwordBox.sendKeys("505790673");

    }
    @Then("Click login button")
    public void click_login_button() {
        AutomationExercisePage.loginLinki.click();

    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        Assert.assertTrue(AutomationExercisePage.YouremailorpasswordisincorrectText.isDisplayed());

    }


}




package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SetUpPage;
import utilities.ReusableMethods;

public class _02_CreateCountryStep {

    SetUpPage setUpPage = new SetUpPage();

    @When("I click the Setup button")
    public void i_click_the_setup_button() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.setUpButton);
    }

    @When("I click the Parameters button")
    public void i_click_the_parameters_button() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.parametersButton);
    }

    @When("I click the Countries button")
    public void i_click_the_countries_button() {
        setUpPage.clickElement(setUpPage.countriesButton);
    }

    @When("I click the add country icon")
    public void i_click_the_add_country_icon() {
        setUpPage.clickElement(setUpPage.addCountryIcon);
    }

    @When("I enter {string} as the country name")
    public void i_enter_as_the_country_name(String countryName) {
        setUpPage.sendKeys(setUpPage.countryNameTextBox, countryName);

    }

    @When("I enter {string} as the country code")
    public void i_enter_as_the_country_code(String countryCode) {
        setUpPage.sendKeys(setUpPage.countryCodeTextBox, countryCode);

    }

    @When("I click the save button")
    public void i_click_the_save_button() {
        setUpPage.clickElement(setUpPage.saveCountryButton);
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String message) {
        Assert.assertEquals(setUpPage.successCountrySavedMessage.getText(), message);
    }
}

package stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.SetUpPage;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class _02_CreateCountryCampusStep {

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

    @When("I enter {string} as the country name")
    public void i_enter_as_the_country_name(String name) {
        setUpPage.sendKeys(setUpPage.countryNameTextBox, name);
    }

    @When("I enter {string} as the country code")
    public void i_enter_as_the_country_code(String code) {
        setUpPage.sendKeys(setUpPage.countryCodeTextBox, code);
    }

    @When("I click the add country icon")
    public void i_click_the_add_country_icon() {
        setUpPage.clickElement(setUpPage.addCountryIcon);
    }

    @When("I enter citizenship details as follows:")
    public void i_enter_citizenship_details_as_follows(DataTable citizenshipDetails) {
        List<Map<String, String>> rows = citizenshipDetails.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            // Assuming setUpPage.citizenNameTextBox and setUpPage.citizenshortNameTextBox are WebElement
            ReusableMethods.wait(1);
            setUpPage.citizenNameTextBox.clear(); // Clear the 'name' text box
            setUpPage.citizenNameTextBox.sendKeys(columns.get("name")); // Enter 'name'
            ReusableMethods.wait(1);
            setUpPage.citizenshortNameTextBox.clear(); // Clear the 'shortname' text box
            setUpPage.citizenshortNameTextBox.sendKeys(columns.get("shortname")); // Enter 'shortname'
            ReusableMethods.wait(1);
            // Click the save button and wait for the operation to complete before continuing
            setUpPage.clickElement(setUpPage.addingCitizenSaveButton);
            ReusableMethods.wait(1);
            // Add wait here if necessary, to ensure the save operation is complete
        }
    }


    @When("I click the save button")
    public void i_click_the_save_button() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.saveCountryButton);
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String message) {
        ReusableMethods.wait(1);
        Assert.assertEquals(setUpPage.successCountrySavedMessage.getText(), message);


    }


    @Then("I should see the message {string} is created")
    public void iShouldSeeTheMessageIsCreated(String countryName) {
        ReusableMethods.wait(2);
        System.out.println(setUpPage.countryExistMessage(countryName).getText());
        Assert.assertEquals
                (setUpPage.countryExistMessage(countryName).
                        getText(), "The Country with Name \"" + countryName + "\" already exists.");

    }



}

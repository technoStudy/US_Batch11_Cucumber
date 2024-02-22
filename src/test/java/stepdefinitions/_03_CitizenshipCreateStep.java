package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SetUpPage;
import utilities.ReusableMethods;

public class _03_CitizenshipCreateStep {

    SetUpPage setUpPage = new SetUpPage();
    @And("I click the Citizenship button")
    public void iClickTheCitizenshipButton() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.citizenshipButton);
    }

    @And("I click add the citizenship icon")
    public void iClickAddTheCitizenshipIcon() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.citizenshipAddingIcon);
    }

    @And("I enter {string} in the name text box")
    public void iEnterInTheNameTextBox(String name) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.citizenNameTextBox,name);
    }

    @And("I enter {string} in the shortname text box")
    public void iEnterInTheShortnameTextBox(String shortname) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.citizenshortNameTextBox,shortname);
    }

    @And("I click on the save button")
    public void iClickOnTheSaveButton() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.addingCitizenSaveButton);
    }

    @Then("I should see the {string} message")
    public void iShouldSeeTheMessage(String message) {
        ReusableMethods.wait(1);
        Assert.assertEquals(setUpPage.addingCitizenSuccessfullyMessage.getText(),message);
    }

    @And("I enter name {string} in the name text box")
    public void iEnterNameInTheNameTextBox(String name) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.citizenNameTextBox,name);
    }

    @And("I enter shortname {string} in the shortname text box")
    public void iEnterShortnameInTheShortnameTextBox(String shortname) {
        ReusableMethods.wait(1);
        setUpPage.sendKeys(setUpPage.citizenshortNameTextBox,shortname);
    }

    @Then("I should see the warning {string} message")
    public void iShouldSeeTheWarningMessage(String message) {
        ReusableMethods.wait(1);
        Assert.assertEquals(setUpPage.addingCitizenSuccessfullyMessage.getText(),message);
    }


    @And("I enter citizen {string} in the name text box")
    public void iEnterCitizenInTheNameTextBox(String name) {
        ReusableMethods.wait(2);
        setUpPage.sendKeys(setUpPage.citizenNameTextBox,name);
    }

    @And("I enter citizen short name {string} in the shortname text box")
    public void iEnterCitizenShortNameInTheShortnameTextBox(String short_name) {
        ReusableMethods.wait(2);
        setUpPage.sendKeys(setUpPage.citizenshortNameTextBox,short_name);
    }
}

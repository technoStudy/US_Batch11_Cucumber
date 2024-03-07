package stepdefinitions;

import apachePOI.FileUtilsMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SetUpPage;
import utilities.ReusableMethods;

import java.util.ArrayList;

public class _07_ApachePOIStep {
    FileUtilsMethods fileUtilsMethods = new FileUtilsMethods();
    SetUpPage setUpPage = new SetUpPage();
    String path = "src/test/resources/files/citizenship.xlsx";
    @When("I create citizenship with ApachePOI")
    public void i_create_citizenship_with_apache_poi() {
        // we will read all data with for loop from the excel file
        ArrayList<ArrayList<Object>> table = fileUtilsMethods.getDataList(path,"Sheet1",2);
        for (ArrayList<Object> row : table){
            setUpPage.clickElement(setUpPage.citizenshipAddingIcon);
            setUpPage.sendKeys(setUpPage.citizenNameTextBox,row.get(0).toString());
            ReusableMethods.wait(1);
            setUpPage.sendKeys(setUpPage.citizenshortNameTextBox,row.get(1).toString());
            ReusableMethods.wait(1);
            setUpPage.clickElement(setUpPage.addingCitizenSaveButton);

        }

    }
    @Then("I delete citizenship with ApachePOI")
    public void i_delete_citizenship_with_apache_poi() {
        // if your test data should be use once no need to keep in the excel file
        // we can delete them
        ArrayList<ArrayList<Object>> table = fileUtilsMethods.getDataList(path,"Sheet1",2);
        for (ArrayList<Object> row: table){
         // I will add delete method later
        }
    }

}

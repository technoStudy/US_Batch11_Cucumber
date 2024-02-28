package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.SetUpPage;
import utilities.ReusableMethods;

import java.util.List;

public class _06_CreateFeesStep {
    SetUpPage setUpPage = new SetUpPage();

    @Then("I click on the adding fees buttons")
    public void i_click_on_the_adding_fees_buttons(DataTable feesButtons) {
        List<String> feesButtonList = feesButtons.asList(String.class);
        for (int i = 0; i < feesButtonList.size(); i++) {
            WebElement element = setUpPage.getWebElements(feesButtonList.get(i));
            ReusableMethods.wait(1);
            setUpPage.clickElement(element);
        }
    }

    @Then("I send the keys in text boxes")
    public void i_send_the_keys_in_text_boxes(DataTable textBoxAndKeys) {
        List<List<String>> dataList = textBoxAndKeys.asLists(String.class);
        for (int i = 0; i < dataList.size(); i++) {
            WebElement element = setUpPage.getWebElements(dataList.get(i).get(0));
            ReusableMethods.wait(1);
            String textData = dataList.get(i).get(1);
            ReusableMethods.wait(1);
            setUpPage.sendKeys(element, textData);
        }

    }

    @Then("I click on the save&close and toggleBar button")
    public void i_click_on_the_save_close_and_toggle_bar_button() {
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.toggleBarAddingFees);
        ReusableMethods.wait(1);
        setUpPage.clickElement(setUpPage.saveAndCloseAddingFeesButton);
    }

    @Then("I should see the save fees {string} message")
    public void iShouldSeeTheSaveFeesMessage(String message) {
        ReusableMethods.wait(1);
        Assert.assertEquals(setUpPage.saveAndClosemessageSuccessfully.getText(),message);
    }
}

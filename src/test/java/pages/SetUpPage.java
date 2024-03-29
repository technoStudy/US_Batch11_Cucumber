package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ThreadSafeDriver;

public class SetUpPage extends ParentPage {

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setUpButton;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countriesButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[10]")
    public WebElement addCountryIcon;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement countryNameTextBox;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement countryCodeTextBox;

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon ng-star-inserted'])[1]")
    public WebElement saveCountryButton;

    @FindBy(xpath = "//div[text()='Country successfully created']")
    public WebElement successCountrySavedMessage;

    // If there is a dynamic xpath we should create a dynamic method for it
    public WebElement countryExistMessage(String countryName) {
        return ThreadSafeDriver.
                getDriver().
                findElement
                        (By.xpath(
                                "(//div[normalize-space()='The Country with Name \"" + countryName + "\" already exists.'])[1]"));
    }

    @FindBy(xpath = "(//*[name()='svg'][@class='svg-inline--fa fa-user-tag fa-fw'])[1]")
    public WebElement citizenshipButton;

    @FindBy(xpath = "//button[@matbadgeoverlap='false']")
    public WebElement citizenshipAddingIcon;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement citizenNameTextBox;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement citizenshortNameTextBox;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement addingCitizenSaveButton;

    @FindBy(xpath = "//div[text()='Citizenship successfully created']")
    public WebElement addingCitizenSuccessfullyMessage;


    public WebElement citizenExistMessage(String citizenName) {
        return ThreadSafeDriver.
                getDriver().
                findElement
                        (By.xpath(
                                "//div[text()='The Citizenship with Name \"" + citizenName + "\" already exists.']"));
    }


    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    public WebElement citizenNameSearchTextBox;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement citizenNameSearchButton;

    @FindBy(xpath = "//button[@color='warn']")
    public WebElement citizenNameDeleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
    public WebElement citizenNameConfirmDeleteButton;

    @FindBy(xpath = "//div[text()='Citizenship successfully deleted']")
    public WebElement citizenSuccessfullyDeletedMessage;

    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement feesButton;
    @FindBy(xpath = "//button[@matbadgeoverlap='false']")
    public WebElement addingFeesIcon;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameTextBoxFeesAdding;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeTextBoxFeesAdding;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement intergationCodeAddingFees;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityCodeAddingFees;
    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBarAddingFees;

    @FindBy(xpath = "//span[text()='Save & Close']")
    public WebElement saveAndCloseAddingFeesButton;

    @FindBy(xpath = "//div[text()='Fee Type successfully updated']")
    public WebElement saveAndClosemessageSuccessfully;

    // we create a method to put some webelements to read in the DataTable
    public WebElement getWebElements(String nameOfWebelement) {
        switch (nameOfWebelement) {
            case "setup":
                return this.setUpButton;
            case "parameter":
                return this.parametersButton;
            case "countries":
                return this.countriesButton;
            case "addingCountryIcon":
                return this.addCountryIcon;
            case "countryNametextBox":
                return this.countryNameTextBox;
            case "countryCodeTextBox":
                return this.countryCodeTextBox;
            case "fees":
                return this.feesButton;
            case "addFeesIcon":
                return this.addingFeesIcon;
            case "nameTextBoxFeesAdding":
                return this.nameTextBoxFeesAdding;
            case "codeTextBoxFeesAdding":
                return this.codeTextBoxFeesAdding;
            case "intergationCodeAddingFees":
                return this.intergationCodeAddingFees;
            case "priorityCodeAddingFees" : return this.priorityCodeAddingFees;
            case "toggleBarAddingFees" : return this.toggleBarAddingFees;
        }
        return null;
    }

}

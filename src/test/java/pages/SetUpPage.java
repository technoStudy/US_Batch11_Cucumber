package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ThreadSafeDriver;

public class SetUpPage extends ParentPage {

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setUpButton;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parametersButton ;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countriesButton ;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[10]")
    public WebElement addCountryIcon;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement countryNameTextBox;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement countryCodeTextBox ;

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
                              "(//div[normalize-space()='The Country with Name \""+countryName+"\" already exists.'])[1]"));
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

}

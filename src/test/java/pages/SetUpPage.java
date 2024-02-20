package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetUpPage extends ParentPage {

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setUpButton;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parametersButton ;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countriesButton ;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[10]")
    public WebElement addCountryIcon;
    @FindBy(xpath = "(//input[@id='ms-text-field-8'])[1]")
    public WebElement countryNameTextBox;

    @FindBy(xpath = "(//input[@id='ms-text-field-9'])[1]")
    public WebElement countryCodeTextBox ;

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon ng-star-inserted'])[1]")
    public WebElement saveCountryButton;

    @FindBy(xpath = "//div[text()='Country successfully created']")
    public WebElement successCountrySavedMessage;

}

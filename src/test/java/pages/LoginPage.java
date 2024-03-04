package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends ParentPage {



    // We will not create constructor here because this is a child class
    // and child can use everything from the parents

    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "(//img[@class='logo-icon'])[1]")
    public WebElement technoStudyImage;

    @FindBy(xpath = "//div[text()='Invalid username or password']")
    public WebElement warningMessage;



}

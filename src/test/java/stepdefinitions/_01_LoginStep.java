package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import utilities.ThreadSafeDriver;


public class _01_LoginStep {

    LoginPage loginPage = new LoginPage();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        // Navigate to Campus
        ThreadSafeDriver.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter username and password in the text boxes")
    public void enter_username_and_password_in_the_text_boxes() {
        loginPage.usernameTextBox.sendKeys("turkeyts");
        loginPage.passwordTextBox.sendKeys("TechnoStudy123");
    }

    @When("click login button")
    public void click_login_button() {
        loginPage.loginButton.click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        Assert.assertTrue(loginPage.technoStudyImage.isDisplayed());
    }


}

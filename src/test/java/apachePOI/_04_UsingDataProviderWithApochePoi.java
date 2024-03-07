package apachePOI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ReusableMethods;
import utilities.ThreadSafeDriver;

public class _04_UsingDataProviderWithApochePoi {


    @Test(dataProvider = "loginData",dataProviderClass = TestDataUsingApochePOI.class )
    public void testInvalidLogin(String username, String password){
        ThreadSafeDriver.getDriver().get("https://test.mersys.io/");
        LoginPage loginPage = new LoginPage();
        ReusableMethods.wait(1);
        loginPage.usernameTextBox.clear();
        loginPage.sendKeys(loginPage.usernameTextBox,username);
        ReusableMethods.wait(1);
        loginPage.sendKeys(loginPage.passwordTextBox,password);
        ReusableMethods.wait(1);
        loginPage.clickElement(loginPage.loginButton);
        ReusableMethods.wait(1);
        String expectedMessage = "Invalid username or password";
        String actualMessage = loginPage.warningMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);
        System.out.println("Test");

    }

    @Test(dataProvider = "loginData",dataProviderClass = TestDataUsingApochePOI.class )
    public void test(String username, String password){
        ThreadSafeDriver.getDriver().get("https://test.mersys.io/");
        LoginPage loginPage = new LoginPage();
        ReusableMethods.wait(1);
        loginPage.usernameTextBox.clear();
        loginPage.sendKeys(loginPage.usernameTextBox,username);
        ReusableMethods.wait(1);
        loginPage.sendKeys(loginPage.passwordTextBox,password);
        ReusableMethods.wait(1);
        loginPage.clickElement(loginPage.loginButton);
        ReusableMethods.wait(1);
        String expectedMessage = "Invalid username or password";
        String actualMessage = loginPage.warningMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);
        System.out.println("Test");

    }
}

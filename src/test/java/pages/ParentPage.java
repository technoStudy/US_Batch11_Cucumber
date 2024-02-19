package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ThreadSafeDriver;

import java.time.Duration;


public class ParentPage {
    protected static final Logger log = LogManager.getLogger();
    public WebDriverWait wait=new WebDriverWait(ThreadSafeDriver.getDriver(), Duration.ofSeconds(10));
    public ParentPage() {
        PageFactory.initElements(ThreadSafeDriver.getDriver(), this);
    }

    // We will create constructor and initializing WebDriver method in this class
    // And we will create some usefully locators method in this class
    // Then We will extend all Page class to Parent Class

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)ThreadSafeDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(ThreadSafeDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void clickJSExecutor(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js=(JavascriptExecutor)ThreadSafeDriver.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public boolean isWebElementDisplayed(WebElement webElement) {
        log.trace("isWebElementDisplayed(" + webElement + ")");
            return webElement.isDisplayed();
        }

        public void sendKeys(WebElement element, String key){
        element.sendKeys(key);
        }
    }




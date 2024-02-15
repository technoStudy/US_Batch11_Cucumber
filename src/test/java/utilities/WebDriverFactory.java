package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class WebDriverFactory {

    static WebDriver driver;

    public static WebDriver getDriver() {
        // we should define the type of browser
        String browserName = ConfigReader.getProperty("browser").toLowerCase();
        if (driver == null) {
            switch (browserName) {
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari" :
                    driver = new SafariDriver();
                    break;
                case "internetexplorer" :
                    driver = new InternetExplorerDriver();
                    break;
                case "chrome" :
                    driver = new ChromeDriver();
                    break;
                default:
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver ;
    }


    public static void closeDriver(){
        if (driver!=null){
            driver.close();
        }
    }

    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
        }
    }

}

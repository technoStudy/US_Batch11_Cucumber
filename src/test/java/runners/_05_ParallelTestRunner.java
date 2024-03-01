package runners;


import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.ThreadSafeDriver;

@CucumberOptions(
        features = {"src/test/java/features"},// path of features packages
        glue = {"stepdefinitions","anotherPackageIfNecassary"},
        tags = "@Login",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:DIR|FILE|URL"}
)

public class _05_ParallelTestRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browserType")
    public void setUpClass(@Optional("defaultBrowser") String browserName){
        ThreadSafeDriver.threadBrowserName.set(browserName);
    }

    @AfterClass
    public void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone",System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Tester Name","Mehmet Ali Sezgin");
    }
}

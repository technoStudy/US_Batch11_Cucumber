package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// we will run all smoke test in this class
@CucumberOptions(
        features = {"src/test/java/features"},// path of features packages
        glue = {"stepdefinitions","anotherPackageIfNecassary"},
        tags = "@SmokeTest"
)


public class _02_SmokeTestRunner extends AbstractTestNGCucumberTests {

}


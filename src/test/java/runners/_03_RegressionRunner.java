package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},// path of features packages
        glue = {"stepdefinitions"},
        tags = "@Regression"
)


public class _03_RegressionRunner extends AbstractTestNGCucumberTests {
}

package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/features"},// path of features packages
        glue = {"stepdefinitions"},
        plugin= {"json:target/cucumber/cucumber.json"}
)


public class _03_RegressionRunner extends AbstractTestNGCucumberTests {
}

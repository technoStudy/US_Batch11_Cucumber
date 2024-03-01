package runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},// path of features packages
        glue = {"stepdefinitions","anotherPackageIfNecassary"},
        tags = "@Login"
)
public class _04_LoginTestRunner {
}

package runners;
// Test Runner classes are used to run specific Scenarios
// we can create many Run classes
// for example one of them can be run all smoke tests or one of them can be run all regression test

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// We should define this class as a cucumber class
@CucumberOptions(
        features = {"src/test/java/features/_01_Login.feature",
                    "src/test/java/features/_02_CreateCountry.feature"},
        glue = {"stepdefinitions","anotherPackageIfNecassary"}
)

public class _01_TestRunner extends AbstractTestNGCucumberTests {

}

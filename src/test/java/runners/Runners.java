package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions", "hooks"},
        tags = "@Interview",
        dryRun = false
)
public class Runners extends AbstractTestNGCucumberTests {

}

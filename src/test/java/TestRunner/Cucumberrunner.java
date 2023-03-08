package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

public class Cucumberrunner {

    @CucumberOptions(features = {"src/test/resources/Features"},
            glue = {"AppTestDefs"},
            tags ="@test or @smoke or @feature1 or @feature2",
            monochrome = true,
            dryRun = false,
            plugin = {
                    "pretty",
                    "html:build/reports/feature.html"
            })
    @Test
    public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
    }
}

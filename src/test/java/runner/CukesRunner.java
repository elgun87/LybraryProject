package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\elgun\\IdeaProjects\\library\\src\\test\\resources\\features",
        glue = "step_definitions",
        dryRun = false,
        plugin = "html:target/cucumber-report.html",
        tags = ""
)
public class CukesRunner {
}

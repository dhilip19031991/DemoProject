package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= "C:/Users/djaishankar/demo/src/test/java/featurefiles",
glue ={"steps"}, dryRun = false, plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"})
public class Runner {

}

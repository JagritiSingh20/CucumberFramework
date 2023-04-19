package Cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue="stepDefinitions", tags = "@Regression" ,  plugin = {"pretty", "html:target/cucumber.html"}, monochrome = true)
public class TestRunnerTest {

}

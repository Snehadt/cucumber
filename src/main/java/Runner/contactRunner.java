package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "D:\\demoMavenWorkspace\\FreeCRMProject\\src\\main\\java\\Features\\contact.feature", //the path of the feature files
		glue={"StepDefinition"}, //the path of the step definition files
		plugin={"pretty", "junit:xmlReport/cucumber-reports/Cucumber.xml"},
		dryRun=false,
		monochrome=true
		)


public class contactRunner {

}

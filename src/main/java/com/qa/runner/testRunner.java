package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "D:\\demoMavenWorkspace\\FreeCRMProject_Cucumber\\src\\main\\java\\com\\qa\\features\\FreeCRM.feature" , //the path of the feature files
		glue={"com/qa/FeeCRMStepDefinition"}, //the path of the step definition files
		plugin={"pretty", "junit:xmlReport/cucumber-reports/Cucumber.xml"},
		dryRun=false,  //to check whether the mapping is proper bewtwwn step deifinition and feature file
		strict=true, //it will check if any step definition is not defined in step definition file
		monochrome=true //displayes the console output in readable format
		)
public class testRunner {

}

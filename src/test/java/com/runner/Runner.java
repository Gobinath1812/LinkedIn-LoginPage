package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\gobin\\eclipse-workspace2\\LinkedIn\\src\\test\\resources\\feature" }, glue = "com.stepDefinition", dryRun = false, monochrome = true)

public class Runner {

}

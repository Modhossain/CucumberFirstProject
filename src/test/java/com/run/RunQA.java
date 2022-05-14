package com.run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/com/features",
		glue="com.step",
		tags= {"@regression"},
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-reports"}
		)

public class RunQA extends AbstractTestNGCucumberTests {

}

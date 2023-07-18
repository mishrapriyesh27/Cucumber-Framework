package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/feature_1.feature",
		glue = "stepdefinition",
		dryRun = false,
		monochrome = true,
		//tags = "@Sanity",
		//plugin = {"pretty", "html:target/Test_reports/reports_html.html"}
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class Runner extends AbstractTestNGCucumberTests {
	// 

}

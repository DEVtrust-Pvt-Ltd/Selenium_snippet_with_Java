package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",glue= {"StepDefinitions"}, monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/reports.xml",
		"json:target/JSONReports/report.json",
"html:target/HtmlReports"})

public class TestRunner_LoginandLogout {

}

package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(
		features="src/test/java/Features/login.feature",
		dryRun=false,
		glue="Steps",
		tags="@smoke",
		snippets=SnippetType.CAMELCASE,
		plugin= {
				"pretty",
				"html:target/cucumber-reports/myreport.html"
		}
		)
public class runner extends AbstractTestNGCucumberTests {

}

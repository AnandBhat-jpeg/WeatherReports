package TestRunnerPackage;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue="StepDef",
		tags="@weatherUI",
				format = {"pretty", "html:target/Destination"}
		
		
		)
public class TestRunnerUI {

}

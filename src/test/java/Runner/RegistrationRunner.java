package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\ApplicationTest\\Registration.feature"} ,
		
		glue = {"Steps"} ,
		
		plugin = {"pretty"}
		
)

public class RegistrationRunner extends AbstractTestNGCucumberTests
{

}

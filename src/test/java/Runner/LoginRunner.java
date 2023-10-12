package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features = {"src\\test\\resources\\ApplicationTest\\login.feature"},//Path of the feature file
		
		glue = {"Steps"}, //Name of the package which have method of the steps
		
		publish = true,
		
		plugin = {"pretty"}
		
	)

public class LoginRunner extends AbstractTestNGCucumberTests 
{

}

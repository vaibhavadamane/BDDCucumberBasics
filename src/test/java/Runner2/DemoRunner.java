package Runner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features = {"src\\test\\resources\\Appliction2Test\\Demo.feature"},
		
		glue = {"Steps2","Hooks2"},
		
		plugin = {"pretty"},
		
		dryRun = true
		
//		tags = "@functional"
		
)

public class DemoRunner extends AbstractTestNGCucumberTests
{

}

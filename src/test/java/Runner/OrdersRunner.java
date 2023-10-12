package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\ApplicationTest\\orders.feature"} ,
		
		glue = {"Steps"} ,
		
		plugin = {"pretty"}
)

public class OrdersRunner extends AbstractTestNGCucumberTests
{

}

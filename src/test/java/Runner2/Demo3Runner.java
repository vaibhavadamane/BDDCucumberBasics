package Runner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = {"src\\test\\resources\\Appliction2Test\\Demo3.feature"},
	
	glue = {"Steps2"},
		
	plugin = {"pretty"}
	
)

public class Demo3Runner extends AbstractTestNGCucumberTests
{

}

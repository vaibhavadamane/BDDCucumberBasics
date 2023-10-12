package Runner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\Appliction2Test\\Demo2.feature"},
		
		glue = {"Steps2","Hooks2"},
		
		plugin = {"pretty"}
		
		
)

public class Demo2Runner extends AbstractTestNGCucumberTests{

}

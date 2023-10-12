package Runner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"C:\\Users\\hp\\ATT Batch\\BDDCucumberBasics\\src\\test\\resources\\Appliction2Test\\Demo4.feature"},
		
		glue = {"Steps2"},
		
//		publish = true
		
		plugin = {"pretty"},
		
		tags = "@sainity"
		
		
)

public class Demo4Runner extends AbstractTestNGCucumberTests {

}

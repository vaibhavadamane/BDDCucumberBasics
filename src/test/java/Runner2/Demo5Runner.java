package Runner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"C:\\Users\\hp\\ATT Batch\\BDDCucumberBasics\\src\\test\\resources\\Appliction2Test\\Demo5.feature"},
		
		glue = {"Steps2","Hooks2"},
		
		tags = "@functional",
		
		plugin = {"pretty"}
		
		
)

public class Demo5Runner extends AbstractTestNGCucumberTests{

}

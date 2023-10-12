package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

     (
    		 
    		 
    	features = {"src\\test\\resources\\ApplicationTest\\LoginWithData.feature"},
    	
    	glue = {"Steps"} ,
    	
    	plugin = {"pretty"}
    		 
    		 
    		 
    )


public class LoginWithDataRunner extends AbstractTestNGCucumberTests
{

}

package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\ApplicationTest\\ProfilePicture.feature"} ,
		
		glue = {"Steps" , "Hooks"} ,
		
		plugin = {"pretty"}
)

public class ProfilePictureRunner extends AbstractTestNGCucumberTests{

}

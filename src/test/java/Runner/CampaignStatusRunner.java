package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features = {"src\\test\\resources\\ApplicationTest\\CampaignStatus.feature"} ,
		
		glue = {"Steps" /*, "Hooks"*/} ,
		
		plugin = {"pretty"} ,
		
//		tags = ("(@sanity or @functional) and (not @regression)") 
		
		dryRun = true
		
)
public class CampaignStatusRunner extends AbstractTestNGCucumberTests 
{

}

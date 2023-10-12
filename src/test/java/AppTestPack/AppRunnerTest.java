package AppTestPack;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
//		features = {"C:\\Users\\hp\\ATT Batch\\BDDCucumberBasics\\src\\test\\resources\\AppTest\\HomePage.feature"} ,
		
		features = {"@target/failed.txt"} ,
		
		glue = {"AppTestPack"} ,
		
		tags = "@functional or @sainity",
		
	    plugin = {"pretty" , "rerun:target/failed.txt"}
		
)

public class AppRunnerTest extends AbstractTestNGCucumberTests
{

}

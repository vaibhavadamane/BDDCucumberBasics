package AppTestPack;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks 
{

	WebDriver driver;
	
	@Before
	public void launchBrower() throws Exception
	{
//		Here we use the parameterization  concept as well as insert browser name
		DriverFactory d = new DriverFactory();
		
		Properties p = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\ATT Batch\\BDDCucumberBasics\\src\\test\\resources\\config.properties");
		
//		Another Way:-
//		String path = System.getProperty("user.dir") + "C:\\Users\\hp\\ATT Batch\\BDDCucumberBasics\\src\\test\\resources\\config.properties";
		
//		FileInputStream file = new FileInputStream(path);
		
		p.load(file);
		
		String browserName = p.getProperty("browser"); //Taking the browser value form propertied file
		
		String cmdBrowser = System.getProperty("browser"); //Taking the browser value for cmd command
		
		if(cmdBrowser != null)
		{
			browserName = cmdBrowser;
		}
		
		driver = d.initBroswer(browserName);
		
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	
}

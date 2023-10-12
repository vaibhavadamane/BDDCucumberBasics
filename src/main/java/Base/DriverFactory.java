package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory 
{

	static WebDriver driver;
	
//	This method get a browser name and return the driver
	
	public WebDriver initBroswer(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
//			ChromeOptions o = new ChromeOptions();
//			o.addArguments("--remote-allow-origins=*");
			
			driver =new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		return driver;
	}
	
//	This method return only driver
	
	public static WebDriver getDriver() 
	{
		return driver;
	}
	
}

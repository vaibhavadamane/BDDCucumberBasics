package Hooks2;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class DemoHooks
{
	@Before  
    public void beforeHook()
    {
		System.out.println("Before Hook");
    }
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before Step");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After Step");
	}
	
	@After
	public void afterHook()
	{
		System.out.println("After Hook");
	}
}

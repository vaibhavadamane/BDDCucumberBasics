package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks
{

@Before("@sanity")
public void beforeHooks()
{
System.out.println("Before hook is executing");	
}

@After("@sanity or @functional")
public void afterHooks()
{
System.out.println("After hook is executing");
}

}
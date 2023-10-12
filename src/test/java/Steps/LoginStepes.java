package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepes
{
	@Given("user it at the login scerren")
	public void preConditions()
	{
		System.out.println("PreConditon of the Given Statement");
	}
	
	@When("user enters the username")
	public void enteringUsername()
	{
		System.out.println("Entering the username");
	}
	
	@When("user enters the password")
	public void entersPassword()
	{
		System.out.println("Entering Password");
	}
	
	@When("user click on login button")
	public void clickonLogin() 
	{
		System.out.println("Click on login Butoon");
	}
	
	@Then("User Should get logged in")
	public void valideLogin()
	{
		System.out.println("User has been login in");
	}
	

    @Given("user is at the landing page")
    public void user_is_at_the_landing_page() 
    {
         System.out.println("Given statement for title verifiacation");
    }
    
   @Then("Title of the page should be pagetitle")
   public void title_of_the_page_should_be_pagetitle() 
   {
         System.out.println("The statement for the title verification");
   }
}

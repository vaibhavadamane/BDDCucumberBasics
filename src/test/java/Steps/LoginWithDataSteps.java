package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps 
{
	@Given("User is at the login screen")
	public void user_is_at_the_login_screen() {
	   System.out.println("Given statement for login sceen");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
	    System.out.println("Entering username as " + string);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
	   System.out.println("Entering the password " + string);
	}

	@When("User click on sumbit button")
	public void user_click_on_sumbit_button() {
	  System.out.println("Click on submit button");
	}

	@Then("User should redirect to Home Page")
	public void user_should_redirect_to_home_page() {
	    System.out.println("Redirection to home page");
	}
}

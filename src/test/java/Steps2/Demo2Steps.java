package Steps2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo2Steps
{
	@Given("User on login page")
	public void user_on_login_page() {
	   System.out.println("User on login page");
	}

	@When("User enter the {string}")
	public void user_enter_the(String uname) {
	  System.out.println("User enetr " +uname);
	}

	@When("User enter the Password {string}")
	public void user_enter_the_password(String pwd) {
	    System.out.println("User enter " +pwd);
	}

	@When("User enter the Gender {string}")
	public void user_enter_the_gender(String gender) {
	   System.out.println("User enter " +gender);
	}

	@When("User press Login Button")
	public void user_press_login_button() {
	   System.out.println("User preess login button");
	}

	@Then("User Login Sucessfully")
	public void user_login_sucessfully() {
	   System.out.println("User login sucessfully");
	}

	
	
}

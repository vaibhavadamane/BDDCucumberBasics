package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundwithScenarioOutlineSteps
{
	@Given("User should be at profile page")
	public void user_should_be_at_profile_page() {
	   System.out.println("Given Statement");
	}

	@When("User enters firstname as {string}")
	public void user_enters_firstname_as(String fname) {
	    System.out.println("When Statement for firstname " + fname);
	}

	@When("User enters lastname as {string}")
	public void user_enters_lastname_as(String lname) {
		System.out.println("When Statement for lastname " + lname);
	}

	@When("User enters city name as {string}")
	public void user_enters_city_name_as(String city) {
		System.out.println("When Statement for city " + city);
	}

	@Then("Profile should get created")
	public void profile_should_get_created() {
	    System.out.println("Then Statement");
	}
}

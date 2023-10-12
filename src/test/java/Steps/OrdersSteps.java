package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps 
{
	@Given("User Should be logged into the application")
	public void user_should_be_logged_into_the_application() {
	   System.out.println("Given Statement for login");
	}

	@When("User Should be at the orders page")
	public void user_should_be_at_the_orders_page() {
	    System.out.println("When Statement for order page");
	}

	@When("User click on past order button")
	public void user_click_on_past_order_button() {
	   System.out.println("When Statement for past order button");
	}

	@Then("User should be able to see the past order information")
	public void user_should_be_able_to_see_the_past_order_information() {
	    System.out.println("Then statement for past order button");
	}

	@When("User click on cureent order button")
	public void user_click_on_cureent_order_button() {
		 System.out.println("When Statement for cureent order button");
	}

	@Then("User should be able to see the current order information")
	public void user_should_be_able_to_see_the_current_order_information() {
		 System.out.println("When Statement for current order button");
	}

	@When("User click on cancelled order button")
	public void user_click_on_cancelled_order_button() {
		 System.out.println("When Statement for cancelled order button");
	}

	@Then("User should be able to see the cancelled order information")
	public void user_should_be_able_to_see_the_cancelled_order_information() {
		 System.out.println("When Statement for cancelled order button");
	}
}

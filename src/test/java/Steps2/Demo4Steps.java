package Steps2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo4Steps 
{

	@Given("User should be suceefully login")
	public void user_should_be_suceefully_login() {
	    System.out.println("User Should be sucesfully login to app");
	}

	@Given("User Should be Cart Page")
	public void user_should_be_cart_page() {
	   System.out.println("User On Cart Page");
	}

	@When("User Enter Select the Tshirt")
	public void user_enter_select_the_tshirt() {
	    System.out.println("User Select the tshirt");
	}

	@When("User Click on Buy Button")
	public void user_click_on_buy_button() {
	    System.out.println("Click on Buy Button");
	}

	@Then("User Should be moved on Payment Pagg")
	public void user_should_be_moved_on_payment_pagg() {
	   System.out.println("Move to payment page");
	}
	
	@When("User Select the {string}")
	public void user_select_the(String moblie) {
	  System.out.println("user select the " + moblie);
	}

	@When("User Select {string} Colour")
	public void user_select_colour(String colour) {
	    System.out.println("User Select the " + colour);
	}

	@When("User Select it RAM {int}")
	public void user_select_it_ram(Integer int1) {
	    System.out.println("Its ram is " + int1);
	}
	

@When("User Select the {int} GB")
public void user_select_the_gb(Integer gb) {
    System.out.println("select the ram " + gb);
}

@Then("User Moved on payment page")
public void user_moved_on_payment_page() {
   System.out.println("move to the payment page");
}
}

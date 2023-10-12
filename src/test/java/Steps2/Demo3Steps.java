package Steps2;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo3Steps
{
	@Given("User on Sign Up page")
	public void user_on_sign_up_page() {
	   System.out.println("User on sign page");
	}

	@When("User Enter the follwing Details")
	public void user_enter_the_follwing_details(DataTable dataTable) 
	{
		List<List<String>> data = dataTable.asLists(String.class);
		for(List<String> value:data)
		{
	        System.out.println(value);
		}
		
//		Taking the single value
		String value = data.get(0).get(1);
		System.out.println(value);
	}
	
	@When("User click on sumbit Options")
	public void user_click_on_sumbit_options() {
	    System.out.println("User click on the sumbit button");
	}

	@Then("User sucessfully create Account")
	public void user_sucessfully_create_account() {
	   System.out.println("user sucessfully create account");
	}
}

package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps 
{
	@Given("User should be in Registration page")
	public void user_should_be_in_registration_page() {
	    System.out.println("Given Statement");
	}

	@When("User enters following information")
	public void user_enters_following_information(DataTable dataTable) 
	{
	   List<List<String>> data = dataTable.asLists(String.class);// It will give the information in String form at a runtime.
	    
	   for(List<String> listvalue:data)
	   {
		   System.out.println(listvalue);
	   }
	   
//	   Getting the specific value into the Data table
	   List<String> l1 = data.get(0); //for specific row
	   String value = l1.get(2); //for specific value
	   System.out.println(value);
	   
//	   Another way to take data in data table
	   String value1 = data.get(1).get(2);
	   System.out.println(value1);
	   
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
	    System.out.println("When Statement for submit button");
	}

	@Then("User gets created")
	public void user_gets_created() {
	    System.out.println("Then Statement");
	}
}

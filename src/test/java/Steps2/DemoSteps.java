package Steps2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps 
{

	@When("User go to serach box and type something")
	public void user_go_to_serach_box_and_type_something() {
	    System.out.println("user go serach box ");
	}
	
@Given("User on youtube main page")
public void user_on_youtube_main_page() {
    System.out.println("Given Statement");
}

//@When("User go to serach box and type something")
//public void user_go_to_serach_box_and_type_something() {
//   System.out.println("User Serach Something");
//}

@When("Click on search icon")
public void click_on_search_icon() {
   System.out.println("Click on search icon");
}

@Then("User go to the next page")
public void user_go_to_the_next_page() {
    System.out.println("User go to next page");
}

@When("User click on histroy button")
public void user_click_on_histroy_button() {
    System.out.println("User click on histroy button");
}

@When("Move to perticular vedio click on it")
public void move_to_perticular_vedio_click_on_it() {
   System.out.println("Click on vedio");
}

@Then("Vedio which we have click that will be started")
public void vedio_which_we_have_click_that_will_be_started() {
   System.out.println("The vedio get started");
}

	
}

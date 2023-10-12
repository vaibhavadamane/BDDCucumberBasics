package Steps2;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Demo5Steps 
{


@Given("User Should be on reg. page")
public void user_should_be_on_reg_page() {
   System.out.println("User on Registratin Page");
}

@When("User Enter following information")
public void user_enter_following_information(DataTable dataTable) {
    List<List<String>> data = dataTable.asLists(String.class);
    for(List<String> value : data)
    {
    	System.out.println(value);
    }
}

@When("User Click on Login page")
public void user_click_on_login_page() {
    System.out.println("User click on login button");
}

@When("User sucessfully login")
public void user_sucessfully_login() {
    System.out.println("user logined");
}

}

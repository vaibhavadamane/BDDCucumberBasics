package AppTestPack;

import Base.DriverFactory;
import Pages.SearchProductPage;
import io.cucumber.java.en.When;

public class SearchProductSteps 
{
	SearchProductPage page = new SearchProductPage(DriverFactory.getDriver());

	@When("User enter product name {string} in Search box")
	public void user_enter_product_name_in_search_box(String text)
	{
	    page.search(text);
	}

	@When("User click on serch button")
	public void user_click_on_serch_button() 
	{
	   page.serchButton();
    }
	
}
package AppTestPack;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.DriverFactory;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppTestSteps 
{
	HomePage homePage = new HomePage(DriverFactory.getDriver());
	
	@Given("User should be in landing page")
	public void user_should_be_in_landing_page() 
	{
	   WebDriver driver = DriverFactory.getDriver();
	   driver.get("https://www.amazon.in");
	}

	@Then("Page title should cantains {string}")
	public void page_title_should_cantains(String titleString)
	{
	   String title = homePage.getTitleOfPage();
	   boolean ispersent = title.contains(titleString);
	   Assert.assertTrue(ispersent);
	}

	@Then("Cart icon should get display")
	public void cart_icon_should_get_display() 
	{
	   boolean isdisplayed = homePage.verifyCart();
	   Assert.assertTrue(isdisplayed);
	}


    @Then("User click on Todays deal")
    public void user_click_on_todays_deal() 
    {
       homePage.enterTodaysDeallink();
    }

	@When("User click on sign in button")
	public void user_click_on_sign_in_button() 
	{
	   homePage.gotoSignPage();
	}

	@When("User enter the username as {string}")
	public void user_enter_the_username_as(String uname) 
	{
	    homePage.enterUsername(uname);
	}

    @When("User enters password as {string} with Signin")
    public void user_enters_password_as_with_signin(String pwd) 
    {
    	homePage.finalSignIN(pwd);
    
    }


}

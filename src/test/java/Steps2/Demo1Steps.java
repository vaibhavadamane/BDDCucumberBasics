package Steps2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps
{
	@Given("User on Main page of youtube")
	public void user_on_main_page_of_youtube() {
	   System.out.println("User on main page");
	}


	@When("User go to serach box and type {string}")
	public void user_go_to_serach_box_and_type(String string) {
	    System.out.println("User type " + string);
	}


	@When("Click on search icon and wait")
	public void click_on_search_icon_and_wait() {
	    System.out.println("click on search icon");
	}

	@Then("User go Pagol song vedio page")
	public void user_go_pagol_song_vedio_page() {
	    System.out.println("View Pagol vedio link");
	}

	@When("User click on histroy option")
	public void user_click_on_histroy_option() {
	    System.out.println("click on histroy");
	}

	@When("Move to perticular vedio click on that vedio")
	public void move_to_perticular_vedio_click_on_that_vedio() {
	    System.out.println("Click on perticular vedio");
	}

	@Then("Vedio which we have click that will be started from start")
	public void vedio_which_we_have_click_that_will_be_started_from_start() {
	   System.out.println("Vedio will be started");
	}

	
}

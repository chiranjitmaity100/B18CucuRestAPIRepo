package com.basic.myFirstRestScript;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyFirstRestScriptSD {

	Response res;
	
	@Given("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
	    res= RestAssured.given().get("https://www.google.com/");
	    
	}

	@When("^user check the status code$")
	public void user_check_the_status_code() throws Throwable {
		int statusCode= res.statusCode();
		
		System.out.println(statusCode);
		Assert.assertTrue(true);
	    
	}
}

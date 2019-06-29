package com.basic.getRequestFF;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestSD {

	Response resp;

	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() throws Throwable {
		System.out.println("Start the rest assured test");
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
		resp = RestAssured.given().relaxedHTTPSValidation().when().get("https://ergast.com/api/f1/2017/circuits.json");
		String respString = resp.asString();
		System.out.println(respString);

	}

	@When("^user check the limit$")
	public void user_check_the_limit() throws Throwable {
		String limitVal = resp.getBody().jsonPath().getString("MRData.limit");

		Assert.assertEquals("30", limitVal);

	}



	@Then("^user checks the status code$")
	public void user_checks_the_status_code() throws Throwable {
		int stCode = resp.getStatusCode();
		Assert.assertEquals(200, stCode);

	}

	@Then("^user checks at path \"([^\"]*)\" with the \"([^\"]*)\" value$")
	public void user_checks_at_path_with_the_value(String arg1, String arg2) throws Throwable {

	}

}

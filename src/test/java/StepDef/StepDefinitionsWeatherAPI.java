package StepDef;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.Map;

import org.apache.commons.text.WordUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;


public class StepDefinitionsWeatherAPI {
private static Response response;

public  String location;
public static String temperature;

@Step
@When("^request is made for \"([^\"]*)\" through API$")
public void request_is_made_for_through_API(String location) {
	this.location = WordUtils.capitalizeFully(location);
	response = RestAssured.
			given().
			pathParam("city",location).
			pathParam("API", "7fe67bf08c80ded756e598d6f8fedaea").
			get("http://api.openweathermap.org/data/2.5/weather?q={city}&appid={API}");


}

@Step
@Then("^validate the response$")
public void validate_the_response() {
	response.then().body("name", containsString(location));
	  System.out.println(response.asString()); 
}

@Step
@Then("^get Temperature from API$")
public void get_Temperature_from_API() {
	JsonPath jsonEvaluator = response.jsonPath();
	temperature = jsonEvaluator.get("main.temp").toString();
	System.out.println(temperature);
}

	

}

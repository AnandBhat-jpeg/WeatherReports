
package StepDef;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.HomePage;
import Pages.WeatherPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;


public class StepDefinitionsWeatherUI{
	
	@Steps
	HomePage homePage;
	@Steps
	WeatherPage weatherPage;
	
	
	@Managed
	WebDriver driver;
	
	@Step
	@Given("^url to open$")
	public void url_to_open() throws Throwable {
		
		homePage.open();
		
			
	}
	
	
	
	@Step
	@When("^navigate to weather tab$")
	public void navigate_to_weather_tab() {
	    homePage.popupDisable();
	    homePage.navigateTo("Weather");
	}

	
	@Step
	@Then("^search \"([^\"]*)\"$")
	public void search(String location) {
		weatherPage.searchLocation(location);
	}

	@Step
	@Then("^validate weather details are available for \"([^\"]*)\"$")
	public void validate_weather_details_are_available_for(String location) {
	    weatherPage.weatherDetails();
	}
	
	@Step
	@Then("^get Temperature from UI$")
	public void get_Temperature_from_UI() {
	    weatherPage.getTemperature();
	    }
}

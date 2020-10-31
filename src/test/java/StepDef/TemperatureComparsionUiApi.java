package StepDef;

import Pages.WeatherPage;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class TemperatureComparsionUiApi {

	@Steps
	WeatherPage weatherPage;
	@Steps
	StepDefinitionsWeatherAPI weatherAPI;
	
	@Step
	@Then("^validate temperature matches for both UI and API$")
	public void validate_temperature_matches_for_both_UI_and_API() {
	    
		String tempUI = weatherPage.temperature;
		String tempAPI = weatherAPI.temperature;
		
		double tempUIKelvin = Double.parseDouble(tempUI)+273.15;
		
		
		double result = tempUIKelvin-Double.parseDouble(tempAPI);
		
		if(result<=5 && result>=0) 
			Assert.assertTrue("Temperature difference is compatible in both UI-"+Double.toString(tempUIKelvin)+ "and API="+tempAPI, true);
		
		else
			Assert.assertTrue("Temperature difference is not compatible in both UI-"+Double.toString(tempUIKelvin)+ "and API="+tempAPI, false);
	
		
	}
}

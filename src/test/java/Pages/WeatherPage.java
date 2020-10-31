package Pages;

import java.util.List;

import org.apache.commons.text.WordUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Elements.WeatherPageElements;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WeatherPage extends PageObject{

	WeatherPageElements weatherPageElements;
	CommonPage commonPage;
	public static String location="";
	public static String temperature = "";
	public String txtArray[] = new String[2];
	
	public void searchLocation(String location) {
		String isChecked="";
		this.location = WordUtils.capitalizeFully(location);
		weatherPageElements.searchBox.sendKeys(this.location);
		 WebElement searchResult = getDriver().findElement(By.xpath("//*[@id='"+this.location+"']"));
		try {
		  isChecked =searchResult.getAttribute("checked").toString();
		  Assert.assertTrue(this.location+" already checked", true);

		}catch(Exception e) {
		 		 searchResult.click();
		}
		
	}
	
	public void weatherDetails() {
		
				 
		  WebElement locationMap = getDriver().findElement(By.xpath("//*[@Title='"+location+"']"));
			
		  WebElement temperatureCelsius = getDriver().findElement(By.xpath("//*[@Title='"+location+"']//*[@class='temperatureContainer']//span[1]"));

		  WebElement temperatureFaren = getDriver().findElement(By.xpath("//*[@Title='"+location+"']//*[@class='temperatureContainer']//span[2]"));
		 
		  WebElement weather =getDriver().findElement(By.xpath("//*[@Title='"+location+"']//*[@class='temperatureContainer']"));
		 

		Boolean locationStatus = locationMap.isEnabled();
		Boolean tempStatus1 = temperatureCelsius.isEnabled();
		Boolean tempStatus2 = temperatureFaren.isEnabled();
		commonPage.JSClick(weather);
		
		String detailedReportContent="";
		
		String detailedReportXPath = "//*[@class='leaflet-popup-content']//b";
		List<WebElement> detailedReport = getDriver().findElements(By.xpath(detailedReportXPath));
		 for(int i=1;i<=detailedReport.size(); i++) {
			 String path = "("+detailedReportXPath+")["+i+"]";
			 WebElement elements = getDriver().findElement(By.xpath(path));
			 if(i==4) {
				
				 txtArray = elements.getText().toString().split(":");
			}
			 detailedReportContent = detailedReportContent+elements.getText().toString()+", ";
		 }
			
		//String result = weatherPageElements.detailedReport.getText().toString();
		System.out.println(detailedReportContent);
	}

	public void getTemperature() {
		
		 temperature = txtArray[1].trim();
		 System.out.println(temperature);

	}

}

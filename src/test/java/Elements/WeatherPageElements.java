package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pages.WeatherPage;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class WeatherPageElements extends PageObject{
	
	
	
	@FindBy(xpath="//*[@id='searchBox']")
	public WebElementFacade searchBox;
	
}
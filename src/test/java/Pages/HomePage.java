package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.Status;

import Elements.HomePageElements;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject{
	
	HomePageElements homePageElements;
	

	public void popupDisable() {
		
		if(homePageElements.noThanksLink.waitUntilClickable() != null) {
			homePageElements.noThanksLink.click();
		}
	}

	public void navigateTo(String tab) {
		
		switch(tab) {
		case "Weather": 
			homePageElements.expandMoreLink.click();
			homePageElements.weatherTab.click();
			break;
		}
		
			}
	
}
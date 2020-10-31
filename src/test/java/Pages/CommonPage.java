package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import net.thucydides.core.pages.PageObject;

public class CommonPage extends PageObject{

	public void JSClick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		executor.executeScript("arguments[0].click();",ele);
	}
	
}

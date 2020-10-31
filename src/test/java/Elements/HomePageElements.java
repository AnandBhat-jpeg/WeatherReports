package Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Pages.HomePage;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class HomePageElements extends PageObject{
	
	@FindBy(xpath="//*[text()='No Thanks']")
	public static WebElementFacade noThanksLink;
	
	@FindBy(xpath="//*[@class='topnavmore']")
	public static WebElementFacade expandMoreLink;
	
	@FindBy(xpath="//*[text()='WEATHER']")
	public static WebElementFacade weatherTab;
	
	

}

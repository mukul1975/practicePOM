package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
	
	public WebDriver driver;
	public HomePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='SpiceClub']")
	WebElement spiceclub;
	public WebElement SpiceClub()
	{
		return spiceclub;
	}
	
	

}

package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceClubPOM {
	
	
	public WebDriver driver;
	public SpiceClubPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class='navbar-nav mr-auto']//a[@class='nav-link'][contains(text(),'Tiers')]")
	WebElement tier;
	public WebElement Tier()
	{
		return tier;
	}
	
	By singup=By.xpath("//a[@class='nav-link signup-link']");
	public WebElement Signup()
	{
		return driver.findElement(singup);
	}

}

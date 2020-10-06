package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePOM;
import Resources.BrowserInicialized;
import Resources.listener;


public class SpicejetHomePage extends BrowserInicialized{
	
	@Test
	public void homePageTest() throws IOException
	{
		WebDriver driver =browser();
		driver.get(prob.getProperty("url"));
		
		HomePOM hp=new HomePOM(driver);
		hp.SpiceClub().click();
	}
	
	@AfterClass
	public void teardawn()
	{
		driver.quit();
	}
	
	
	

}

package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import POM.SpiceClubPOM;
import Resources.BrowserInicialized;

public class SpiceClubPage extends BrowserInicialized{
	
	@Test
	public void spiceclub() throws IOException
	{
		driver=browser();
		driver.get("https://spiceclub.spicejet.com/");
		SpiceClubPOM sc=new SpiceClubPOM(driver);
		sc.Tier().click();
		sc.Signup().click();
	}
	
	@AfterClass
	public void teardawn()
	{
		driver.quit();
	}
	
	

}

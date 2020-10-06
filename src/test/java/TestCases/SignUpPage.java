package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import POM.SignUpPagePOM;
import Resources.BrowserInicialized;

public class SignUpPage extends BrowserInicialized{
	
	@Test
	public void signup() throws IOException
	{
		driver =browser();
		driver.get("https://book.spicejet.com/Register.aspx");
		SignUpPagePOM sup=new SignUpPagePOM(driver);
		sup.MrMrs().click();
		sup.selectmrmrs("MS");
	}
	
	@AfterClass
	public void teardawn()
	{
		driver.quit();
	}
	
	

}

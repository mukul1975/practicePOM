package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPagePOM {
	
	public WebDriver driver;
	public SignUpPagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By mrmrs=By.xpath("//select[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']");
	
	public WebElement MrMrs()
	{
		return driver.findElement(mrmrs);
	}
	
	public void selectmrmrs(String text)
	{
		Select sc=new Select(driver.findElement(mrmrs));
		 sc.selectByVisibleText(text);
	}

}

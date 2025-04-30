package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends BasePage{
	
 public	MyaccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//p[@class='smallText']")
	WebElement msgheading;
	
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement btnlogout;
	
	public void clicklogout()
	{
		btnlogout.click();
	}
	
	public boolean isMyaccountPageexist()
	{
		try
		{
			return(msgheading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}

}

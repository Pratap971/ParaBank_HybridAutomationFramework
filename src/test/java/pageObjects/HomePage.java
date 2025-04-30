package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
 public	WebDriver driver;
	
    public HomePage(WebDriver driver)
	{
		super(driver);
	}
    
    @FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;
    
    @FindBy(xpath ="//input[@name='username']")
    WebElement txt_username;
    
    @FindBy(xpath = "//input[@name='password']")
    WebElement txt_password;
    
    @FindBy(xpath = "//input[@value='Log In']")
    WebElement btn_lgn;
  
    public void clickRegister()
	{
		lnkRegister.click();
	}
    
    public void setUsername(String uname)
    {
    	txt_username.sendKeys(uname);
    }
    
    public void setPassword(String password)
    {
    	txt_password.sendKeys(password);
    }
    
    public void clickLogin()
    {
    	btn_lgn.click();
    }
    
    

}

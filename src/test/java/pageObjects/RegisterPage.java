package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	
	public WebDriver driver;
		
	    public RegisterPage(WebDriver driver)
		{
			super(driver);
		}
	    
	    @FindBy(xpath="//input[@id='customer.firstName']")
		WebElement txt_firstname;
		
		
		@FindBy(xpath="//input[@id='customer.lastName']") 
		WebElement txt_lasttname;
		
		@FindBy(xpath="//input[@id='customer.address.street']") 
		WebElement txt_address;
		
		@FindBy(xpath="//input[@id='customer.address.city']") 
		WebElement txt_city;
		
		@FindBy(xpath="//input[@id='customer.address.state']") 
		WebElement txt_state;
		
		@FindBy(xpath="//input[@id='customer.address.zipCode']") 
		WebElement txt_zipcode;
		
		
		@FindBy(xpath="//input[@id='customer.phoneNumber']") 
		WebElement txt_phone;
		
		@FindBy(xpath="//input[@id='customer.ssn']") 
		WebElement txt_ssn;
		
		@FindBy(xpath="//input[@id='customer.username']") 
		WebElement txt_username;
		
		@FindBy(xpath="//input[@id='customer.password']") 
		WebElement txt_custpassword;
		
		@FindBy(xpath="//input[@id='repeatedPassword']") 
		WebElement txt_confirmPass;
		
		@FindBy(xpath="//input[@value='Register']") 
		WebElement btn_register;
		

		
		public void firstName(String name)
		{
			txt_firstname.sendKeys(name);
		}
		
		public void lastName(String name)
		{
			txt_lasttname.sendKeys(name);
		}
		
		public void addressName(String name)
		{
			txt_address.sendKeys(name);
		}
		public void cityName(String name)
		{
			txt_city.sendKeys(name);
		}
		public void stateName(String name)
		{
			txt_state.sendKeys(name);
		}
		public void zipcodeNum(String name)
		{
			txt_zipcode.sendKeys(name);
		}
		public void phoneNum(String name)
		{
			txt_phone.sendKeys(name);
		}
		public void ssnName(String name)
		{
			txt_ssn.sendKeys(name);
		}
		public void usernameName(String name)
		{
			txt_username.sendKeys(name);
		}
		
		public void custPass(String name)
		{
			txt_custpassword.sendKeys(name);
		}
		public void confPass(String name)
		{
			txt_confirmPass.sendKeys(name);
		}
		
		public void clickRegister()
		{
			btn_register.click();
		}
	    
	    
}
		

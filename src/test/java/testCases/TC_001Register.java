package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_001Register extends BaseClass{
	
	
	@Test (priority = 1, groups = {"sanity","master"})
	public void home()
	{
	logger.info(" *** starting home page ***");
	HomePage hp = new HomePage(driver);
	hp.clickRegister();
    }
	
	@Test (priority = 2)
	public void register()
	{
		logger.info("*** Starting register page ***");
		
		RegisterPage rp = new RegisterPage(driver);
		rp.firstName("pratap");
		rp.lastName("yadav");
		rp.addressName("new Ashok nagar");
		rp.cityName("delhi");
		rp.stateName("delhi");
		rp.zipcodeNum("110096");
		rp.phoneNum("8787020501");
		rp.ssnName("564");
		rp.usernameName("pra002");
		rp.custPass("abc123");
		rp.confPass("abc123");
		rp.clickRegister();
		
		logger.info("*** validate register test case ***");
		
		String expectedtitle = "ParaBank | Customer Created";
		String actualtitle = driver.getTitle();
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Register test case is passed");
			Assert.assertEquals(expectedtitle, actualtitle);
		}
		else
		{
			System.out.println("register test case failed");
		}
		logger.info("*** end of register page ***");
	}

}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyaccountPage;
import testBase.BaseClass;

public class TC_002Login extends BaseClass{

	@Test (groups = {"Regression","Master"})
	public void login()
	{
	
	try {
	logger.info("Starting the login test case...");
	HomePage hp = new HomePage(driver);
	hp.setUsername(p.getProperty("username"));
	hp.setPassword(p.getProperty("password"));
	hp.clickLogin();
	
	MyaccountPage macc = new MyaccountPage(driver);
	
	boolean targetPage = macc.isMyaccountPageexist();
   
    Assert.assertTrue(targetPage, "Welcome pra002");
    logger.info("Login test case passed!");
	}
	catch (Exception e)
	{
        logger.error("Login test case failed due to exception: " + e.getMessage());
        
        Assert.fail("Test case failed due to exception: " + e.getMessage());
    }

    logger.info("Finished the login test case.");
    
	}
}

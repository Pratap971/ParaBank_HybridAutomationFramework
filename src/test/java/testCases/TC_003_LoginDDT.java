package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.MyaccountPage;
import testBase.BaseClass;
import utilities.DataProviders;


/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
 */

public class TC_003_LoginDDT extends BaseClass
{

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String username, String password, String exp)
	{
		logger.info("** Starting TC_003_LoginDDT ***");

		try {

			//Home page
			HomePage hp=new HomePage(driver);
			hp.setUsername(username);
			hp.setPassword(password);

			hp.clickLogin();

			//My Account Page
			MyaccountPage macc=new MyaccountPage(driver);
			boolean targetPage=macc.isMyaccountPageexist();

			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.clicklogout();
					Assert.assertTrue(true);  // pass
				}
				else
				{
					Assert.assertTrue(false);
				}
			}

			if(exp.equalsIgnoreCase("Invalid"))   // negative data   username and password 
			{
				if(targetPage==true)
				{
					macc.clicklogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);    // passs
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}

		logger.info("** Finished TC_003_LoginDDT ***");
	}

}

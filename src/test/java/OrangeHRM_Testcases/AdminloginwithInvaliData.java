package OrangeHRM_Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangheHRM_Library.Loginpage;
import Utils.AppUtils;

public class AdminloginwithInvaliData extends AppUtils
{
	@Parameters({"uid", "pwd"})
	@Test
	public void adminloginwithInvalid(String uid, String pwd) {
		
		Loginpage lp = new Loginpage();
		lp.login(uid, pwd);
		boolean res =lp.isErrmsgDisplayed();
		Assert.assertTrue(res);
		
		
		
	}

}

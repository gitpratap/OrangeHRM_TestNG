package OrangeHRM_Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangheHRM_Library.Loginpage;
import Utils.AppUtils;

public class AdminwithValidData extends AppUtils
{
	Loginpage lp=new Loginpage();
	@Parameters({"adminuid","adminpwd"})
	@Test(invocationCount = 5)
	public void loginwithvalidDat(String uid, String pwd) {
		lp.login(uid, pwd);
		boolean res=lp.isAdminDisplayed();
		Assert.assertTrue(res);
		lp.logout();
	}
	

}

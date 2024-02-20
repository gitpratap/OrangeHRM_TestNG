package OrangeHRM_Testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangheHRM_Library.AdminUtils;
import OrangheHRM_Library.Loginpage;
import Utils.AppUtils;

public class EmployeeLogin extends AppUtils
{

	@Parameters({"uid", "pwd"})
	@Test
	public void employeeLogin(String uid, String pwd) {
		Loginpage lp = new Loginpage();
		lp.login(uid, pwd);
		lp.logout();
		
	}
	
}

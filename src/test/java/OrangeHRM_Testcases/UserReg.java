package OrangeHRM_Testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangheHRM_Library.AdminUtils;
import OrangheHRM_Library.User;

public class UserReg extends AdminUtils

{
	@Parameters({"empname","uname","password"})
	@Test
	public void userRegistration(String empname, String uname, String password) 
	{
		
		User us = new User();
		us.userAdd(empname, uname, password);
		
	}

}

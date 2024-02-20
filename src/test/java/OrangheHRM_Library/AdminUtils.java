package OrangheHRM_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;

public class AdminUtils extends AppUtils
{
	
	Loginpage lp= new Loginpage();
	String uid="Admin";String pwd= "Qedge123!@#";
	
	@BeforeTest
	public void loginApp()
	{
		lp.login(uid, pwd);
	
	}
	
	@AfterTest
	public void logoutApp() {
		lp.logout();
		
	}
	
}

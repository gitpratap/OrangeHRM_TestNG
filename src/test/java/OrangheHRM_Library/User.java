package OrangheHRM_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Utils.AppUtils;

public class User extends AppUtils
{
	
	
	public void userAdd(String empname, String uname, String password)
	{

		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.name("btnAdd")).click();
		Select sl = new Select(driver.findElement(By.id("systemUser_userType")));
		sl.selectByVisibleText("Admin");
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		Select status = new Select(driver.findElement(By.id("systemUser_status")));
		status.selectByVisibleText("Enabled");
		driver.findElement(By.id("systemUser_password")).sendKeys(password);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(password);
		driver.findElement(By.id("btnSave")).click();
		
		
	}

}

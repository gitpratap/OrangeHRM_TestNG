package OrangeHRM_Testcases;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangheHRM_Library.AdminUtils;
import OrangheHRM_Library.Employee;

public class EmployeeRegistration extends AdminUtils
{
	@Parameters({"fname","lname"})
	@Test
	public void empReg(String fname, String lname) 
	{
		Employee emp = new Employee();
		boolean res =emp.addEmployee(fname, lname);
		Assert.assertTrue(res);
		//System.out.println(res);
		
	
	}
}

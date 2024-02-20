package OrangheHRM_Library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.AppUtils;

public class Employee extends AppUtils
{

	public boolean addEmployee(String fname, String lname) {
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		String val = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(val);
		
		driver.findElement(By.id("searchBtn")).click();
		WebElement ele=driver.findElement(By.id("resultTable"));
		List<WebElement> tbrows =ele.findElements(By.tagName("tr"));
		boolean result= false;
		for(int i=1;i<tbrows.size();i++) {
			List<WebElement> tbcol =tbrows.get(i).findElements(By.tagName("td"));
			if (tbcol.get(1).getText().equals(val)) {
				result= true;
				break;
			}
			
			
		}
		return result;
	}
	
}

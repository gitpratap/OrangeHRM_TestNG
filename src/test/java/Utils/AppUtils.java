package Utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
public class AppUtils 
{
	public static WebDriver driver;
	
	public static String url = "http://orangehrm.qedgetech.com";
	
	@BeforeSuite
	public void LaunchApp() {
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

@AfterSuite	
	public void closeApp() {
		driver.close();
	}
}

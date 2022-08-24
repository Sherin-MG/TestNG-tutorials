package testNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExamples {
	//1.open googe,bing,yahoo
	WebDriver driver;
	Long starttime;
	Long endtime;
	Long totaltime;
	@BeforeSuite
	public void openbrowser() {
	 starttime=	System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32/chromedriver.exe");
	 driver = new ChromeDriver();
	}
	@Test(priority = 0)
	public void opengoogle() {
		driver.get("https://www.google.com/");
		
	}
	@Test(priority = 1)
	public void openbing() {
		driver.get("https://www.bing.com/");
		
	}
	@Test(priority = 2)
	public void openyahoo() {
		driver.get("https://sg.search.yahoo.com/");
	}
	@AfterSuite
	public void closebrowser() {
	driver.quit();
	endtime=	System.currentTimeMillis();
	totaltime=endtime-starttime;
	System.out.println("Total time taken = "+totaltime);
		
		
		
		
	}
	
}

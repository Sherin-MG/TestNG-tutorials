package testNG;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	
	@Test
	public void testcase1alert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		//1. normal alert
				WebElement normalalert=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
				normalalert.click();
				Alert status= driver.switchTo().alert();
				Thread.sleep(5000);
				status.accept();
				driver.quit();
		
		
	}
	@Test
	public void testcase2autocompletion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		WebElement textbox=	driver.findElement(By.id("yschsp"));
		textbox.sendKeys("s");
		Thread.sleep(5000);//time for loading list of web elements
		
		List<WebElement>entirelist=	driver.findElements(By.xpath("//*[@id=\"sbq-wrap\"]/div/div/div/ul/li"));
		int size=	entirelist.size();
		System.out.println(size);//to check whether it has identified entire list
		for (WebElement webElement : entirelist) {
			if (webElement.getText().equals("songs")) {
				webElement.click();
				break;//to stop hyteration
				
			}
			
		}	
		driver.quit();
	}

}

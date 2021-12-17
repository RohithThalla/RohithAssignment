package tests;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class NavigateToGoogle {
	WebDriver driver;
	WebDriverManager webDrvMgr;
	
	@BeforeClass
	public void setUp(){
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void navigateToGoogleTest(){
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	

}

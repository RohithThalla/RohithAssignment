package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class CrossBrowser {
	WebDriver driver;
	WebDriverManager webDrvMgr;
	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional("chrome")String browser){
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser(browser);
	}
	
	@Test
	public void navigateToGoogleTest(){
		driver.get("http://www.google.co.in");
		}
	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	

}

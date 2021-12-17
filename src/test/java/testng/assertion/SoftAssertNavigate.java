package testng.assertion;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class SoftAssertNavigate {
	
	WebDriver driver;
	WebDriverManager webDrbMng;
	org.testng.asserts.SoftAssert sf;
	
	@BeforeClass
	public void setUp() {
		webDrbMng= new WebDriverManager();
		driver=webDrbMng.launchBrowser("chrome");
		driver.get("https://mail.google.com/");
	}
	
	@BeforeMethod
	public void setup() {
	    sf=new org.testng.asserts.SoftAssert();
	}
	
	@Test
	public void gmailLogin() {
		sf.assertEquals("thallarohith1@gmail.com", "thallarohith1@gmail.com");
		sf.assertEquals("******","******");
		sf.assertAll();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}

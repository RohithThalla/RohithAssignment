package testng.assertion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class HardAssertNavigate {
	WebDriver driver;
	WebDriverManager webDrvMgr;
	
	@BeforeClass
	public void setUp(){
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		driver.get("https://www.myntra.com");
	}
	@Test
	
	public void HardAssertNavigateTest() {
		String title = driver.getTitle();
		Assert.assertEquals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra",title);
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.myntra.com/",url);
	}
	@AfterClass
	
	public void tearDown() {
		driver.close();
	}

}

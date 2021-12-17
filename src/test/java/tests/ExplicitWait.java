package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class ExplicitWait {
	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;
	
	@BeforeClass
	
	public void setUp() {
		webDrvMgr=new WebDriverManager();
		driver=webDrvMgr.launchBrowser("chrome");
		wait=new WebDriverWait(driver,120);
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void explictWaitTest() {
		By bysearch=By.cssSelector("input.gLFyf.gsfi");
		wait.until(ExpectedConditions.elementToBeClickable(bysearch));
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).clear();
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Testing");
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).clear();
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Virat");
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}

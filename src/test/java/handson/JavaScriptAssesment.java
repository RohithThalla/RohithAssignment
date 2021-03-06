package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class JavaScriptAssesment {
	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;
	
@BeforeClass
	
	public void setUp() {
		webDrvMgr=new WebDriverManager();
		driver=webDrvMgr.launchBrowser("chrome");
		wait=new WebDriverWait(driver,120);
		driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	}
	
	@Test
	public void JavaScriptTest() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		
		
		driver.switchTo().alert().accept();
		WebElement a=driver.findElement(By.id("confirm-demo"));
		String me=a.getText();		
		Assert.assertEquals(me,"You Pressed OK!");
		Thread.sleep(10000);
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}


}

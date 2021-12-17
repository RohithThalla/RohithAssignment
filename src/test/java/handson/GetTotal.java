package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class GetTotal {
	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;


	@BeforeClass

	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("edge");
		wait = new WebDriverWait(driver, 120);
		driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
	}
	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test(priority=1)
	public void getTotalTest() {
		String expected="3";
		WebElement om1=driver.findElement(By.id("sum1"));
		om1.clear();
		om1.sendKeys("1");
		WebElement om2=driver.findElement(By.id("sum2"));
		om2.clear();
		om2.sendKeys("2");
		driver.findElement(By.xpath("//button[@class='btn btn-default'][text()='Get Total']")).click();
		String actual=driver.findElement(By.id("displayvalue")).getText();
		Assert.assertEquals(actual,expected);
		
		
		
		

	}
	@Test(priority=2)
	public void getTotalTest1() {
		String expected="NaN";
		WebElement om1=driver.findElement(By.id("sum1"));
		om1.clear();
		om1.sendKeys("a");
		WebElement om2=driver.findElement(By.id("sum2"));
		om2.clear();
		om2.sendKeys("2");
		driver.findElement(By.xpath("//button[@class='btn btn-default'][text()='Get Total']")).click();
		String actual=driver.findElement(By.id("displayvalue")).getText();
		Assert.assertEquals(actual,expected);
		
		
		
		

	}

}

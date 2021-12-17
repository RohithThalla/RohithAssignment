package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class Assignment2 {
	
	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;

	@BeforeClass

	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("edge");
		wait = new WebDriverWait(driver, 120);
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	}

	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test
	public void checkBoxTest() throws InterruptedException {
		String actual="Success - Check box is checked";
		driver.findElement(By.id("isAgeSelected")).click();
		Thread.sleep(2000);
		String expected=driver.findElement(By.xpath("//div[@id='txtAge']")).getText();
		sf.assertEquals(actual, expected);
		System.out.println(expected);
		
		driver.findElement(By.id("isAgeSelected")).click();
		Thread.sleep(2000);
		String actual1="";
		String expected1=driver.findElement(By.xpath("//div[@id='txtAge']")).getText();
		sf.assertEquals(actual1, expected1);
		System.out.println(expected1);
		

		WebElement elem1=driver.findElement(By.xpath("//input[@id='check1']"));
		elem1.click();
		Thread.sleep(2000);
		
		List<WebElement> listOfChecked= driver.findElements(By.xpath("//input[@class='cb1-element']"));
		for(WebElement elem2 : listOfChecked) {
			sf.assertTrue(elem2.isSelected(),"FAIL | this is not checked "+elem2.getText());
		}
		Thread.sleep(3000);
		
		sf.assertAll();
		
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}

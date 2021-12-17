package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class NavigateToGoogleAssert {
	WebDriver driver;
	WebDriverManager webDrvMgr;
	SoftAssert sf;
	
	@BeforeMethod
	public void setUp(){
		sf=new SoftAssert();
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void navigateToGoogleTest(){
		String title = driver.getTitle();
		//System.out.println(title);
		sf.assertEquals("Google",title);
		String url = driver.getCurrentUrl();
		
		sf.assertEquals("https://www.google.co.in/?gws_rd=ssl",url );
		//System.out.println(url);
		WebElement oelem = driver.findElement(By.cssSelector("div.uU7dJb"));
		String innerText = oelem.getText();
		sf.assertEquals("India",innerText);
		//System.out.println(innerText);
		String attribClass = oelem.getAttribute("class");
		sf.assertEquals("uU7dJb",attribClass);
		//System.out.println(attribClass);
		//List<String> a=new ArrayList<String>();
		//a.add("About");
	
		List<WebElement> oList = driver.findElements(By.cssSelector("div.KxwPGc.AghGtd>*"));
		for(WebElement oElem: oList){
			String innertext = oElem.getText();
			System.out.println(innertext);
		
		}
		sf.assertAll();
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	


}

package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class SelectDropDown {

	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;


	@BeforeClass

	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("edge");
		wait = new WebDriverWait(driver, 120);
		driver.get("https://demoqa.com/select-menu");
	}
	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test
	public void selectDropDownTest() throws InterruptedException {
		WebElement oDropDown = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(oDropDown);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByVisibleText("Black");
		Thread.sleep(2000);
		select.selectByValue("8");
		Thread.sleep(2000);
		
		

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

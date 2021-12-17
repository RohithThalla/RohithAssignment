package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

public class MouseHover {
	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;
	WebDriverUtilities webDrvUtil;

	@BeforeClass

	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("edge");
		wait = new WebDriverWait(driver, 120);
		webDrvUtil = new WebDriverUtilities(driver);
		driver.get("https://demoqa.com/menu/");
	}

	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test
	public void mouseHoverTest() throws InterruptedException {
		Actions action=new Actions(driver);
		WebElement oElem=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(oElem).build().perform();
		Thread.sleep(5000);
		

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
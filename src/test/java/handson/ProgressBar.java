package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class ProgressBar {
	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;

	@BeforeClass

	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("edge");
		wait = new WebDriverWait(driver, 120);
		driver.get("https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html");
	}

	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test
	public void progressBarTest() {
		driver.findElement(By.id("downloadButton")).click();
		By completed = By.cssSelector("div.progress-label");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(completed, "Complete!"));
		driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button")).click();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

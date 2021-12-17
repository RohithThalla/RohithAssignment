package tests;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class LaunchBrowserWebDriverManager {
	
	 @Test
	  public void launchEdgeBrowser() {
		  WebDriver driver;
		  WebDriverManager webdvrmgr=new WebDriverManager();
		  driver=webdvrmgr.launchBrowser("edge");
		  driver.get("https://google.co.in");
		  driver.quit();
	  }
	  @Test
	  public void lauchChromeBrowser() {
		  WebDriver driver;
		  WebDriverManager webdvrmgr=new WebDriverManager();
		  driver=webdvrmgr.launchBrowser("chrome");
		  driver.get("https://google.co.in");
		  driver.quit();
		  
	  }
	  @Test
	  public void lauchFirefoxBrowser() {
		  WebDriver driver;
		  WebDriverManager webdvrmgr=new WebDriverManager();
		  driver=webdvrmgr.launchBrowser("ff");
		  driver.get("https://google.co.in");
		  driver.quit();
		  
	  }
	  

}

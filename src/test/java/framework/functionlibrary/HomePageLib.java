package framework.functionlibrary;

import org.openqa.selenium.WebDriver;

import framework.pageobjects.HomePagePO;

public class HomePageLib {
	WebDriver driver;
	HomePagePO homepagepo;
	public HomePageLib(WebDriver driver) {
		this.driver=driver;
		
	}
	public void searchForProduct(String searchParam) {
		homepagepo=new HomePagePO(driver);
		homepagepo.enterValueInSearchBar(searchParam);
		homepagepo.clickSearchBtn();
	}

}

package framework.functionlibrary;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.pageobjects.SearchResultsPO;

public class SearchResultsLib {

	WebDriver driver;
	SearchResultsPO searespo;

	public SearchResultsLib(WebDriver driver) {
		this.driver = driver;
	}

	public List<String> getListOfProductName() {
		searespo = new SearchResultsPO(driver);
		List<WebElement> oList = searespo.returnSearchResultsList();
		List<String> searchResultsProdNames = new LinkedList<String>();
		for (WebElement oelem : oList) {
			String prodName = oelem.getText();
			searchResultsProdNames.add(prodName);
		}
		return searchResultsProdNames;
	}

	public void clicknthSearchResultLink(int resultNum) {
		searespo = new SearchResultsPO(driver);
		List<WebElement> oList = searespo.returnSearchResultsList();
		oList.get(resultNum - 1).click();
	}

	public int returnSearchResultsCount() {
		searespo = new SearchResultsPO(driver);
		List<WebElement> oList = searespo.returnSearchResultsList();
		return oList.size();
	}

}

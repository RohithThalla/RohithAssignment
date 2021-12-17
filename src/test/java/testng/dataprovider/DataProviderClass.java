package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@Test(dataProvider="data-provider")
	public void dataProviderTest(String input) {
		System.out.println("Name is "+input);
		
	}
	@DataProvider(name="data-provider")
	public static Object[][] dpMethod(){
		return new Object[][] {
			{"Rohith"},
			{"Virat"},
			{"Thalla"}
		};
	}
	@DataProvider(name="data-provider-1")
	public static Object[][] dpMethod1(){
		return new Object[][] {
			{1,2}, 
			{2,3},
			{4,5},
			{6,7}
		};
	}
	

}


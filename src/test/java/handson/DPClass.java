package handson;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPClass {
	
	@Test(dataProvider="data-provider")
	public void dataProviderTest(String input) {
		System.out.println("Name is "+input);
		
	}
	@DataProvider(name="data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {
			{"Rohith"},
			{"Virat"},
			{"Thalla"}
		};
	}
	@DataProvider(name="data-provider-1")
	public Object[][] dpMethod1(){
		return new Object[][] {
			{1,2},
			{2,3},
			{4,5}
		};
	}
	@Test(dataProvider="data-provider-1")
	public void dpMethod1Test(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is"+sum);
		
	}

}

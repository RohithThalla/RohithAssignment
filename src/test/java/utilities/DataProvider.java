package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.testng.Assert;

public class DataProvider {
	Workbook workbook;
	Row oRow;
	Sheet iSheet;
	
	public static String getTestData(String filePath,String key) {
		Properties prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop.load(fis);
		}catch(IOException ioex) {
			Assert.fail("FAIL | IO Exception thrown.Please check that file path is correct");
		}
		return prop.getProperty(key);
	}
}

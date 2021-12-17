package testng.assertion;


import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void SoftAssertTest() {
		org.testng.asserts.SoftAssert sf=new org.testng.asserts.SoftAssert();
		sf.assertEquals("Rohith","Rohith");
		sf.assertEquals("Thalla", "Thalla");
		sf.assertEquals("","9010254784");
		sf.assertEquals("","testing");
		sf.assertAll();
		
	}

}

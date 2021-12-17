package testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void HardAssertTest() {
		
		Assert.assertEquals("Rohith","Rohith");
		Assert.assertEquals("Thalla", "Thalla");
		Assert.assertEquals("","9010254784");
		Assert.assertEquals("","testing");
		
	}

}

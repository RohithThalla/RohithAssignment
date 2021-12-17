package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class class3 {
	 @Test(priority=1)
	  public void testOne() {
		  System.out.println("class3_testone");
	  }
	  @Test(priority=2)
	  public void testtwo() {
		  System.out.println("class3_testtwo");
	  }
	  @Test(priority=3)
	  public void testthree() {
		  System.out.println("class3_testthree");
	  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("class3_beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("class3_aftertest");
  }

}

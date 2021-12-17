package testng.pckg1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class class2 {
	 @Test
	  public void testOne() {
		  System.out.println("class2_testone");
	  }
	  @Test
	  public void testtwo() {
		  System.out.println("class2_testtwo");
	  }
	  @Test
	  public void testthree() {
		  System.out.println("class2_testthree");
	  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("class2_beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("class2_aftertest");
  }

}

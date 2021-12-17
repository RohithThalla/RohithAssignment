package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class class4 {
	 @Test
	  public void testOne() {
		  System.out.println("class4_testone");
	  }
	  @Test
	  public void testtwo() {
		  System.out.println("class4_testtwo");
	  }
	  @Test
	  public void testthree() {
		  System.out.println("class4_testthree");
	  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("class4_beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("class4_aftertest");
  }

}

package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotations3 {
  @Test
  public void testOne() {
	  System.out.println("Annotations3_testone");
  }
  @Test
  public void testtwo() {
	  System.out.println("Annotations3_testtwo");
  }
  @Test
  public void testthree() {
	  System.out.println("Annotations3_testthree");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotations3_beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Annotations3_afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotations3_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Annotations3_afterClass");
  }

}

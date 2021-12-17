package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class Annotations2 {
  @Test(priority=1)
  public void testone() {
	  System.out.println("Annotations2_testone");
  }
  @Test(priority=2,dependsOnMethods = "testone")
  public void testtwo() {
	  System.out.println("Annotations2_testtwo");
	  Assert.fail();
  }
  @Test(priority=3,dependsOnMethods = "testone")
  public void testthree() {
	  System.out.println("Annotations2_testthree");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotations2_beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Annotations2_beforeMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotations2_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Annotations2_afterClass");
  }

 

  

}

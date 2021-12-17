package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void testOne() {
	  System.out.println("Annotations_testone");
  }
  @Test
  public void testtwo() {
	  System.out.println("Annotations_testtwo");
  }
  @Test
  public void testthree() {
	  System.out.println("Annotations_testthree");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotations_beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Annotations_afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotations_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Annotations_afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Annotations_beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Annotations_afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Annotations_beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Annotations_afterSuite");
  }

}

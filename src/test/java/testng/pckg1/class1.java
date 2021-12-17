package testng.pckg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class class1 {
  @Test(priority=1,groups= {"regression"})
  public void testOne() {
	  System.out.println("class1_testone");
  }
  @Test(priority=2,groups= {"regression","smoke"})
  public void testtwo() {
	  System.out.println("class1_testtwo");
  }
  @Test(priority=3,groups= {"smoke"})
  public void testthree() {
	  System.out.println("class1_testthree");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("class1_beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("class1.afterclass");
  }

}

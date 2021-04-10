package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC10_AnnotationsHeirachyExamples {
  @Test
  public void Test() {
	  System.out.println("I am Test Method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am beforeMethod Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am afterMethod Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am beforeClass Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am afterClass Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am beforeTest Method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am afterTest Method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am beforeSuite Method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am afterSuite Method");
  }

}

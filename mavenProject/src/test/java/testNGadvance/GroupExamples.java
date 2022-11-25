package testNGadvance;

import org.testng.annotations.Test;

public class GroupExamples {
  @Test(groups="Regression test")
  public void testcase1() {
	  System.out.println("I am in testcase1 - and in Regression group");
  }
  @Test(groups="Sanity test")
	  public void testcase2() {
		  System.out.println("I am in testcase2 - and in Sanity group");
	  }
  @Test(groups="Smoke test")
  public void testcase3() {
	  System.out.println("I am in testcase3 - and in smoke group ");
	  
  }
  @Test(groups="Sanity test")
  public void testcase4() {
	  System.out.println("I am in testcase4 - and in Sanity group");
  }
  @Test(groups="Sanity test")
  public void testcase5() {
	  System.out.println("I am in testcase5 - and in Sanity group");
  }
}

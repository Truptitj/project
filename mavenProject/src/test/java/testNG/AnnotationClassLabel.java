package testNG;

import org.testng.annotations.Test;

public class AnnotationClassLabel {
  @Test
  public void testcase1() {
	  System.out.println("testcase 1 is running");
  }
  public void testcase2() {
	  System.out.println("testcase 2 is running");
  }
  public void testcase3() {
	  System.out.println("testcase 3 is running");
  }
  public void testcase4() {
	  System.out.println("testcase 4 is running");
  }
  void testcase5() { //this willnot execute bec there is no declared public
	  System.out.println("testcase 5 is running");

  }
}
//Annotation ClassLabel is used when more no of testcases are executes

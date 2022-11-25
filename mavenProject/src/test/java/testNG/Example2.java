package testNG;

import org.testng.annotations.Test;

public class Example2 {
  @Test
  public void testcase1() {
	  System.out.println("I am TC3");
  }
  @Test
  public void testcase2() {
	  System.out.println("I am TC2");
  }
  @Test
  public void testcase3() {
	  System.out.println("I am TC1");
  }
  @Test
  public void testcase4() {
	  System.out.println("I am TC4");
	  calling();
}
  public void calling() {
	  System.out.println("I am calling method");
  }
}

package testNG;

import org.testng.annotations.Test;

public class Example3 {
	int age=25;
	void display() {
		System.out.println("I am display ");
		
	}
  @Test
  public void testcase1() {
	  System.out.println("I am TC1");
	  display();
  }
}

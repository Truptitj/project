package testNG;

import org.testng.annotations.Test;

public class AnnotationExpectedException {
	
  @Test(expectedExceptions=ArithmeticException.class)
  public void divideByZeroExample() {
	  System.out.println("Exception test");
	  int e=1/0;
	  System.out.println("Exception handling done");
  }
  @Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
  public void arrayIndexOfBoundExceptionEx() {
	  System.out.println("Array Index Exception test");
	  int age[]=new int[5];
	  age[5]=100;
  }
}

package testNG;

import org.testng.annotations.Test;

public class AnnotationInvocationCount {
  @Test(invocationCount=5)
  public void login() {
	  System.out.println("enter username and password and click on login");
  }
}

//invocationCount=2 then method wll be run 2 times
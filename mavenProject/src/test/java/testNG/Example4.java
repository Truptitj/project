package testNG;

import org.testng.annotations.Test;

public class Example4 {
	int age=25;
  @Test
  public void a_signup() {
	  System.out.println("I am signup");
  }
  @Test
  public void b_login() {
	  System.out.println("I am login");

  }
  @Test
  public void c_compose() {
	  System.out.println("I am compose");

  }
}

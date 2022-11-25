package testNG;

import org.testng.annotations.Test;

public class AnnotationPriority {
	
	@Test(priority=1)
  public void openBrowserAndAppUrl() {
		System.out.println("open browser and enter app URL");
  }
	@Test(priority=2)
	public void login() {
		System.out.println("Enter username and password and click on login button");

	}
	@Test(priority=3)
	public void createTask() {
		System.out.println("create task");

	}
	@Test(priority=4)
	public void logoutClose() {
		System.out.println("logout from app and close the broser");

	}
	
}
//by deault all methods priority is 0 

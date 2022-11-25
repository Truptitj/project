package testNG;

import org.testng.annotations.Test;

public class AnnotationDescription {
	@Test(priority=4)
	  public void openBrowserAndAppUrl() {
			System.out.println("open browser and enter app URL");
	  }
		@Test(priority=3, description="Login the app with valid input")
		public void login() {
			System.out.println("Enter username and password and click on login button");

		}
		@Test(priority=2)
		public void createTask() {
			System.out.println("create task");

		}
		@Test(priority=1)
		public void logoutClose() {
			System.out.println("logout from app and close the broser");

}
}
//description =if we want to add single line comment then we use

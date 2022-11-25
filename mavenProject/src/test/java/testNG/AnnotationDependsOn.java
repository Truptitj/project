package testNG;

import org.testng.annotations.Test;

public class AnnotationDependsOn {
	
	@Test(enabled=true)
	public void openBrowserAndAppURL() {    //this method will be fail bec Arithmetic Excption
		int i=10/0;
		System.out.println("Open browser and enter app url");
	}
	@Test(enabled=true, dependsOnMethods="openBrowserAndAppURL")
	public void login() {     //this method will be skip bec this is depends on openBrowserAndAppURL method
		System.out.println("enter username, password and click on login button");
	}
	@Test(enabled=true)
	public void createTask() {
		System.out.println("create new task");
	}
	@Test(enabled=true)
	public void logoutClose() {
		System.out.println("Logout from the application and close the browser");
	}
}

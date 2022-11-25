package testNG;

import org.testng.annotations.Test;

public class AnnotationEnable {
 
	@Test(enabled=false)
  public void openBrowserAndAppUrl() {
		System.out.println("open browser and enter URL");
  }
	@Test(enabled=true)
	public void login() {
		System.out.println("Enter username and password and click on login button");

	}
	@Test(enabled=false)
	public void cerateTask() {
		System.out.println("create task");

	}
	@Test(enabled=true)
	public void close() {
		System.out.println("close the browser");

	}
}
//by default all methods are enabled=true
//enabled=true....this will be execute
//enabled=true....this will be not execute

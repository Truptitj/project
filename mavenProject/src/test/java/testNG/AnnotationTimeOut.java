package testNG;

import org.testng.annotations.Test;

public class AnnotationTimeOut {
	
  @Test(timeOut=1000) //time in millisec
  public void executeTimeOut() throws InterruptedException {
	  Thread.sleep(500);
	  Thread.sleep(3000);  //this wll be fail bec thread time is 3s and we given timeOut=1s
  }
}

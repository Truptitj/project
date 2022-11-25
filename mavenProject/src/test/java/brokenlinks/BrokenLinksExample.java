package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinksExample {
  @Test
  public void testLinks() throws IOException {
	  System.setProperty("webdriver.chrome.driver",
			  "E:\\accelration\\Newfolder\\mavenProject\\executables\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demoqa.com/broken");
	  //storing the links in a list and traversing through the links
	  List<WebElement> links=driver.findElements(By.tagName("a"));
	  //count os the links
	  System.out.println("count of links are :"+links.size());
	  //checking the fetched links
	  for(int i=0;i<links.size();i++) {
		  WebElement E1=links.get(i);
		  String url=E1.getAttribute("href");
		  verifylinks(url);
	  }
	  driver.quit();
  }

  private void verifylinks(String linkurl) throws IOException {
	  try {
	  URL url= new URL(linkurl);
	  
	  HttpURLConnection httpURLConnect=(HttpsURLConnection)url.openConnection();
	  httpURLConnect.setConnectTimeout(5000);
	  if(httpURLConnect.getResponseCode()>400) {
		  System.out.println("linkurl"+httpURLConnect.getResponseMessage()+"is a broken link");
	  }
	  else {
		  System.out.println("linkurl"+httpURLConnect.getResponseMessage());
	  }
	  }catch (Exception e) {
}
}
}

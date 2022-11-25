package testNGadvance;

import org.testng.annotations.Test;

public class DataProvider {
  @Test(dataProvider="getData")
  public void setData(String username, String password) {
	  System.out.println("u have provided username as :"+username);
	  System.out.println("u have provided password as :"+password);

  }
  
   @org.testng.annotations.DataProvider
  public Object getData() {
	  /*Rows=no of times ur test has to be repeated
	  Col=no of parameters in test data	*/	
	  
	  Object data[][]=new Object[3][2];
	  data[0][0]="admin";
	  data[0][1]="admin";
	  
	  data[1][0]=" ";
	  data[1][1]=" ";

	  data[2][0]="trupti";
	  data[2][1]="trup";
	  return data;


  }
}
//how to create data provider=data provider is equals to dataprovider method name
//dataprovider=one test case try with limited set of data we use dataprovider
//XML=test each and every method with diff data
//EXCEL=TEST ONE APP WITH DIFF TYPE OF DATA
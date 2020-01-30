package day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
  @Test(dataProvider ="credentials")
  public void f(String un,String pwd) {
	  
	  System.out.println(un+" and "+pwd);
	  
	  
  }
  
  @DataProvider
  public Object[][] credentials()
  {
	  return new Object[][] {
		  new Object[] {"demo","Password"},
		  new Object[] {"demo2","Pasword"}
		  };
	}
 }
  


package day1;

import org.testng.annotations.Test;

public class NewTest {
  @Test(groups= {"smoke","sanity"})
  public void method1() {
	  System.out.println("method1");
  }
  @Test(groups= {"Regression"})
  public void method2() {
	  System.out.println("method2");
  }
  @Test(groups= {"sanity"})
  public void method3() {
	  System.out.println("method3");
  }
  
}

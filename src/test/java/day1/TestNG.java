package day1;

import org.testng.annotations.Test;

public class TestNG {
  @Test(priority=1, enabled=false )
  public void method1() {
	  System.out.println("Method1");
  }
  @Test(priority=1, enabled=true )
  public void method2()
  {
	  System.out.println("method2");
  }
  @Test(priority=1, dependsOnMethods="method2" )
  public void method3()
  {
	  System.out.println("method3");
  }
}

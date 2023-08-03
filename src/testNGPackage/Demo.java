package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test 
  public void f() {
	  //System.out.println("This is TestNG Demo class!");
	//  Reporter.log("This is TestNG Demo class!");
	    Reporter.log("This is TestNG Demo class!", true);
  }
}

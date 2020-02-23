package Run;

import org.testng.annotations.Test;

import Com.pages.Home;
import Common.browsers;

import org.testng.annotations.DataProvider;

public class testdata2 extends browsers{
	
  @Test(dataProvider = "signin")
  public void f(String n, String s) throws InterruptedException {
	  Home h= new Home(driver);
		h.Emailidfield("n");
		h.psswordfield("s");
		h.loginbt();
		driver.navigate().back();  
		h.empty();
		Thread.sleep(5000);
		  
	  
	  
	  
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      
      
      
      
      
    };
  }
}

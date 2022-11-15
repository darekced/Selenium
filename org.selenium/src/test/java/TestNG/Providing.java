package TestNG;

import org.testng.annotations.Test;

import Common.Utilities;
import Facebook.Pages.Home;

import org.testng.annotations.DataProvider;

public class Providing extends Utilities{
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  Home home=new Home(driver);
	  Thread.sleep(3000);
	  home.FieldToEmail(n);
	  Thread.sleep(3000);
	  home.PsswdToField(s);
	  Thread.sleep(3000);
	  home.loginbtclick();
	  driver.navigate().back();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "tested", "pssword" },
      new Object[] { "tested22", "b8" },
      new Object[] { "", "b8" },
      
    };
  }
}

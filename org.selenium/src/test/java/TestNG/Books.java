package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon_Pages.Home;
import Amazon_Pages.StopOver;
import Common.Utilities;



public class Books extends Utilities {
	
  @Test(priority = 1)
  public void f() {
	  Home home =new Home(driver);
	  home.KindleBooksClick();
	  String ur=driver.getCurrentUrl();
	  System.out.println(ur);
	  SoftAssert sk=new SoftAssert();
	  sk.assertEquals(ur, "https://www.amazon.com/kindle-dbs/storefront?storeType=browse&node=154606011");
	  Amazon_Pages.Books books=new Amazon_Pages.Books(driver);
	  books.stopover();
	  StopOver stopover=new StopOver(driver);
	  stopover.ReadListenClick();
	  int link= driver.findElements(By.tagName("a")).size();
	  System.out.println("Total number of links ="+link);
	  
	  int homelinked=driver.findElements(By.linkText("Amazon Home")).size();
	  System.out.println("Amazon home count="+homelinked);
	  if(homelinked==1)	{
	  driver.findElement(By.linkText("Amazon Home")).click();
	  }else {	 
		  System.out.println("Element is not displayed");
	  }  
	  sk.assertAll();
  }
	  @Test(priority = 2)
	  public void SearchFieldVerification()	{
	  	Home home=new Home(driver);
	  	home.LogoToClick();
	  	home.SearchFieldKeys();
	  	home.SearchToClick();
	  	
	  	
  }
}
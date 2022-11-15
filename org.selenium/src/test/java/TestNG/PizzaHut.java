package TestNG;

import org.testng.annotations.Test;

import PizzaHut.HomePage;
import PizzaHut.SecondPage;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class PizzaHut {
	WebDriver driver;
	  @Test(priority = 1)
	  public void f() {
		  HomePage home =new HomePage(driver);
		  home.PizzaHutMenuButton();
		  home.PizzaButton();
		  
	  }
		  
	  
		  @Test(priority = 2,dependsOnMethods = "f")
		  public void SecondPageVerification()	{
		  	SecondPage second=new SecondPage(driver);
		  	second.GetStartedButton();
		  	second.DeliveryButton();
		  	second.AddressField();
		  	second.Address2Field();
		  	second.FinishToClick();
	  }
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  Ibrowsers ("Chrome");	
	  }

	  @AfterClass
	  public void afterClass() throws IOException {
		  Screenshots();
	  }
	  public void Ibrowsers (String NameOfBrowser) {
		  if(NameOfBrowser.equalsIgnoreCase("Chrome"))	{
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\darek\\eclipse-workspace\\org.selenium\\DRIVERS\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.pizzahut.com/");
				driver.manage().window().maximize();
		  }else if(NameOfBrowser.equalsIgnoreCase("Edge")	) {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\darek\\eclipse-workspace\\org.selenium\\DRIVERS\\msedgedriver.exe");
			  driver=new EdgeDriver();
			  driver.get("https://www.pizzahut.com/");
			  driver.manage().window().maximize();
		  }
		}
	  public void Screenshots() throws IOException	{
			Date ob=new Date();
			System.out.println(ob);
			String files=	ob.toString().replace(" ","_").replace(":","_");
			System.out.println(files);
		File HomePage=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(HomePage, new File("C:\\Users\\darek\\eclipse-workspace\\org.selenium\\pictures\\"+files+"Pizza.png" ));
	}
	}

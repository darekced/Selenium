package com.train.org.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ibrowser {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darek\\eclipse-workspace\\org.selenium\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		WebElement signmeup=driver.findElement(By.linkText("Create new account"));
		signmeup.click();
		
		Thread.sleep(6000);
		
		WebElement FN= driver.findElement(By.name("firstname"));
		FN.sendKeys("Darek");
		
		WebElement LN= driver.findElement(By.name("lastname"));
		LN.sendKeys("Cedrowski");
		
		WebElement email= driver.findElement(By.name("reg_email__"));
		email.sendKeys("dc_rocks_03@hotmail.com");
		
		WebElement newpass= driver.findElement(By.name("reg_passwd__"));
		newpass.sendKeys("ayoo");
		
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select ob=new Select(month);
		ob.selectByIndex(5);
		
		WebElement monthday= driver.findElement(By.name("birthday_day"));
		Select on=new Select(monthday);
		on.selectByValue("29");
		
		WebElement yearz= driver.findElement(By.name("birthday_year"));
		Select os=new Select(yearz);
		os.selectByValue("1993");
		
		WebElement MaleButton=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		MaleButton.click();
				
		WebElement SignButton=driver.findElement(By.xpath("(//button[text()='Sign Up' and @name='websubmit'])"));
		SignButton.click();
	
	}

}

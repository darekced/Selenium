package com.train.org.org.selenium;

import java.util.Iterator;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;

public class MultipleWindowsSwitch {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darek\\eclipse-workspace\\org.selenium\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,null);
		WebElement Kindle=driver.findElement(By.linkText("Kindle Books"));
		Actions ob= new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		Kindle.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String> windowsoi =driver.getWindowHandles(); 
		Iterator<String> iterator=windowsoi.iterator();
		String FirstWindowHandle=iterator.next();
		String SecondWindowHandle=iterator.next();
		driver.switchTo().window(SecondWindowHandle);
		System.out.println(FirstWindowHandle);
		System.out.println(SecondWindowHandle);
		//Thread.sleep(4000);
		WebElement Emily=driver.findElement(By.linkText("The Other Emily"));
		Emily.click();
		
	}

}

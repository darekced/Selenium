package com.train.org.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionToControl {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darek\\eclipse-workspace\\org.selenium\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement Signed=driver.findElement(By.id("nav-link-accountList"));
		Actions act=new Actions(driver);
		act.moveToElement(Signed).build().perform();
		Thread.sleep(6000);
		WebElement PrimeMembership=driver.findElement(By.xpath("//*[text()='Prime Membership']"));
		act.moveToElement(PrimeMembership).click().build().perform();
		driver.switchTo().parentFrame();
		
		WebElement Resizable=driver.findElement(By.linkText("Resizable"));
		Resizable.click();
	}

}

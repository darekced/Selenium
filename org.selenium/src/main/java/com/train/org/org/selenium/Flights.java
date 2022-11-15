package com.train.org.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flights {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darek\\eclipse-workspace\\org.selenium\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.expedia.com/Flights");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		
		Thread.sleep(3000);
		WebElement button= driver.findElement(By.id("d1-btn"));
		button.click();
		Thread.sleep(3000);

		WebElement reverse= driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-only-icon uitk-layout-flex-item uitk-button-paging']"));
		reverse.click();
		

		driver.findElement(By.xpath("//*[@aria-label='Oct 21, 2022']")).click();
		driver.findElement(By.xpath("//*[@aria-label='Oct 26, 2022']")).click();
		
		WebElement done= driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']"));
		done.click();
		
		
	}

}

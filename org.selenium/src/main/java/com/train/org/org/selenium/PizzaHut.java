package com.train.org.org.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PizzaHut {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darek\\eclipse-workspace\\org.selenium\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.pizzahut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		Thread.sleep(3000);
		
		WebElement Pizza=driver.findElement(By.linkText("Pizza"));
		Pizza.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='primary-cta-button-get-started']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6' and @data-testid='delivery-occasion-tab']")).click();
		Thread.sleep(2000);
		
		WebElement address= driver.findElement(By.id("w2-address"));
		address.sendKeys("ayoo street");
		
		WebElement address2= driver.findElement(By.xpath("//input[@placeholder='Apt/Ste']"));
		address2.sendKeys("ayoo");
		
		WebElement city= driver.findElement(By.xpath("//input[@placeholder='City']"));
		city.sendKeys("nyc");
		
		WebElement state= driver.findElement(By.xpath("//input[@placeholder='XX']"));
		state.sendKeys("ny");
		
		WebElement zip= driver.findElement(By.xpath("//input[@placeholder='XXXXX']"));
		zip.sendKeys("11222");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-fullWidth']")).click();
		
		Thread.sleep(2000);

		Screenshots();
	}

	public static void Screenshots() throws IOException	{
		File HomePage=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(HomePage, new File("C:\\Users\\darek\\eclipse-workspace\\org.selenium\\pictures\\PIZZA.png" ));
}}

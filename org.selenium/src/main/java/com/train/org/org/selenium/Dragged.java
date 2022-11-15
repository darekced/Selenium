package com.train.org.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragged {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darek\\eclipse-workspace\\org.selenium\\DRIVERS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement draggedit=driver.findElement(By.id("draggable"));
		WebElement droppedit=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(draggedit, droppedit).build().perform();
		
		driver.switchTo().parentFrame();
		
		WebElement Resizable=driver.findElement(By.linkText("Resizable"));
		Resizable.click();
	}

}

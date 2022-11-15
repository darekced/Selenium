package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StopOver {
	WebDriver driver;
@FindBy(linkText = "Read and Listen for Free") WebElement readis;
public void ReadListenClick()	{
	readis.click();
}
public StopOver(WebDriver driver)	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
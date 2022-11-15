package PizzaHut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {

	WebDriver driver;
	@FindBy(xpath= "//button[@data-testid='primary-cta-button-get-started']") WebElement GetStarted;
	@FindBy(xpath= "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6' and @data-testid='delivery-occasion-tab']") WebElement Delivery;
	@FindBy(id= "w2-address") WebElement Address;
	@FindBy(xpath= "//input[@placeholder='Apt/Ste']") WebElement Address2;
	@FindBy(xpath= "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-fullWidth']") WebElement FinishButton;

public void GetStartedButton()	{
	GetStarted.click();
}
public void DeliveryButton()	{
	Delivery.click();
}

public void AddressField()	{
	Address.sendKeys("ayoo street");

}
public void Address2Field()	{
	Address2.sendKeys("ayoo");
}
	public void FinishToClick()	{
		FinishButton.click();
	}
	
public SecondPage(WebDriver driver)	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
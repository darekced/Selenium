package PizzaHut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath = "//span[@class='MuiButton-label']")	WebElement MenuButton;
	@FindBy(linkText = "Pizza")	WebElement PizzaPie;
	@FindBy(xpath = "//span[@class='MuiButton-label']")	WebElement Clicky;
	@FindBy(linkText = "Pizza") WebElement Delivery;
	@FindBy(id = "w2-address") WebElement Address;
	@FindBy(xpath = "//input[@placeholder='Apt/Ste']") WebElement Address2;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-fullWidth']") WebElement FinishButton;

	
	public void PizzaHutMenuButton()	{
		MenuButton.click();
	}
		public void PizzaButton()	{
			PizzaPie.click();
	}
		
		public void GetStartedButton()	{
			Clicky.click();
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
	public HomePage(WebDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

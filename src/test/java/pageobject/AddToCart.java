package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	WebDriver ldriver;

	public AddToCart(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}

	@FindBy(linkText = "Marketplace")
	WebElement Marketplace;
	
	@FindBy(linkText = "Antibodies & Immunoassays")
	WebElement AntibodiesImmunoassays;
	
	@FindBy(linkText = "Primary Antibodies")
	WebElement PrimaryAntibodies;

	
	
	
	public void mouseHoverMarketPlace()
	{
		Actions mouseHover = new Actions(ldriver);
		mouseHover.moveToElement(Marketplace).perform();
	}
	
}

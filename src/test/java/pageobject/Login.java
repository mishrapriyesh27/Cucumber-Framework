package pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriver ldriver;

	public Login(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}

	@FindBy(xpath ="//a[normalize-space()='I understand']")
	WebElement iUnderstandCookie;
	
	@FindBy(xpath ="//input[@value='Agree and Proceed']")
	WebElement agreeandProceedCookie;

	@FindBy(linkText = "Log In")
	WebElement HomeLoginBtn;
	
	@FindBy(id = "idp-discovery-username")
	WebElement email;

	@FindBy(id= "idp-discovery-submit")
	WebElement next;

	@FindBy(id="okta-signin-password")
	WebElement password;

	@FindBy(id = "okta-signin-submit")
	WebElement LoginBtn;
		

	public void acceptCookie() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(iUnderstandCookie));
		wait.until(ExpectedConditions.elementToBeClickable(iUnderstandCookie));
		wait.until(ExpectedConditions.visibilityOf(agreeandProceedCookie));
		wait.until(ExpectedConditions.elementToBeClickable(agreeandProceedCookie));
		iUnderstandCookie.click();
		agreeandProceedCookie.click();
		String currentWindowHandle = ldriver.getWindowHandle();
		ldriver.switchTo().window(currentWindowHandle);
	}
	public void enterEmail(String emailAdd)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(email));
		wait.until(ExpectedConditions.elementToBeClickable(email));
		email.clear();
		email.sendKeys(emailAdd);
	}
	public void clikOnNext()
	{
		next.click();
	}
	public void enterPassword(String pwd)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(password));
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.clear();
		password.sendKeys(pwd);
	}

	public void clickOnHomeLoginButton()
	{
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(HomeLoginBtn));
		wait.until(ExpectedConditions.elementToBeClickable(HomeLoginBtn));
		HomeLoginBtn.click();
	}
	public void clickOnLoginButton()
	{
		LoginBtn.click();
	}

	//	public void clickOnLogOutButton()
	//	{
	//		logout.click();
	//	}
}

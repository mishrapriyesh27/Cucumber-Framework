package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Login;
import utilities.ReadConfig;

public class StepDefinition extends BaseClass {
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		runBrowser();
		driver.manage().window().maximize();
		login = new Login(driver);
	}
	
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	   driver.get(url);
	   login.acceptCookie();
	   String expectedTitle="ZAGENO | The multi-supplier marketplace for life science products";
	   String actualTitle= driver.getTitle();
	   if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		   Assert.assertTrue(true);
	   }else {
		   Assert.assertTrue(false);
	   }
	}

	@When("Clicks on Login")
	public void clicks_on_login() {
		login.clickOnHomeLoginButton();
	}

	@When("User enters Email as {string}")
	public void user_enters_email_as(String emailAdd) {
		login.enterEmail(emailAdd);
	}

	@When("User clicks on Next")
	public void user_clicks_on_next() {
		login.clikOnNext();
	}

	@When("user enters Password as {string}")
	public void user_enters_password_as(String password) {
		login.enterPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		login.clickOnLoginButton();
	}

	@Then("close browser")
	public void close_browser() throws InterruptedException {
	    Thread.sleep(20000);
		driver.close();
		driver.quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

		if(scenario.isFailed())
		{
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}

}

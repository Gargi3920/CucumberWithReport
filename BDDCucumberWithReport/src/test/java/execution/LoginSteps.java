package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import qa.DriverFactory;

public class LoginSteps {
	
	LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	static String title ;
	@Given("User is at landling page")
	public void user_is_at_landling_page() {
	  WebDriver   driver =  DriverFactory.getDriver();
	   driver.get("https://www.amazon.in/");
	  
	}

	@When("User gets the title of page")
	public void user_gets_the_title_of_page() {
	    title = loginpage.getTitleOfpage();
	}

	@Then("Title of page should contains {string}")
	public void title_of_page_should_contains(String string) {
	  
		boolean ispresent = title.contains(string);
		
		Assert.assertEquals(ispresent, true);
		
		
	}

	@Then("cart icon should display")
	public void cart_icon_should_display() {
	   
		boolean isdisplaying = loginpage.verifyCartIcon();
		
		Assert.assertEquals(isdisplaying, true);
	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	  
		loginpage.enterUsername(string);
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	   loginpage.enterPassword(string);
	}

	@When("User confirms signin")
	public void user_confirms_signin() {
	  loginpage.finalSignin();
	}
		
	}

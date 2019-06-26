package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;
	@Given("USer is on home page")
	public void user_is_on_home_page() {
		System.out.println("It is home page");
	   
	   System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("https://the-internet.herokupp.com/login");
		
	}

	@When("user enters username and password.")
	public void user_enters_username_and_password() {
		LoginObjectRepository rep= new 	LoginObjectRepository(driver);
		
		System.out.println("Enter username and password");
		rep.usern.sendKeys("tomsmith");
		rep.passw.sendKeys("SuperSecretPassword!");
		rep.login.click();
			

	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		
		System.out.println("User logged in");
		driver.close();
	  
	}

}

package TestCase;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class TestCase {
	WebDriver driver;
	@Given("user launches IE And navigate to application url http:\\/\\/newtours.demoaut.com\\/")
	public void user_launches_IE_And_navigate_to_application_url_http_newtours_demoaut_com() {
		System.out.println("open newtour application");
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	    
	}

	@When("user enter username as {string} in username field")
	public void user_enter_username_as_in_username_field(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enter Postal Password as {string} in password field")
	public void user_enter_Postal_Password_as_in_password_field(String psd) {
		driver.findElement(By.name("password")).sendKeys(psd);
	}

	@When("user click on signIn button")
	public void user_click_on_signIn_button() {
		//Actions a=new Actions(driver);
		//WebElement e = driver.findElement(By.name("login"));
		//a.moveToElement(e).click().perform();
		
		 driver.findElement(By.name("login")).click();
		 
	    
	}

	@Then("user validate Login successss")
	public void user_validate_Login_successss() {
		Assert.assertTrue(driver.getTitle().contains("Find"));
	    driver.quit();
	}


}

package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDef {
	WebDriver driver;
	String actualTitle;
	
	 @Given("^: User is on Login Page$")
	    public void _user_is_on_login_page() throws Throwable {
		 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	    }

	    @When("^: Title should be equal to OrangeHRM$")
	    public void _title_should_be_equal_to_orangehrm() throws Throwable {
	    	actualTitle = driver.getTitle();
	    	Assert.assertEquals("OrangeHRM", actualTitle);
	    }

	    @Then("^: Close the browser$")
	    public void _close_the_browser() throws Throwable {
	    	driver.quit();
	    }
	    
	    @When("^: User enters username and user enters password$")
	    public void _user_enters_username_and_user_enters_password() throws Throwable {
	    	WebElement email = driver.findElement(By.id("txtUsername"));
			email.sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    }

	    @And("^: Clicks on login button$")
	    public void _clicks_on_login_button() throws Throwable {
	    	driver.findElement(By.id("btnLogin")).click();
	    }
	    
	    @Then("^: User should be on dashboard page$")
	    public void _user_should_be_on_dashboard_page() throws Throwable {
	    	System.out.println("verification step");
	    }

	    /*@When(": User enters {string} and user enters {string}")
	    public void user_enters_and_user_enters(String username, String password) {
	        // Write code here that turns the phrase above into concrete actions
	    	WebElement email = driver.findElement(By.id("txtUsername"));
			email.sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
	    }*/
	    
	    @When("^: User enters (.+) and user enters (.+)$")
	    public void _user_enters_and_user_enters(String username, String password) throws Throwable {
	    	WebElement email = driver.findElement(By.id("txtUsername"));
			email.sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
	    }

}

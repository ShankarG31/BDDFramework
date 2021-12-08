package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	    }

	    @When("^: The user gets to the title of the page$")
	    public void _the_user_gets_to_the_title_of_the_page() throws Throwable {
	    	actualTitle = driver.getTitle();
	    	
	    }

	    @Then("^: Title should be equal to OrangeHRM$")
	    public void _title_should_be_equal_to_orangehrm() throws Throwable {
	        Assert.assertEquals("OrangeHRM", actualTitle);
	        driver.quit();
	    }

}

package Steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	WebDriver driver=new ChromeDriver();
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    driver.manage().window().maximize();
	}
	
	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) {
	    driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}


	@And("Clicks on the login button")
	public void clicks_on_the_login_button() {
	    driver.findElement(By.id("submit")).click();
	}
	
	@Then("the application should see {string}")
	public void the_application_should_see(String message) {

		if(message.equalsIgnoreCase("Logged In Successfully")) {
			String success=driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).getText();
			System.out.println("Status for login: "+success);
		}
		else {
			String fail=driver.findElement(By.xpath("//div[@id='error']")).getText();
			System.out.println("Status for login: "+fail);
		}
	}
	

}

package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//locators
	By username=By.id("username");
	By password=By.id("password");
	
	By loginButton=By.id("submit");
	By logout=By.xpath("//a[text()='Log out']");
	
	//methods
	
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	public void clickLogout() {
		driver.findElement(logout).click();
	}

}

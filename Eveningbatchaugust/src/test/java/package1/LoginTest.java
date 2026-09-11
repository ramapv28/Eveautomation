package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void loginTest() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		LoginPage login=new LoginPage(driver);//created object for LoginPage to access methods
		
		
		login.enterUsername("student");
		login.enterPassword("Password123");
		login.clickLogin();
		
		login.clickLogout();
		
	}

}

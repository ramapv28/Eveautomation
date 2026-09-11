package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datapro {
	
	@DataProvider(name="testing")
	public Object[][] getData(){
		return new Object[][] {
			{"Rama","Test123"},
			{"Adhi","123"},
			{"dfdsf","wrongpass"}
		};
	}
	
	@Test(description="verify login with multiple credentials",dataProvider="testing")
	public void testFaceBookTitle(String username,String password) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
	}

}

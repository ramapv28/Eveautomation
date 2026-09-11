package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	@Test
	public void googleTest() {
		//create spark report
		
		ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReport.html");
		
		//Create Extent report
		ExtentReports extent=new ExtentReports();
		
		//attach report
		extent.attachReporter(spark);
		
		//Test entry creation
		ExtentTest test=extent.createTest("Google Test");
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		test.info("Browser opened");
		
		
		driver.get("https://www.googl.com/");
		test.info("Google opened");
		
		driver.manage().window().maximize();
		test.info("Screen maximized");
		
		String title=driver.getTitle();
		
		if(title.equals("Google")) {
			test.pass("Title verified");
		}
		else {
			test.fail("Title mismatch!!");
		}
		
		driver.close();
		test.info("Browser closed");
		
		//Generate report
		extent.flush();
	}
}

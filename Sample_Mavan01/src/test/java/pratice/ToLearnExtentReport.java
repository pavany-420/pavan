package pratice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
	@Test
	public void addScreenshot()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("wowo123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hey@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		
		String time = LocalDateTime.now().toString().replace(":", "-");
		ExtentSparkReporter ref=new ExtentSparkReporter("./HTML.reports/extentreports"+time+".html");
		ExtentReports ref1=new ExtentReports();
		ref1.attachReporter(ref);
		ExtentTest test=ref1.createTest("addScreenshot");
		test.log(Status.PASS, "Add ScreenShot");
		test.addScreenCaptureFromBase64String(screenshot);
		ref1.flush();
	}
}

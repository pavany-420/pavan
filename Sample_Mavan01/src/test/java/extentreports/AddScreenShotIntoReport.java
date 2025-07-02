package extentreports;

import java.lang.foreign.ValueLayout.OfShort;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddScreenShotIntoReport {
	@Test
	public void addScreenShot()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		String screen = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter ref=new ExtentSparkReporter("./HTML.reports/extentReports1.html");
		ExtentReports ref1=new ExtentReports();
		ref1.attachReporter(ref);
		ExtentTest test = ref1.createTest("addScreenShot");
		test.log(Status.INFO, "Add TakeScreenShot");
		test.addScreenCaptureFromBase64String(screen);
		ref1.flush();
	}
}

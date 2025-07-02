package extentreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
	@Test
	public void createReport()
	{
		//Step 1 create ExtentSparkReport object
		ExtentSparkReporter ref=new ExtentSparkReporter("./HTML.reports/extentreportes.html");
		//step 2 create ExtentReports object
		ExtentReports ref1=new ExtentReports();
		//Step 3 attach ExtentSparkReporter to ExtentReport
		ref1.attachReporter(ref);
		//Step 4 create ExtentTest object
		ExtentTest test = ref1.createTest("createReport");
		// Step 5 call log(Status,"message")
		test.log(Status.PASS, "log message added into report");
		//Step 6 call flush()
		ref1.flush();
	}
}

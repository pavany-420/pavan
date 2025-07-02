package cars;

import java.lang.annotation.Repeatable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AudiTest {
	@Test
	public void launch()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://auditestdrive.in/");
		Reporter.log("AudiTest Executed",true);
	}
}

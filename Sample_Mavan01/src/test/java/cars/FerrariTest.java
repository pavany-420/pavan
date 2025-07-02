package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FerrariTest {
	@Test
	public void launch()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("FerrariTest Executed",true);
	}
}

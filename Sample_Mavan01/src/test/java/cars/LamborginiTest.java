package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LamborginiTest {
	@Test
	public void launch()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.lamborghini.com/en-en#val-ht");
		Reporter.log("LamborginiTest Executed",true);
	}
}

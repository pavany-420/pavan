package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMWTest {
	@Test
	public void launch()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bmw-kunexclusive-bengaluru.in/");
		Reporter.log("BMWTest Executed",true);
	}

}

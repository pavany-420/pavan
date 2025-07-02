package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMWBikesTest {
	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("BMWBikesTest executed",true);
	}
}

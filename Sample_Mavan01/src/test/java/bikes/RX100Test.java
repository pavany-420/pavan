package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RX100Test {
	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/yamaha-bikes/rx-100/");
		Reporter.log("RX100Test executed",true);
	}
}

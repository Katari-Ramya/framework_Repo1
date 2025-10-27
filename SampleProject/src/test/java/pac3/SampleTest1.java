package pac3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class SampleTest1 {
	RemoteWebDriver driver;
	
	@Parameters("browserName")
	@Test
	public void sampleTest(String bN) throws MalformedURLException {
		
		URL ipAdd = new URL("http://3.27.63.39.4444");

		if(bN.equals("edge"))
		{
			EdgeOptions option = new EdgeOptions();
			driver = new RemoteWebDriver(ipAdd, option);

		}
		else if (bN.equals("chrome")) {
			ChromeOptions option = new ChromeOptions();
			driver = new RemoteWebDriver(ipAdd, option);

		}
		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}

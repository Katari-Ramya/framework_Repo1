package pac3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SampleTest2 {
	@Test
	public void sampleTest() throws MalformedURLException {
		ChromeOptions option = new ChromeOptions();
		URL ipAdd = new URL("http://3.27.63.39.4444");
		RemoteWebDriver driver = new RemoteWebDriver(ipAdd, option);
		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}

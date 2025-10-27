//package pac4;
//
//import java.net.URL;
//import java.util.HashMap;
//
//import org.openqa.selenium.MutableCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.Test;
//
//public class BrowserStackCode {
//	
//	@Test
//	public void sampleTest()
//	{
//		String username="";
//		String password ="";
//		
//		MutableCapabilities capabilities = new MutableCapabilities();
//		HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
//		capabilities.setCapability("browserName", "Chrome");
//		bstackOptions.put("os", "Windows");
//		bstackOptions.put("osVersion", "10");
//		bstackOptions.put("browserVersion", "120.0");
//		bstackOptions.put("userName", "YOUR_USERNAME");
//		bstackOptions.put("accessKey", "YOUR_ACCESS_KEY");
//		bstackOptions.put("consoleLogs", "info");
//		capabilities.setCapability("bstack:options", bstackOptions);
//
//		RemoteWebDriver driver = new RemoteWebDriver(new URL("", capabilities));
//		
//		driver.get("https://www.google.com/");
//		
//		System.out.println(driver.getTitle());
//		
//		driver.close();
//	}
//
//}

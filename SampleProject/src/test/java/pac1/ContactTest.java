package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createOrgTest()
	{
		
		String URL =System.getProperty("url");
		String BROWSER =System.getProperty("Browser");
		String USERNAME =System.getProperty("Username");
		String PASSWORD =System.getProperty("Password");

		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createOrgTest ");
	}
	
	@Test
	public void modifyOrgTest()
	{
		System.out.println("execute modifyOrgTest");
	}

}

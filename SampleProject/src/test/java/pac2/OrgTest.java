package pac2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest()
	{
		System.out.println("execute createOrgTest ");
		
		String URL =System.getProperty("url");
		String BROWSER =System.getProperty("Browser","chrome");
		String USERNAME =System.getProperty("Username");
		String PASSWORD =System.getProperty("Password");

		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

	@Test
	public void modifyOrgTest()
	{
		System.out.println("execute modifyOrgTest ");
	}

}

package project_1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser","Chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(PASSWORD);
		System.out.println("execute createContactTest");
	}
	@Test
	public void modifyContactTest() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser","Chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(PASSWORD);
		System.out.println("execute modify contact test");
	}

}

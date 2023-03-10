package practice;

import org.testng.annotations.Test;

public class PracticeClass1 {
	
	@Test
	public void main1() {
		String url = System.getProperty("url");
		System.out.println("Test1 --> abcd");
		System.out.println("URL of Application ==> "+url);
	}
	
	@Test
	public void main11() {
		String browser = System.getProperty("browser");
		System.out.println("Test1 --> xyz");
		System.out.println("Browser Name ==> "+browser);
	}

}

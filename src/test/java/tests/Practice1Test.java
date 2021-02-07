package tests;

import setup.Setup;

public class Practice1Test extends Setup {
	
	
	
	public void pageTest1() throws InterruptedException {
		
		getDriver().get("https://www.google.com");
		Thread.sleep(5000);
	}

}

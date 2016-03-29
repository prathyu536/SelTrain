package com.csrk.seltrain.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BasicTest {
	
	@Test
	public void loginTest(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://24.106.206.2:10080/autotools");
	}
	

}

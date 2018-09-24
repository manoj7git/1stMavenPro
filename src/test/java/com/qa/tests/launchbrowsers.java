package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchbrowsers {
	
	public WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\me\\Study\\Selenium\\Downloads\\Browser_drivers\\Firefox\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.get("google.com");
		driver.navigate().to("http://www.google.com");
		driver.quit();
	}
	
	

}

package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchbrowsers {
	
	public WebDriver driver;
	
	@Test
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\me\\Study\\Selenium\\Downloads\\Browser_drivers\\Firefox\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.quit();
	}
	
	

}

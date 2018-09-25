package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class launchbrowsers {
	
	public WebDriver driver;
	String pagetitle;
	
	
	
	@Test (priority = 1)
	public void firefoxbrowser() throws InterruptedException {
		
		//1. FF browser
		System.setProperty("webdriver.gecko.driver",
				"D:\\me\\Study\\Selenium\\Downloads\\Browser_drivers\\Firefox\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, "Google"); // Hard assert: If fails, then execution stops then & there itself and
													// does not proceed further to execute the rest of the test steps.

		driver.quit();
		
	}
	
	/*
	@Test (priority = 2)
	public void chromebowser() throws InterruptedException {		
		
		//2. Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\me\\Study\\Selenium\\Downloads\\Browser_drivers\\Chrome\\chromedriver_win32_v2.42\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.apowersoft.com/free-online-screen-recorder");
		Thread.sleep(2000);
		pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, "Apowersoft Free Online Screen Recorder - Web-based Screen recorder");
		driver.quit();

	}*/
	
	
	@Test (priority = 3)
	public void iebowser() throws InterruptedException {
		
		
		//3. IE browser
		System.setProperty("webdriver.ie.driver",
				"D:\\me\\Study\\Selenium\\Downloads\\Browser_drivers\\IE\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.apowersoft.com/free-online-screen-recorder");
		Thread.sleep(2000);
		pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, "Apowersoft Free Online Screen Recorder - Web-based Screen recorder");
		driver.quit();

	}
	
		

}

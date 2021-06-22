package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Loginpage;

public class Verify_login {
	WebDriver driver;

	@Test
	public void verifylogin() throws Exception, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Loginpage login1=new Loginpage(driver);

      	login1.loginToflipkart("9087967160","Tamilarasi");


	}



}
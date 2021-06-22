package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	By mob_num = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By login = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span");

	public Loginpage(WebDriver driver){
		this.driver = driver;
	}
	public void loginToflipkart(String strmobnum,String strPassword) throws Exception
	{
		
		driver.findElement(mob_num).sendKeys(strmobnum);
		Thread.sleep(3000);
		driver.findElement(password).sendKeys(strPassword);
		Thread.sleep(3000);
		driver.findElement(login).click();
		Thread.sleep(3000);
		


	}
	public void mobnum(String strmobnum){
		driver.findElement(mob_num).sendKeys(strmobnum);
	}
//	public void setPassword(String strPassword){
//		driver.findElement(password).sendKeys(strPassword);
//	}
//	public void clickLogin(){
//		driver.findElement(login).click();
//	}

}

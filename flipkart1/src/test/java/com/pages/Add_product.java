package com.pages;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Add_product {
	WebDriver driver;
	By mobile = By.xpath("//*[@id='container']/div/div[2]/div/div/div[3]/a/div[2]");
	By offer=By.xpath("//*[@id='container']/div/div[3]/div[9]/div/div[1]/a/div/img[2]");
	By select_mob = By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");
   // By email = By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[3]/div/div/div/div/div[5]/span[1]/form/input");
	public Add_product(WebDriver driver){
		this.driver = driver;
	}
	public void Addingproduct() throws Exception
	{

		driver.findElement(mobile).click();
		Thread.sleep(3000);
		driver.findElement(offer).click();
		Thread.sleep(3000);
		// Actions act = new Actions(driver);
        // act.moveToElement(driver.findElement(ent)).click().build().perform();
        
		driver.findElement(select_mob).click();
		Thread.sleep(3000);
		
		String currentHandle=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		for(String actual: s) {
			if(!actual.equalsIgnoreCase(currentHandle)) {
				//Switch to the opened tab
				driver.switchTo().window(actual); 
				
				//opening the URL saved.

				driver.get("https://www.flipkart.com/poco-x3-pro-graphite-black-128-gb/p/itm736059fa07afb?pid=MOBGFKNFRJDN3DS4&lid=LSTMOBGFKNFRJDN3DS4PPS28U&marketplace=FLIPKART&store=tyy%2F4io&srno=b_1_1&otracker=clp_banner_1_9.bannerX3.BANNER_mobile-phones-store_2RE73I9L4KLV&fm=neo%2Fmerchandising&iid=3261888c-e034-413c-a6ff-3884e989d757.MOBGFKNFRJDN3DS4.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=sji7su76a80000001624332729452");
				By buy=By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button");
				driver.findElement(buy).click();
				Thread.sleep(3000);

				//driver.findElement(email).sendKeys("tamil6c@gmail.com");
				//Thread.sleep(5000);
				By cont=By.xpath("//*[@id='to-payment']/button");
				driver.findElement(cont).click();
				Thread.sleep(3000);
				//driver.switchTo().window(actual);
				//By pay=By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[4]/div/div/div[1]/div/label[6]/div[1]");
				//driver.findElement(pay).click();
				//Thread.sleep(3000);
				
			}
		}}
}





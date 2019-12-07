package org.Debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	


public class SampleDe {
	public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Robot\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	WebElement u = driver.findElement(By.id("identifierId"));
	u.sendKeys("suvethasuve1@gmail.com");
	WebElement b = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	b.click();
	Thread.sleep(1000);
	WebElement p= driver.findElement(By.name("password"));
	p.sendKeys("234567");
	
}

	
}



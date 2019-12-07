package org.Debug;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Over {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Robot\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement f = driver.findElement(By.xpath("//div[@id='footer-wrapper']"));
	WebElement e =driver.findElement(By.xpath("//div[@id='client-logo']"));
	js.executeScript("arguments[0].scrollIntoView(true)",f);
	Thread.sleep(5000);
	js.executeScript("argument[0].scrollIntoView(false)",e);
	
	
	}
	

}

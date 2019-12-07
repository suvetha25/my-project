package org.Debug;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	public static void main(String[] args) throws IOException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Robot\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement  a = driver.findElement(By.id("selenium_commands"));
		Select s = new Select(a);
		List<WebElement> a1 = s.getOptions();
		for(int i=0;i<a1.size();) {
			WebElement a2 = a1.get(i);
			String t =  a2.getText();
			System.out.println(t);
			i=i+2;
		}
			
		

	}
}

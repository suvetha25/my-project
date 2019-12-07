package org.Debug;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Screen {

		public static void main(String[] args) throws IOException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Robot\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		TakesScreenshot tk =(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desc =new File("C:\\Users\\admin\\eclipse-workspace\\Robot\\ScreenShot//suve.png");
	FileUtils.copyFile(src ,desc);
	}}
	
		
		

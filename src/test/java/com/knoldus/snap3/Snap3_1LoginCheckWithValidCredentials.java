package com.knoldus.snap3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



@Test
public class Snap3_1LoginCheckWithValidCredentials extends InputOutputObjects {
	
	

	public void checkLogin()
	{
		System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Automation/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(snap3Url);
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//login form presence 
		driver.findElement(loginSection).isDisplayed();
		
		driver.findElement(emailTextbox).isDisplayed();
		driver.findElement(emailTextbox).sendKeys("fandango@fandango.com");
		
		driver.findElement(pswdTextbox).isDisplayed();
		driver.findElement(pswdTextbox).sendKeys("tqNxsV6z4a");
		
		driver.findElement(buttonLogin).isDisplayed();
		driver.findElement(buttonLogin).click();
		
		url = driver.getCurrentUrl();
		url.equals("http://snap3-staging.platform3.co/dashboard");
		
		System.out.println("Login successful");
		
		driver.close();
		
		
	}
	

}

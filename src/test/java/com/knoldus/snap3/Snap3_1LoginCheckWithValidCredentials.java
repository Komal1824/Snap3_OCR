package com.knoldus.snap3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



@Test
public class Snap3_1LoginCheckWithValidCredentials {
	
	
	public void checkLogin()
	{
		System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Automation/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://snap3-staging.platform3.co/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		
	}
	

}

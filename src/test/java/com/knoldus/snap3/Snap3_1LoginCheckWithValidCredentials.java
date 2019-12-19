package com.knoldus.snap3;

import org.openqa.selenium.By;
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
		//login form presence 
		driver.findElement(By.xpath("//form[@class='login-form']")).isDisplayed();
		
		driver.findElement(By.xpath("//form[@class='login-form']//input[@name='email']")).isDisplayed();
		driver.findElement(By.xpath("//form[@class='login-form']//input[@name='email']")).sendKeys("fandango@fandango.com");
		
		driver.findElement(By.xpath("//form[@class='login-form']//input[@name='password']")).isDisplayed();
		driver.findElement(By.xpath("//form[@class='login-form']//input[@name='password']")).sendKeys("tqNxsV6z4a");
		
		driver.findElement(By.xpath("//button[contains(.,'Login ')]")).isDisplayed();
		driver.findElement(By.xpath("//button[contains(.,'Login ')]")).click();
		
		url = driver.getCurrentUrl();
		url.equals("http://snap3-staging.platform3.co/dashboard");
		
		System.out.println("Login successful");
		
		driver.close();
		
		
	}
	

}

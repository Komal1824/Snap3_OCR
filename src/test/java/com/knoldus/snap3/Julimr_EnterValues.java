package com.knoldus.snap3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Julimr_EnterValues extends InputOutputObjects {
	
	public void checkLogin() throws InterruptedException
	{
		
		long startTime = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Automation/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://juliemr.github.io/protractor-demo/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//login form presence 
		driver.findElement(julimr_heading).isDisplayed();
		driver.findElement(julimr_firstTextBox).isDisplayed();
		driver.findElement(julimr_firstTextBox).sendKeys("5");
		driver.findElement(julimr_secondTextBox).isDisplayed();
		driver.findElement(julimr_secondTextBox).sendKeys("4");
		driver.findElement(julimr_goButton).isDisplayed();
		driver.findElement(julimr_goButton).click();
		Thread.sleep(5000);
		String text = driver.findElement(julimr_result).getText();
		int value = Integer.valueOf(text);
		if(value>0)
		{
			System.out.println("Result is successfully Displayed");
		}
		else
		{
			System.out.println("Test case failed");
		}

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total Page Load Time: " + totalTime + "     milliseconds");
		driver.close();
		
		
	}

}

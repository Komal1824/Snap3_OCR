package com.knoldus.snap3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputOutputObjects {
	
	WebDriver driver;
	
	protected String snap3Url= "http://snap3-staging.platform3.co/";
	By loginSection = By.xpath("//form[@class='login-form']");
	By emailTextbox = By.xpath("//form[@class='login-form']//input[@name='email']");
	By pswdTextbox = By.xpath("//form[@class='login-form']//input[@name='password']");
	By buttonLogin= By.xpath("//button[contains(.,'Login ')]");
	
	
	

}

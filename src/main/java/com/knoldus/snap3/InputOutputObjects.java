package com.knoldus.snap3;



import org.openqa.selenium.By;

public class InputOutputObjects {
	
	
	protected String snap3Url= "http://snap3-staging.platform3.co/";
	By loginSection = By.xpath("//form[@class='login-form']");
	By emailTextbox = By.xpath("//form[@class='login-form']//input[@name='email']");
	By pswdTextbox = By.xpath("//form[@class='login-form']//input[@name='password']");
	By buttonLogin= By.xpath("//button[contains(.,'Login ')]");
	//Dashboard objects
	
	By snap3logo = By.xpath("//div[@class='page-logo']");
	By clientListDropdown = By.xpath("//div[@class='clientbox client-list']//select");
	By pageTitle = By.xpath("//h3[@class='page-title']");
	
	//Juli mr
	By julimr_heading = By.xpath("//h3[contains(.,'Super Calculator')]");
	By julimr_firstTextBox = By.xpath("//input[@ng-model='first']");
	By julimr_secondTextBox = By.xpath("//input[@ng-model='second']");
	By julimr_goButton = By.xpath("//button[@id='gobutton']");
	By julimr_result = By.xpath("//h2[@class='ng-binding']");

/*	@BeforeTest
    public void setup(){
		System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Automation/chromedriver_linux64/chromedriver");
		
		driver.get(snap3Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		
    }
	
	public void enterCredentials()
	{
		//WebDriver driver = new ChromeDriver();
		driver.findElement(loginSection).isDisplayed();
		driver.findElement(loginSection).isDisplayed();
		
		driver.findElement(emailTextbox).isDisplayed();
		driver.findElement(emailTextbox).sendKeys("fandango@fandango.com");
		
		driver.findElement(pswdTextbox).isDisplayed();
		driver.findElement(pswdTextbox).sendKeys("tqNxsV6z4a");
		
		driver.findElement(buttonLogin).isDisplayed();
		driver.findElement(buttonLogin).click();
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Test successful");
		driver.close();
	}
	
	*/
	

}

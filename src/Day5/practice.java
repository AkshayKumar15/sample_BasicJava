package Day5;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		setUp();
	//	loginErrorMessage();
	//	loginToSFDC();
	//	rememberMeCheckbox();
		userMenu();
		tearDown();
	}



	public static void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Jars\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome browser launched");
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		System.out.println("App URL padded in browser");
	}

	public static void loginErrorMessage() throws Exception
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("user@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		String expectedErrorMessage="Please enter your password.";
		String actualErrorMessage=driver.findElement(By.xpath("//div[@id='error']")).getText();
		if(actualErrorMessage.equals(expectedErrorMessage))
		{
			System.out.println("Pass: correct error message displayed on the login screen");
		}else
		{
			System.out.println("Fail: error message is not matched");
		}
	}

	public static void loginToSFDC() throws Exception
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mithun.r@tekarch.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

	public static void rememberMeCheckbox() throws Exception
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mithun.r@tekarch.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@name='rememberUn']")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'userNav-buttonArrow mbrButtonArrow')]")).click();
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		String expectedVeriftUserName="mithun.r@tekarch.com";
		String actualVerifyUserName = driver.findElement(By.xpath("//div[@class='mt8 mb16']//div//span[contains(text(),'mithun.r@tekarch.com')]")).getText();
		System.out.println("Actual User Name in userField: "+actualVerifyUserName);
		if(expectedVeriftUserName.equals(actualVerifyUserName))
		{
			System.out.println("Pass: UserName is matched with last email id");
		}
		else
		{
			System.out.println("Fail: UserName not matched");
		}
	}
	
	public static void userMenu()
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mithun.r@tekarch.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		WebElement userMenu = driver.findElement(By.xpath("//span[contains(text(),'sdgMithun Gupta')]"));
		System.out.println(userMenu.getText());
	}


	public static void tearDown() throws Exception
	{
		Thread.sleep(8000);
		System.out.println("close the browser");
		driver.quit();
	}

}

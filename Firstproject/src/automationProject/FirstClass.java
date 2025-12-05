package automationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstClass {
	

	
			WebDriver driver;
			@BeforeMethod
	
			public void browsweopen() throws Exception
			{
				
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://qainterview.pythonanywhere.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			}
			
		
			@Test
			public void fact() throws Exception
			{
				
			
		//Text Button
			driver.findElement(By.id("number")).isDisplayed();
			driver.findElement(By.id("number")).isEnabled();
			}
			
			//calculate Button
			
			@Test
			public void calculate()
			{
			//Calculate Button
			driver.findElement(By.xpath(" //button[@id='getFactorial']")).isDisplayed();
			driver.findElement(By.xpath("//button[@id='getFactorial']")).click();
			}
			
			//About
			@Test
			public void about()
			{
			driver.findElement(By.xpath("//a[text()='About']")).isDisplayed();
			driver.findElement(By.xpath("//a[text()='About']")).click();
			
			
			driver.findElement(By.xpath("//a[text()='Home']")).click();
			
			}
			//Terms and Conditions
			
			@Test
			public void termsacond() throws Exception
			{
			//Terms and Conditions
			driver.findElement(By.xpath("//a[text()='Terms and Conditions']")).isDisplayed();
			driver.findElement(By.xpath("//a[text()='Terms and Conditions']")).click();
			driver.navigate().back();
			
			Thread.sleep(5000);
			}
			
			//privacy
			
			@Test
			public void privacy()
			{
			
			driver.findElement(By.xpath("//a[text()='Privacy']")).isDisplayed();
			driver.findElement(By.xpath("//a[text()='Privacy']")).click();
			
			}
			
			
			
		@AfterMethod	
		
		public void browserclose()
		{
	
		driver.close();

		}
		/*public static void main (String[] args) throws Exception
		{
		 FirstClass fs=new FirstClass();
		 fs.browsweopen();
		 fs.fact();
		 fs.browserclose();*/
		 
		}




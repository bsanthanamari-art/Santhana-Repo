package prabankapplicationnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registrationparabank {
	WebDriver driver;
	
	 @BeforeMethod
	    public void setup() 
	{
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
	        
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://parabank.parasoft.com/");
}
	 @Test
	 public void register() throws Exception
	 {
		 driver.findElement(By.xpath("//a[text()='Register']")).click();
		 driver.findElement(By.name("customer.firstName")).sendKeys("Santhanas");
		 driver.findElement(By.name("customer.lastName")).sendKeys("Mari");
		 driver.findElement(By.name("customer.address.street")).sendKeys("Arapalayam");
		 driver.findElement(By.name("customer.address.city")).sendKeys("madurai");
		 driver.findElement(By.name("customer.address.state")).sendKeys("TamilNadu");
		 driver.findElement(By.name("customer.address.zipCode")).sendKeys("625016");
		 driver.findElement(By.name("customer.phoneNumber")).sendKeys("8667644357");
		 

		 driver.findElement(By.name("customer.ssn")).sendKeys("121212");
		 driver.findElement(By.name("customer.username")).sendKeys("santhanamariI");
		 driver.findElement(By.name("customer.password")).sendKeys("santhana1234");
		 driver.findElement(By.name("repeatedPassword")).sendKeys("santhana1234");
		 
		 driver.findElement(By.xpath("//input[@value='Register']")).click();
		 
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h1[@class='title']")));
		  
		 
		 Thread.sleep(4000);
		
	         String msg= driver.findElement(By.xpath("//h1[@class='title']")).getText();
	         Assert.assertTrue(msg.contains("Welcome") );
	                
		 
		
		
		 
		 
		 
		 
	 }
	 
	 @AfterMethod
	 public void closebrowser()
	 
	 {
		 driver.quit();
	 }
}

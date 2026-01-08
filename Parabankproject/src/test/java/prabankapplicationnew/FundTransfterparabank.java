package prabankapplicationnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class FundTransfterparabank {
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
		public void fundTransferTest() {
			
			driver.findElement(By.name("username")).sendKeys("santhanamariI");
		    driver.findElement(By.name("password")).sendKeys("santhana1234");
		    driver.findElement(By.xpath("//input[@class='button']")).click();
			/*Loginpageparabank lb= new Loginpageparabank();
			lb.loginpage();*/

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		    
		    wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//h1[contains(text(),'Accounts Overview')]")));

		    
		    driver.findElement(By.xpath("//a[text()='Transfer Funds']")).click();

		    
		    
		   driver.findElement(By.id("amount")).sendKeys("10");
		   driver.findElement(By.xpath("//input[@class='button']")).click();
		  // WebElement successmsg=  driver.findElement(By.xpath("//h1[contains(text(),'Transfer Complete!')]"));
		

		    
		    
		    
		    

		   
	}
		@AfterMethod
		public void quit()
		{
			driver.close();
		}
	}
	


package prabankapplicationnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoanApplication  
{
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
	public void loanapplication() throws Exception
	{

	    driver.findElement(By.name("username")).sendKeys("santhanamariI");
	    driver.findElement(By.name("password")).sendKeys("santhana1234");
	    driver.findElement(By.xpath("//input[@class='button']")).click();

	  driver.findElement(By.xpath("//a[text()='Request Loan']")).click();
	  driver.findElement(By.id("amount")).sendKeys("10000");
	  driver.findElement(By.id("downPayment")).sendKeys("100");
	  driver.findElement(By.xpath("//input[@class='button']")).click();
	  WebElement loanTitle = driver.findElement(By.xpath("//h1[@class='title' and text()='Loan Request Processed']"));
	 Boolean val=  loanTitle.isDisplayed();
	 
	 Thread.sleep(5000);
	 
	 System.out.println(val);
	// Assert.assertTrue(val, "False");
	 
	    
	}
	
	@AfterMethod
	public void quit()
	{
		driver.close();
	}
	}
    
	
	



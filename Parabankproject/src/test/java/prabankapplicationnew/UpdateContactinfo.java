package prabankapplicationnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdateContactinfo {
	WebDriver driver;
	
	@BeforeMethod()
	public void setup() 
	{
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
	        
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://parabank.parasoft.com/");

}
	@Test
	public void updateinfo()
	
	{
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.name("username")).sendKeys("santhanamariI");
	    driver.findElement(By.name("password")).sendKeys("santhana1234");
	    driver.findElement(By.xpath("//input[@class='button']")).click();
	    
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Update Contact Info")));
	    
	    driver.findElement(By.xpath("//a[text()='Update Contact Info']")).click();
	  
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer.address.street")));
	    WebElement wb1=  driver.findElement(By.id("customer.address.street"));
	    wb1.clear();
	    
	    wb1.sendKeys("Anuapanadi");
	    driver.findElement(By.xpath("//input[@class='button']")).click();
	  

	}
}
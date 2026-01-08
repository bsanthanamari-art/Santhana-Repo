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

public class Loginpageparabank {
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
	 public void loginpage() 
	 {
		 try {
			 
		 
		 driver.findElement(By.name("username")).sendKeys("santhanamariI");
		 driver.findElement(By.name("password")).sendKeys("santhana1234");
		 driver.findElement(By.xpath("//input[@class='button']")).click();
		String msg2= driver.findElement(By.xpath("//h1[contains(text(),'Accounts Overview')]")).getText();
		Assert.assertTrue(msg2.contains("Accounts Overview"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		WebElement cusname = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.xpath("//p[@class='smallText']")));
			String name= cusname.getText();
			System.out.print(name);
		
		//Assert.assertTrue(name.contains("santhanamari"),"Applicant name is correct");
		
		
		Thread.sleep(3000);
		 }
		 catch(Exception e)
		 {
			 System.out.print("Login failed");
		 }
	 }
	 
	 	@AfterMethod
	 	public void closebrowser()
	 	
	 {
		 driver.close();
	 }
}



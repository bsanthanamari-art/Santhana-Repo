package automationProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fifthclass {
		WebDriver driver;
	
		@BeforeMethod
		public void bug ()
		{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		}
		
		@Test
		public void bug1()
		{
		driver.findElement(By.id("number")).sendKeys("10");
		driver.findElement(By.id("getFactorial")).click();
		}

		@AfterMethod
		public void close()
		{
			driver.quit();
		}
	}



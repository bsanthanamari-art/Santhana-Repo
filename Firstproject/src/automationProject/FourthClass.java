package automationProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FourthClass {
	public static void main(String[] arg)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		 WebDriverWait Wait = new WebDriverWait(driver, 10);
		
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[text()='About']")).click();
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		Wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("a"), 5));
		
		int lc=link.size();
		System.out.println("Link count" +lc);
		
		
		for(WebElement Lkname:link)
		{
			String text= Lkname.getText();
			System.out.println(text);
		}
		
	
	
		driver.close();
		
	
	}
		
	}



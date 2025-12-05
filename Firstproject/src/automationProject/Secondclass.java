package automationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Secondclass {
	WebDriver driver;
	
	@BeforeMethod
	public void bopen()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();

	}
	
	@Test
	public void function()
	{
		String Actualplace= driver.findElement(By.id("number")).getAttribute("placeholder");
		String Expectedplace="Enter an integer";
		SoftAssert s=new SoftAssert();
		s.assertEquals(Actualplace,Expectedplace);
		s.assertAll();
	}
	@Test
	public void pgtitle()
	{
		String Title = driver.getTitle();
		String Expected= "Factoriall";
		Assert.assertEquals(Title, Expected);
	}
	@Test
	public void url()
	{
		String url= driver.getCurrentUrl();
		String expecturl ="https";
		Assert.assertEquals(url, expecturl);
	}
	@AfterMethod
	public void bclose()
	{
		driver.close();
	}

}

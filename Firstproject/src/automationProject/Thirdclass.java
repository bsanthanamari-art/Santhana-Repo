package automationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Thirdclass {
	WebDriver driver;
	
	   @BeforeMethod
	    public void setup() {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
	        
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://qainterview.pythonanywhere.com/");
	    }

	   @DataProvider(name = "factorialData")
	    public Object[][] factorialDataProvider() {
	        return new Object[][]{
	                {4, "24"},
	                {5, "120"},
	                {6, "720"},
	                {7, "5040"},
	                {8, "40320"},
	                {9, "362880"},
	                {10, "3628800"}
	        };
	    }

	    @Test(dataProvider = "factorialData")
	    public void verifyFactorial(int number, String expectedValue) throws InterruptedException {

	        WebElement inputBox = driver.findElement(By.id("number"));
	        WebElement button = driver.findElement(By.id("getFactorial"));

	        inputBox.clear();
	        inputBox.sendKeys(String.valueOf(number));
	        button.click();

	        Thread.sleep(2000); // Wait for result to load

	        WebElement resultText = driver.findElement(By.id("resultDiv"));
	        String uiText = resultText.getText();

	        String actualValue = uiText.replace("The factorial of " + number + " is: ", "").trim();

	        System.out.println("Number: " + number + 
	                           " | Expected: " + expectedValue +
	                           " | Actual: " + actualValue);

	        Assert.assertEquals(actualValue, expectedValue, "Validation failed for number: " + number);
	    }


	@AfterMethod
	public void quitbrowser()
	{
		driver.quit();
	}
		}



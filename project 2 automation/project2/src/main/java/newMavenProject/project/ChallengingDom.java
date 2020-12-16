package newMavenProject.project;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ChallengingDom {
	
	@Test 
	void z() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alienware pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
	  		driver.manage().window().maximize();
		    driver.get("http://51.11.162.64:443/");
		    
		    driver.findElement(By.id("username")).click();
		    driver.findElement(By.id("username")).sendKeys("admin");
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).sendKeys("bluebird");
		    driver.findElement(By.cssSelector(".radius")).click();
		    driver.findElement(By.linkText("Challenging DOM")).click(); // Click Challanging DOM link
		    Thread.sleep(2000);
		    
		    WebElement validation = driver.findElement(By.xpath(" /html//div[@id='content']/div[@class='example']//table//td[.='Consequuntur7']"));
		    // This is to validate if "Consequuntur7" is shown
		    WebElement validation2 = driver.findElement(By.xpath(" /html//div[@id='content']/div[@class='example']//table//td[.='Consequuntur6']"));
		    WebElement validation3 = driver.findElement(By.xpath(" /html//div[@id='content']/div[@class='example']//table//td[.='Definiebas2']"));
		                                                          
		    // /html//div[@id='content']/div[@class='example']//table//td[.='Consequuntur7']
		    if (validation.isDisplayed())  // Validate if the word "Consequuntur7" is shown in the webpage
		    {
		    	System.out.println("Consequuntur7 is displayed");
		    	System.out.println(" ");
		    	
		    }else 
		    {
		    	System.out.println("Consequuntur7 is not displayed");
		    }

		    if (validation2.isDisplayed())  // Validate if the word "Consequuntur6" is shown in the webpage
		    {
		    	System.out.println("Consequuntur6 is displayed");
		    	System.out.println(" ");
		    	
		    }else 
		    {
		    	System.out.println("Consequuntur6 is not displayed");
		    }
		    
		    if (validation3.isDisplayed())  // Validate if the word "Definiebas2" is shown in the webpage
		    {
		    	System.out.println("Definiebas2 is displayed");
		    	System.out.println(" ");
		    	
		    }else 
		    {
		    	System.out.println("Definiebas2 is not displayed");
		    }
		    
		    if (validation.isDisplayed() && validation2.isDisplayed() && validation3.isDisplayed())
		    {
		    	// If Consequuntur7, Consequuntur6 and Definiebas2 are all shown in the page then print a confirmation
		    	System.out.println("columnName	  row	  Value ");
		    	System.out.println(" ");
		    	System.out.println("sit	        3     Definiebas2");
		    	System.out.println("Amet	        5     Consequuntur6");
		    	System.out.println("Amet	        6     Consequuntur7");
		    }else
		    {
		    	System.out.println("Not all values are displayed");
		    }

		    Thread.sleep(5000);
		    // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    driver.quit();
		    

	}
	

}
	


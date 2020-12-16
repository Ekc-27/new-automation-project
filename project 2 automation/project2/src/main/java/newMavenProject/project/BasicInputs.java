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

public class BasicInputs {
	
	@Test 
	void z() throws InterruptedException // InterruptedException is needed to add Thread.sleep method
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alienware pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
        
  		driver.manage().window().maximize();
  		driver.get("http://51.11.162.64:443/");
        // driver.Manage().Window.Size = new System.Drawing.Size(1536, 824);
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("bluebird");
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.cssSelector("button")).click(); // submit button
        Thread.sleep(2000);
        driver.findElement(By.id("r1")).click(); // yes button
        driver.findElement(By.id("n1")).click(); // how old are you section
        driver.findElement(By.id("n1")).sendKeys("29"); // type in 29
        driver.findElement(By.id("t1")).click();  // favourite fruit section
        driver.findElement(By.id("t1")).sendKeys("Banana"); // type in banana 
        driver.findElement(By.id("t2")).click();  // email section 
        driver.findElement(By.id("t2")).sendKeys("testtest.com");  // type in testtest.com 
        driver.findElement(By.id("t3")).click(); // message section 
        driver.findElement(By.id("t3")).sendKeys("test message");  // type in test message 
        driver.findElement(By.cssSelector("button")).click();  // submit button
        Thread.sleep(2000);
        driver.findElement(By.id("t2")).click(); // email section 
        driver.findElement(By.id("t2")).sendKeys("test@test.com"); // type in test@test.com
        driver.findElement(By.cssSelector("button")).click();  // submit button
        Thread.sleep(2000);
        driver.quit();

	}
	

}
	


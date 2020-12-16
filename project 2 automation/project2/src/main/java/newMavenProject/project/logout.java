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

public class logout {
	
	@Test 
	void z() throws InterruptedException // InterruptedException is needed to add Thread.sleep method
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alienware pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		    driver.manage().window().maximize();
		    driver.get("http://51.11.162.64:443/");
            driver.findElement(By.id("username")).click();              // Click on username section 
            driver.findElement(By.id("username")).sendKeys("admin");    // Type in "admin"
            driver.findElement(By.id("password")).click();              // Click on the password section
            driver.findElement(By.id("password")).sendKeys("bluebird"); // Type in "bluebird"
            driver.findElement(By.cssSelector(".fa")).click();          // Click "Login"
            Thread.sleep(2000);                                         // Show the homepage 
            driver.findElement(By.cssSelector(".icon-2x")).click();     // Click on "Logout"
            Thread.sleep(2000);
		    driver.quit();
		

	}
	

}
	


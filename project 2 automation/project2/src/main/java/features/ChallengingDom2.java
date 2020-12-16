package features;


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

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class ChallengingDom2{

	WebDriver driver = new ChromeDriver(); 
	
	 @Given("^that I go to the Chrome browser\\.$")
	    public void that_i_go_to_the_chrome_browser() throws Throwable {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\alienware pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    
	    }

	    @When("^I type in the url 'http:\\\\/\\\\/51\\\\.11\\\\.162\\\\.64:443\\\\/'$")
	    public void i_type_in_the_url_http511116264443() throws Throwable {
	  		driver.manage().window().maximize();
	  		driver.get("http://51.11.162.64:443/");
	    }

	    @Then("^The page titled 'Challenging DOM' shall be shown with tables and rows$")
	    public void the_page_titled_challenging_dom_shall_be_shown_with_tables_and_rows() throws Throwable {
		   
	    	Thread.sleep(5000);
		    // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    driver.quit();
	    }

	    @And("^I type in username section 'admin'$")
	    public void i_type_in_username_section_something(String strArg1) throws Throwable {
	    	driver.findElement(By.id("username")).click();
	    	driver.findElement(By.id("username")).sendKeys("admin");
	    }

	    @And("^I type in password section 'bluebird'$")
	    public void i_type_in_password_section_something(String strArg1) throws Throwable {
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).sendKeys("bluebird");
	    }

	    @And("^I click Login$")
	    public void i_click_login() throws Throwable {
		    driver.findElement(By.cssSelector(".fa")).click();
		    Thread.sleep(2000);
	    }

	    @And("^I click Challenging DOM$")
	    public void i_click_challenging_dom() throws Throwable {
		    driver.findElement(By.linkText("Challenging DOM")).click(); // Click Challanging DOM link
		    Thread.sleep(2000);
	    }

	    @And("^the value 'Definiebas2' shall be shown under the column 'Sit'  $")
	    public void the_value_definiebas2_shall_be_shown_under_the_column_sit() throws Throwable {
		    WebElement validation = driver.findElement(By.xpath(" /html//div[@id='content']/div[@class='example']//table//td[.='Consequuntur7']"));
		    // This is to validate if "Consequuntur7" is shown
		   
		    if (validation.isDisplayed())  // Validate if the word "Consequuntur7" is shown in the webpage
		    {
		    	System.out.println("Consequuntur7 is displayed");
		    	System.out.println(" ");
		    	
		    }else 
		    {
		    	System.out.println("Consequuntur7 is not displayed");
		    }

	    }

	    @And("^the value 'Consequuntur6' shall be shown under the column 'Amet'  $")
	    public void the_value_consequuntur6_shall_be_shown_under_the_column_amet() throws Throwable {
	    	
		    WebElement validation2 = driver.findElement(By.xpath(" /html//div[@id='content']/div[@class='example']//table//td[.='Consequuntur6']"));
		   
	    	if (validation2.isDisplayed())  // Validate if the word "Consequuntur6" is shown in the webpage
		    {
		    	System.out.println("Consequuntur6 is displayed");
		    	System.out.println(" ");
		    	
		    }else 
		    {
		    	System.out.println("Consequuntur6 is not displayed");
		    }
	    }

	    @And("^the value 'Consequuntur7' shall be shown under the column 'Amet'  $")
	    public void the_value_consequuntur7_shall_be_shown_under_the_column_amet() throws Throwable {
		    
	    	WebElement validation = driver.findElement(By.xpath(" /html//div[@id='content']/div[@class='example']//table//td[.='Consequuntur7']"));
		    WebElement validation2 = driver.findElement(By.xpath(" /html//div[@id='content']/div[@class='example']//table//td[.='Consequuntur6']"));     
	    	WebElement validation3 = driver.findElement(By.xpath(" /html//div[@id='content']/div[@class='example']//table//td[.='Definiebas2']"));
	    	 
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
	    }

}
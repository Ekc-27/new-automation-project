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
public class JavaScriptAlerts2{

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


	    @Then("^The page shall show the message \"([^\"]*)\"$")
	    public void the_page_shall_show_the_message_something(String strArg1) throws Throwable {
	    	Thread.sleep(2000);
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

	    @And("^I click JavaScript Alerts$")
	    public void i_click_javascript_alerts() throws Throwable {
	  	    driver.findElement(By.linkText("JavaScript Alerts")).click(); // Javascript alerts link
	    }

	    @And("^I click 'Click for JS Alert'$")
	    public void i_click_click_for_js_alert() throws Throwable {
	    	 driver.findElement(By.cssSelector("li:nth-child(1) > button")).click(); // Click for JS Alert button
	    }

	    @And("^I click 'OK'$")
	    public void i_click_ok() throws Throwable {
	  	    assertThat(driver.switchTo().alert().getText(), is("I am a JS Alert")); 
	  	    driver.findElement(By.cssSelector("li:nth-child(2)")).click();  // Javascript message button click
	    }

	    @And("^I click 'Click for JS Confirm'$")
	    public void i_click_click_for_js_confirm() throws Throwable {
	  	    driver.findElement(By.cssSelector("li:nth-child(2) > button")).click();  // Click for JS Confirm button
	    }

	    @And("^I click 'Cancel'$")
	    public void i_click_cancel() throws Throwable {
	  	    assertThat(driver.switchTo().alert().getText(), is("I am a JS Confirm"));
	  	    driver.switchTo().alert().dismiss();  // Javascript message button click cancel
	    }

	    @And("^I click 'Click for JS Prompt'$")
	    public void i_click_click_for_js_prompt() throws Throwable {
	 	    driver.findElement(By.cssSelector("li:nth-child(3)")).click();   
	  	    driver.findElement(By.cssSelector("li:nth-child(3) > button")).click();  // Click for JS Prompt button
	   	   
	    }

	    @And("^I type in the JavaScript alert section 'check1'$")
	    public void i_type_in_the_javascript_alert_section_check1() throws Throwable {
	    	 assertThat(driver.switchTo().alert().getText(), is("I am a JS prompt")); // Javascript message section click
	    	    {
	    	      Alert alert = driver.switchTo().alert();
	    	      alert.sendKeys("check1"); // Javascript message section type in "check1"
	    	      alert.accept();   // Javascript message section click OK
	    	    }

	    }
	    
	    @And("^I am clicking 'OK'$")
	    public void i_am_clicking_ok() throws Throwable {
    	    driver.findElement(By.cssSelector("li:nth-child(3)")).click(); 
	    }

}
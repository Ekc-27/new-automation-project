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
public class logout2{

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


	    @Then("^I have logged out of the account and the login page shall be displayed\\.$")
	    public void i_have_logged_out_of_the_account_and_the_login_page_shall_be_displayed() throws Throwable {
            Thread.sleep(2000);
		    driver.quit();
	    }

	    @And("^I type in username section 'admin'$")
	    public void i_type_in_username_section_something(String strArg1) throws Throwable {
	    	driver.findElement(By.id("username")).click();             // Click on username section
	    	driver.findElement(By.id("username")).sendKeys("admin");   // Type in "admin"
	    }

	    @And("^I type in password section 'bluebird'$")
	    public void i_type_in_password_section_something(String strArg1) throws Throwable {
	    	    driver.findElement(By.id("password")).click();                // Click on the password section
			    driver.findElement(By.id("password")).sendKeys("bluebird");   // Type in "bluebird"
	    }

	    @And("^I click Login$")
	    public void i_click_login() throws Throwable {
	    	 driver.findElement(By.cssSelector(".fa")).click();      // Click "Login"
			 Thread.sleep(2000);                                     // Show the homepage 
	    }

	    @And("^I click Logout$")
	    public void i_click_logout() throws Throwable {
            driver.findElement(By.cssSelector(".icon-2x")).click();     // Click on "Logout"
	    }


}
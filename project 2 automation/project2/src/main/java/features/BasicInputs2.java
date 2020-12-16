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
public class BasicInputs2{

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

    @Then("^The message shall be sent $")
    public void the_message_shall_be_sent() throws Throwable {
    	Thread.sleep(2000);
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

    @And("^I click Inputs$")
    public void i_click_inputs() throws Throwable {
    	 driver.findElement(By.linkText("Inputs")).click();
    }

    @And("^I click Submit$")
    public void i_click_submit() throws Throwable {
        driver.findElement(By.cssSelector("button")).click(); // submit button
        Thread.sleep(2000);
    }

    @And("^I tick Yes $")
    public void i_tick_yes() throws Throwable {
    	driver.findElement(By.id("r1")).click(); // yes button
        
    }

    @And("^I type in 29 in the age section$")
    public void i_type_in_29_in_the_age_section() throws Throwable {
    	driver.findElement(By.id("n1")).click(); // how old are you section
    	driver.findElement(By.id("n1")).sendKeys("29"); // type in 29
    }

    @And("^I type in Banana in the fruits section$")
    public void i_type_in_banana_in_the_fruits_section() throws Throwable {
    	driver.findElement(By.id("t1")).click();  // favourite fruit section
        driver.findElement(By.id("t1")).sendKeys("Banana"); // type in banana 
    }

    @And("^I type in a wrong email adress testtest\\.com$")
    public void i_type_in_a_wrong_email_adress_testtestcom() throws Throwable {
    	 driver.findElement(By.id("t2")).click();  // email section 
         driver.findElement(By.id("t2")).sendKeys("testtest.com");  // type in testtest.com 
    }

    @And("^I type in a short message \"([^\"]*)\"$")
    public void i_type_in_a_short_message_something(String strArg1) throws Throwable {
        driver.findElement(By.id("t3")).click(); // message section 
        driver.findElement(By.id("t3")).sendKeys("test message");  // type in test message 
        driver.findElement(By.cssSelector("button")).click();  // submit button
        Thread.sleep(2000);
    }

    @And("^I change the email to the correct format test@test.com$")
    public void i_change_the_email_to_the_correct_format_testtestcom() throws Throwable {
    	driver.findElement(By.id("t2")).click(); // email section 
        driver.findElement(By.id("t2")).sendKeys("test@test.com"); // type in test@test.com
        driver.findElement(By.cssSelector("button")).click();  // submit button
    }

    @And("^All areas shall be empty again $")
    public void all_areas_shall_be_empty_again() throws Throwable {
    	 driver.quit();
    }

}
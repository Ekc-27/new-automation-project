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
public class EntryAdvertisement2{

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

	    @Then("^'Option 2' shall be shown as selected on the dropdown $")
	    public void option_2_shall_be_shown_as_selected_on_the_dropdown() throws Throwable {  
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
	    
	    @And("^I click on 'Entry Ad'$")
	    public void i_click_on_entry_ad() throws Throwable {
	    	driver.findElement(By.linkText("Entry Ad")).click();  // Click entry ad link
		    Thread.sleep(5000);
	    }

	    @And("^I click Close on 'THIS IS A MODAL WINDOW' modal$")
	    public void i_click_close_on_this_is_a_modal_window_modal() throws Throwable {
		    driver.findElement(By.cssSelector(".modal")).click(); // Click on the modal
		    driver.findElement(By.cssSelector(".modal-footer > p")).click();  // Close the modal 
		    
	    }

	    @And("^I click the dropdown$")
	    public void i_click_the_dropdown() throws Throwable {
	    	 driver.findElement(By.id("dropdown")).click();  // Click on the dropdown
			    {
			      WebElement dropdown = driver.findElement(By.id("dropdown"));
			      dropdown.findElement(By.xpath("//option[. = 'Option 2']")).click(); // Click option 2
			    }
	    }

	    @And("^I select 'Option 2' $")
	    public void i_select_option_2() throws Throwable {
	    	driver.findElement(By.id("dropdown")).click();
	    }


}
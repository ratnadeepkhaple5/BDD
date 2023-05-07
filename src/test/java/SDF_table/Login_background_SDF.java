package SDF_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Login_background_SDF {
	
	ChromeDriver driver;
	@Given("launch browser")
	public void launch_browser() {
		driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("Enter URL")
	public void enter_url() {
		driver.get("http://localhost:8888/");   
	}

	@Then("validate LoginPage should be displayed or not")
	public void validate_login_page_should_be_displayed_or_not() {
	    
	}

	@Then("Enter username {string}")
	public void enter_username(String string) {
		driver.findElement(By.name("user_name")).sendKeys(string);  
	}

	@Then("password {string}")
	public void password(String string) {
		driver.findElement(By.name("user_password")).sendKeys(string);
	}

	@Then("save")
	public void save() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("validate home page is displayed or not")
	public void validate_home_page_is_displayed_or_not() {
	    
	}

	@Then("Enter password {string}")
	public void enter_password(String string) {
		driver.findElement(By.name("user_password")).sendKeys(string); 
	}
}

package practice_StepDefination;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;

import io.cucumber.java.en.*;

public class Login_SDF  {
	/*
	WebDriver driver;
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
		throw new SkipException("______No data_____");
	}

	@Then("Enter username")
	public void enter_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin"); 
	}

	@Then("Enter password")
	public void enter_password() {
		driver.findElement(By.name("user_password")).sendKeys("admin");
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("validate home page is displayed or not")
	public void validate_home_page_is_displayed_or_not() {
		Assert.assertEquals(true, true);
	}
	*/
}

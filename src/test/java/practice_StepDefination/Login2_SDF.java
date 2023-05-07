//package practice_StepDefination;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class Login2_SDF {
//	ChromeDriver driver;
//	@Given("launch browser")
//	public void launch_browser() {
//		
//		driver=new ChromeDriver();
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
//	}
//
//	@Then("Enter URL")
//	public void enter_url() {
//		driver.get("http://localhost:8888/");
//	}
//
//	@Then("validate LoginPage should be displayed or not")
//	public void validate_login_page_should_be_displayed_or_not() {
//	  
//	}
//
//	@Then("Enter username admin")
//	public void enter_username_admin() {
//		driver.findElement(By.name("user_name")).sendKeys("admin"); 
//	}
//
//	@Then("Enter password admin")
//	public void enter_password_admin() {
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//	}
//
//	@Then("Enter username sunny")
//	public void enter_username_sunny() {
//		driver.findElement(By.name("user_name")).sendKeys("sunny");  
//	}
//}

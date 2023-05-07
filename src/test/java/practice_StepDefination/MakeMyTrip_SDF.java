package practice_StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class MakeMyTrip_SDF {

	ChromeDriver driver;
	@Given("open browser")
	public void open_browser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("enter makeMyTrip url")
	public void enter_make_my_trip_url() throws Exception {
		driver.get("https://www.makemytrip.com/");

		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		ac.moveByOffset(10, 10).click().perform();
	}

	@Then("select source {string}")
	public void select_source(String scrCity) {
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(scrCity);
		driver.findElement(By.xpath("//p[text()='"+scrCity+", India']")).click(); 
	}

	@Then("select destination {string}")
	public void select_destination(String destCity) {
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys(destCity);
		driver.findElement(By.xpath("//p[text()='"+destCity+", India']")).click();  
	}

	@Then("select passenger {string}")
	public void select_passenger(String passenger) {
		driver.findElement(By.xpath("//*[text()='Travellers & CLASS']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-"+passenger+"']")).click();
	}

	@Then("click on applyFlight")
	public void click_on_apply_flight() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	}
}

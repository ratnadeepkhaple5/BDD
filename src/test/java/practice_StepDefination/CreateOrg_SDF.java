//package practice_StepDefination;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.*;
//
//public class CreateOrg_SDF {
///*
//	WebDriver driver;
//	@Given("launch chrome browser")
//	public void launch_chrome_browser() {
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	}
//
//	@Then("enter url")
//	public void enter_url() {
//		driver.get("http://localhost:8888/");
//	}
//
//	@When("enter Credientials and click on login")
//	public void enter_credientials_and_click_on_login() {
//		driver.findElement(By.name("user_name")).sendKeys("admin"); 
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
//	}
//
//	@Then("homepage should be displayed")
//	public void homepage_should_be_displayed() {
//	Assert.assertEquals(true, true);
//	}
//
//	@When("click on org module")
//	public void click_on_org_module() {
//		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
//	}
//
//	@Then("org listPage should displayed")
//	public void org_list_page_should_displayed() {
//	  
//	}
//	@Then("click on create new org")
//	public void click_on_create_new_org() {
//		driver.findElement(By.cssSelector("[title='Create Organization...']")).click();
//	}
//
//	@Then("should display create org page")
//	public void should_display_create_org_page() {
//	   
//	}
//
//	@When("enter all mandetory fields on test area and save")
//	public void enter_all_mandetory_fields_on_test_area_and_save() {
//		driver.findElement(By.name("accountname")).sendKeys("tyss_03");
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();  
//	}
//
//	@Then("Validate created org should display in org listPage")
//	public void validate_created_org_should_display_in_org_list_page() {
//		String exptitle="Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";
//		String acttitle = driver.getTitle();
//		Assert.assertEquals(exptitle, acttitle);
//		System.out.println(".....matched title...!");
//	}
//*/
//	WebDriver driver;
//	@Given("launch chrome browser")
//	public void launch_chrome_browser() {
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	}
//
//	@Then("enter url")
//	public void enter_url() {
//		driver.get("http://localhost:8888/");
//	}
//
//	@When("enter Credientials and click on login")
//	public void enter_credientials_and_click_on_login() {
//		driver.findElement(By.name("user_name")).sendKeys("admin"); 
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
//	}
//
//	@Then("homepage should be displayed")
//	public void homepage_should_be_displayed() {
//	    
//	}
//
//	@When("click on org module")
//	public void click_on_org_module() {
//		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
//	}
//
//	@Then("org listPage should displayed")
//	public void org_list_page_should_displayed() {
//	   
//	}
//
//	@Then("click on create new org")
//	public void click_on_create_new_org() {
//		driver.findElement(By.cssSelector("[title='Create Organization...']")).click(); 
//	}
//
//	@Then("should display create org page")
//	public void should_display_create_org_page() {
//	
//	}
//
//	@When("enter all mandetory fields on test area and save {string}")
//	public void enter_all_mandetory_fields_on_test_area_and_save(String orgName) {
//		driver.findElement(By.name("accountname")).sendKeys(orgName);
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click(); 
//	}
//
//	@Then("Validate created org should display in org listPage")
//	public void validate_created_org_should_display_in_org_list_page() {
//	   
//	}	
//}

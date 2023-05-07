//package SDF_table;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.*;
//
//public class SDF_createOrg {
//
//	ChromeDriver driver;
//	
//	@Given("launch browser")
//	public void launch_browser() {
//	  driver=new ChromeDriver();
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	}
//
//	@Given("Enter URL")
//	public void enter_url() {
//		driver.get("http://localhost:8888/");
//	}
//
//	@Given("Enter un_pwd and login")
//	public void enter_un_pwd_and_login() {
//		driver.findElement(By.name("user_name")).sendKeys("admin");  
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
//	}
//
//	@Then("click on org module")
//	public void click_on_org_module() {
//		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
//	}
//
//	@When("click on create new org image plus")
//	public void click_on_create_new_org_image_plus() {
//		driver.findElement(By.cssSelector("[title='Create Organization...']")).click();
//	}
//
//	@When("enter values in fields")
//	public void enter_values_in_fields(DataTable dataTable) {
//	   List<List<String>> tableValues = dataTable.asLists();
//	   String oname1 = tableValues.get(1).get(0);
//	   String phone1 = tableValues.get(1).get(1);
//	   String email1 = tableValues.get(1).get(2);
//	   System.out.println(oname1+" "+phone1+" "+email1);
//	   
//	   driver.findElement(By.name("accountname")).sendKeys(oname1);
//	   driver.findElement(By.id("phone")).sendKeys(phone1);
//	   driver.findElement(By.id("email1")).sendKeys(email1);
//		
//	}
//
//	@When("Click on create org")
//	public void click_on_create_org() {
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//	}
//}

package SDF_table;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Table_02_SDF_Map {

	@Given("open browser and enter url")
	public void open_browser_and_enter_url() {
	 System.out.println("bro opened and url done");
	}

	@Then("enter user and pwd")
	public void enter_user_and_pwd(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		String v1 = data.get(1).get("un");//row index & we need to pass
		String v2 = data.get(1).get("pwd");
		String v3 = data.get(1).get("mail");
		System.out.println(v1+" "+v2+" "+v3);
		//for index 0 o/p-> admin admin123 ram@777.com
		}

	@Then("click on login button")
	public void click_on_login_button() {
		System.out.println("clicked on login");
	}
}

package stepDefs;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;

public class OrderStepDefs extends TestBase {
	HomePage homepage;
	SearchResultPage result;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		initialize();
	  
	}
	
	@When("User Search an Item {string}")
	public void user_search_an_item(String string) {
		homepage= new HomePage();
		result=homepage.searchItem(string);
		result.viewDetails();
	    
	}
	
	@Given("User Should Be On Search Result Page")
	public void user_should_be_on_search_result_page() {
//		result=new SearchResultPage();
//		result.viewDetails();
	  
	}
	@When("Add Items to Cart")
	public void add_items_to_cart() {
		result = new SearchResultPage();
		result.additems();
	  
	}
	@Then("Item Must Be Added")
	public void item_must_be_added() {
	    
	}

}

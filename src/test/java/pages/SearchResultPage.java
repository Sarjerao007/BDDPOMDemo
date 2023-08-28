package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.TestBase;

public class SearchResultPage extends TestBase {
	
	@FindBy(css="ul>li.previw")
	WebElement ItemIcon;
	
	@FindBy(css="ul>li.data-v-159be0e2")
	WebElement addBtn;
	
	
public SearchResultPage(){
	PageFactory.initElements(driver, this);
}
public void viewDetails() {
	ItemIcon.click();
}
public void additems() {
	addBtn.click();
	
}

}
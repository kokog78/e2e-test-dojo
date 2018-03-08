package dojo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class IbelloIndexPage extends PageObject {

	@Find(by=By.BUTTON_TEXT, using="Kapcsolat")
	private WebElement contactMenuItem;
	
	public void open() {
		// hint: use the browser() method
		// hint: use browser().maximize() method if needed
	}

	public void click_contact_menu_item() {
		// hint: use the doWith(WebElement).click() method with the contactMenuItem field
	}

}

package dojo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class IbelloLoginPage extends PageObject {

	@Find(by=By.BUTTON_TEXT, using="Bejelentkezés")
	private WebElement loginButton;
	
	public void expect_page_is_opened() {
		// hint: find an element which represents the loin page
	}

}

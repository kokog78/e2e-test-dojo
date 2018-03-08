package dojo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.elements.WebElements;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class IbelloContactPage extends PageObject {

	@Find(by=By.TAG_NAME, using="input")
	private WebElements inputFields;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ux-dialog")
	@Find(by=By.TEXT, using="${0}")
	private WebElement messageBox;

	public void set_full_name(String string) {
		// hint: use the doWith(WebElement).setValue(...) method, with the first element of inputFields
	}

	public void set_email_address(String string) {
		// hint: use the doWith(WebElement).setValue(...) method, with the second element of inputFields
	}

	public void set_subject(String string) {
		// hint: use the doWith(WebElement).setValue(...) method, with the third element of inputFields
	}

	public void set_text(String string) {
		// hint: you need a WebElement field, and then use the doWith(WebElement).setValue(...) method
	}

	public void click_submit_button() {
		// hint: you need a WebElement field, and then use the doWith(WebElement).click() method
	}

	public void expect_verification_message_is_displayed() {
		// hint: use the WebElement.applyParameters method on messageBox field
		// hint: use the expectations().expect(WebElement) method
	}

	public void close_verification_message() {
		// hint: you should be able to find this out :-)
	}

}

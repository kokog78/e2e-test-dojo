package dojo.steps;

import dojo.pages.IbelloContactPage;
import dojo.pages.IbelloIndexPage;
import dojo.pages.IbelloLoginPage;
import hu.ibello.steps.StepLibrary;

public class IbelloSteps extends StepLibrary {

	private IbelloIndexPage index;
	private IbelloContactPage contact;
	private IbelloLoginPage login;
	
	public void given_that_ibello_homepage_is_open() {
		index.open();
	}

	public void when_i_navigate_to_contact_page() {
		index.click_contact_menu_item();
	}

	public void when_i_fill_the_contact_form() {
		contact.set_full_name("John Doe");
		contact.set_email_address("john.doe@example.com");
		contact.set_subject("Test message");
		contact.set_text("This is a test message: " + System.getProperty("user.name"));
	}

	public void when_i_submit_the_contact_form() {
		contact.click_submit_button();
	}

	public void then_i_receive_a_verification_message() {
		contact.expect_verification_message_is_displayed();
		contact.close_verification_message();
	}

	public void then_i_am_on_login_page() {
		login.expect_page_is_opened();
	}

	public void when_i_navigate_to_login_page() {
		// hint: use the login page object
	}

	public void when_i_login_with_invalid_credentials() {
		// hint: use the login page
		// hint: use credentials as method parameters
	}

	public void then_i_receive_an_error_message() {
		// hint: use the login page
		// hint: see contact page as example
	}
	
	
}

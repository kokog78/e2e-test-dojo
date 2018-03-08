package dojo.tests;

import org.junit.Test;

import dojo.steps.IbelloSteps;
import hu.ibello.core.Specification;

@Specification
public class IbelloSpecs {
	
	private IbelloSteps steps;

	@Test
	public void send_a_message_through_the_homepage() {
		steps.given_that_ibello_homepage_is_open();
		steps.when_i_navigate_to_contact_page();
		steps.when_i_fill_the_contact_form();
		steps.when_i_submit_the_contact_form();
		steps.then_i_receive_a_verification_message();
		steps.then_i_am_on_login_page();
	}
	
	@Test
	public void try_to_login_and_fail() {
		steps.given_that_ibello_homepage_is_open();
		steps.when_i_navigate_to_login_page();
		steps.when_i_login_with_invalid_credentials();
		steps.then_i_receive_an_error_message();
		steps.then_i_am_on_login_page();
	}
	
}

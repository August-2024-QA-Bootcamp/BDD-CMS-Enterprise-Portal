package stepDefinition;

import baseUtil.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewUserRegistrationStepDefinition extends BaseClass {

	@When("User click on New User Registration Button")
	public void user_click_on_new_user_registration_button() {
		newUserRegistration.validate_newUser_Registration_button();
	}

	@Then("User navigate to Step one of the enrollment process")
	public void user_navigate_to_step_one_of_the_enrollment_process() {
		newUserRegistration.landing_on_new_user_registration_page_step_one();
	}

	@When("User complete Step one process")
	public void user_complete_step_one_process() {
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
	}

	@Then("User navigate to Step two of the enrollment process")
	public void user_navigate_to_step_two_of_the_enrollment_process() {
		newUserRegistration.step_two_title_and_header ();
	}

	@When("User complete Step two process")
	public void user_complete_step_two_process() {		
		newUserRegistration.happy_path_step_two();
	}

	@When("click on Next Button of Step two")
	public void click_on_next_button_of_step_two() {
		newUserRegistration.click_on_next_button_of_step_two();
	}

	@Then("User navigate to Step three of the enrollment process")
	public void user_navigate_to_step_three_of_the_enrollment_process() {
		newUserRegistration.step_three_title_and_header();
	}

	@When("User complete Step three process")
	public void user_complete_step_three_process() {
		newUserRegistration.happy_path_step_three();
	}
	
	@When("click on Next Button of Step three")
	public void click_on_next_button_of_step_three() {
		newUserRegistration.click_on_next_button_of_step_three();
	}

	@Then("User navigate to Summary Page of the enrollment process")
	public void user_navigate_to_summary_page_of_the_enrollment_process() {
		newUserRegistration.summary_page_title_and_header ();
	}

	@When("User click on Submit User of Summary Page")
	public void user_click_on_submit_user_of_summary_page() {
	    newUserRegistration.click_on_submit_user_button_of_summary_page();
	}

	@When("User can see the confirmation message")
	public void user_can_see_the_confirmation_message() {
		newUserRegistration.confirmation_message ();
	}
	
	

	

}

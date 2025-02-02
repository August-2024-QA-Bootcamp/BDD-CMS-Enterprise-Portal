package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class LogIn {
	WebDriver driver;

	// Parameterized Constructor
	public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3' ]")
	WebElement mainLogo;
	
	@FindBy(id = "cms-homepage-login-logo")
	WebElement loginLogo;
	
	@FindBy(name = "user-d")
	WebElement userId;

	@FindBy(how = How.NAME, using = "pass-d")
	WebElement password;

	@FindBy(xpath = "//label[@id='cms-label-tc']")
	WebElement checkBox;

	@FindBy(id = "cms-login-submit")
	WebElement loginButton;
	
	@FindBy(xpath = "//h3[contains(text(), 'Authentication')]")
	WebElement multiFactorAuthentication;
	
	public void validateLogoAndTitle() {
		elementDisplayed(mainLogo);
		verifyTitle(driver, "CMS Enterprise Portal");
		pause(3000);
	}
	
	public void validateUserId() {
		elementDisplayed(loginLogo);
		elementDisplayed(userId);
		inputText(userId, "enthrall_12");
		pause(3000);
	}
	
	public void validatePassword() {
		elementDisplayed(password);
		inputText(password, "OnthrallTest@1234");
		pause(3000);
	}
	
	public void validateCheckBox() {
		elementSelected(checkBox);
		clickElement(checkBox);
		pause(3000);
	}
	
	public void validateLoginButton() {
		elementEnabled(loginButton);
		verifyTextOfTheWebElement(loginButton, "Login");
		clickElement(loginButton);
		pause(3000);
	}
	
	public void landingOnMultiFactorAuthenticationModal() {
		verifyTitle(driver, "CMS Enterprise Portal");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/");
		// for above 2 lines, I have no change, but if you move to a new page, you must have to check
		validationOfHeader(multiFactorAuthentication, "Multi-factor Authentication");
		pause(3000);
	}
	
	
	

}

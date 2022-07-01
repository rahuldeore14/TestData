package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClasssys;

public class RegisterPage extends BaseClasssys {

	@FindBy(id = "company_name")
	WebElement cName;

	@FindBy(id = "email")
	WebElement emailId;

	@FindBy(id = "password")
	WebElement passWord;

	@FindBy(id = "password_confirmation")
	WebElement confirmPass;

	@FindBy(id = "save-form")
	WebElement Button;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void registerNewUser(String cname, String email, String pass, String cpass) {
		cName.sendKeys(cname);
		emailId.sendKeys(email);
		passWord.sendKeys(pass);
		confirmPass.sendKeys(cpass);
		Button.click();
		

	}
}

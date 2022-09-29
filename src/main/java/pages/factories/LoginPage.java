package pages.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {	
	
	@FindBy(id = "user-name")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login-button")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String value) {
		userName.sendKeys(value);
	}
	
	public void enterPassword(String value) {
		password.sendKeys(value);
	}
	
	public void clickLoginBtn() {
		login.click();
	}

}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;	
	private String userName = "user-name";
	private String password = "password";
	private String login = "login-button";
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String value) {
		driver.findElement(By.id(userName)).sendKeys(value);
	}
	
	public void enterPassword(String value) {
		driver.findElement(By.id(password)).sendKeys(value);
	}
	
	public void clickLoginBtn() {
		driver.findElement(By.id(login)).click();
	}

}
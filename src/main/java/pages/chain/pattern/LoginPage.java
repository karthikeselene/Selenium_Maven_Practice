package pages.chain.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReadProperties;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUsername(String value) {
		driver.findElement(By.id(ReadProperties.getElementValue("LoginPage", "username"))).sendKeys(value);
		return this;
	}
	
	public LoginPage enterPassword(String value) {
		driver.findElement(By.id(ReadProperties.getElementValue("LoginPage", "password"))).sendKeys(value);
		return this;
	}
	
	public InventoryPage clickLoginBtn() {
		driver.findElement(By.id(ReadProperties.getElementValue("LoginPage", "login"))).click();
		return new InventoryPage(driver);
	}	

}
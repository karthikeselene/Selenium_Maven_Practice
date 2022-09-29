package pages.chain.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReadProperties;

public class InventoryPage {

	private WebDriver driver;	

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public InventoryPage clickBurgerMenu() {
		driver.findElement(By.id(ReadProperties.getElementValue("InvetoryPage", "burgerMenu"))).click();
		return this;
	}

	public LoginPage clickLogoutLink() {
		driver.findElement(By.id(ReadProperties.getElementValue("InvetoryPage", "logout"))).click();
		return new LoginPage(driver);
	}

}
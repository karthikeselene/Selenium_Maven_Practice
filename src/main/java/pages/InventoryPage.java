package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	
	private WebDriver driver;	
	private By burgerMenu = By.id("react-burger-menu-btn");
	private By logout = By.id("logout_sidebar_link");
	
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickBurgerMenu() {
		driver.findElement(burgerMenu).click();
	}
	
	public void clickLogoutLink() {
		driver.findElement(logout).click();
	}

}
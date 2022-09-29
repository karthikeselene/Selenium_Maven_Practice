package pages.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
	@FindBy(id = "react-burger-menu-btn")
	private WebElement burgerMenu;
	
	@FindBy(id = "logout_sidebar_link")
	private WebElement logout;
	
	
	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickBurgerMenu() {
		burgerMenu.click();
	}
	
	public void clickLogoutLink() {
		logout.click();
	}

}
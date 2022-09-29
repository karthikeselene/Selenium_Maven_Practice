package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.chain.pattern.LoginPage;



public class TC001 {

	private WebDriver driver;	
	private LoginPage page;

	@BeforeMethod
	public void setUp() {
		//Used to launch Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		

		page = new LoginPage(driver);
	}

	@Test
	public void testSimplePom() {
		page.enterUsername("standard_user")
		.enterPassword("secret_sauce")
		.clickLoginBtn()
		.clickBurgerMenu()
		.clickLogoutLink();
	}

}

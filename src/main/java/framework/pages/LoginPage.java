package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;

	// Locators
	private By usernameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");
	private By inventoryPageTitle = By.className("title");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void open() {
		driver.get("https://www.saucedemo.com/");
	}

	public void enterUsername(String username) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}

	public boolean isLoginSuccessful() {					//for Verification
		return wait.until(ExpectedConditions.visibilityOfElementLocated(inventoryPageTitle)).isDisplayed();
	}
}
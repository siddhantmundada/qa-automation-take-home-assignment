package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.base.BaseTest;
import framework.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void verifySuccessfulLogin() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.open();
		loginPage.login("standard_user", "secret_sauce");

		Assert.assertTrue(loginPage.isLoginSuccessful(), "Login is not successful");
	}

	@Test
	public void verifyLoginFailsWithWrongPassword() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.open();
		loginPage.login("standard_user", "wrong_password");

		Assert.assertTrue(loginPage.isErrorMessageDisplayed(),
				"Expected error message was not displayed for invalid credentials.");
	}
}
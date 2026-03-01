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

		Assert.assertTrue(loginPage.isLoginSuccessful(), "Login was not successful!");
	}

	@Test
	public void verifyLoginFailsWithWrongPassword() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.open();
		loginPage.login("standard_user", "wrong_password");

		Assert.assertFalse(loginPage.isLoginSuccessful(), "Login should have failed but succeeded!");
	}
}
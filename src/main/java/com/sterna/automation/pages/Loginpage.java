package com.sterna.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.inject.Inject;

public class Loginpage {

	private final WebDriver driver;

	@FindBy(id = "txtUserName")
	WebElement usernameField;

	@FindBy(id = "txtPwd")
	WebElement passwordField;

	@FindBy(id = "btnLogin")
	WebElement signInbtn;

	@Inject
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loadLoginPage() {
		driver.get("https://183.82.250.38:2001/hpcl_web/Signin");
	}

	public void enterUsername(String usernameText) {
		usernameField.sendKeys(usernameText);
	}

	public void enterPassword(String passwordText) {
		passwordField.sendKeys(passwordText);
	}

	public void clickSignInBtn() {
		signInbtn.click();
	}
}

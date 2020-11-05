package com.sterna.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.inject.Inject;

public class DashBoardPage {

	@SuppressWarnings("unused")
	private final WebDriver driver;

	@FindBy(css = "div#sidebar li#liConfiguration a")
	WebElement configurationMenuItem;
	
	@FindBy(xpath="//div[@id='myNavbar']")
	WebElement navigationBar;
	
	@FindBy(id="btnLogOut")
	WebElement logoutBtn;

	@Inject
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnConfigurationMenuItem() {
		configurationMenuItem.click();
	}
	
	public void clickOnLogout() {
		navigationBar.findElement(By.xpath("//a[.//*[contains(text(),'Login')]]")).click();
		logoutBtn.click();
	}
}

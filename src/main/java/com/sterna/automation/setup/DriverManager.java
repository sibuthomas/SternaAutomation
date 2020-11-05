package com.sterna.automation.setup;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {


	//protected WebDriver driver;

	protected abstract WebDriver createWebDriver() ;
	public WebDriver getWebDriver() {
		if(TLDriverFactory.getTLDriver()==null) {
			TLDriverFactory.setTLDriver(createWebDriver());
		}
		return TLDriverFactory.getTLDriver();
	}
		
	
}

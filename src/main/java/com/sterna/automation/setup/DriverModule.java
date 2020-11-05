package com.sterna.automation.setup;

import org.openqa.selenium.WebDriver;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class DriverModule extends AbstractModule{

	static ThreadLocal<WebDriver> threadLocal =new ThreadLocal<WebDriver>();
	@Override
	protected void configure() {
		bind(DriverManager.class).to(DriverImplSetup.class).asEagerSingleton();
	}
	@Provides
	public WebDriver getWebDriver(DriverManager driverManager) {
		return driverManager.getWebDriver();
	}
	

}
